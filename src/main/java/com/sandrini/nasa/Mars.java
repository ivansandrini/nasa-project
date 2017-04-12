package com.sandrini.nasa;

import java.util.logging.Level;
import java.util.logging.Logger;

import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

import com.sandrini.nasa.command.CommandType;
import com.sandrini.nasa.exception.CommandNotFoundException;
import com.sandrini.nasa.exception.InvalidPositionException;

/**
 * Classe de entrada do sistema que expõe o serviço rest
 * @author isandrini
 *
 */
@Path("mars")
public class Mars {
	static final Logger log = Logger.getLogger(Mars.class.getName()); 

	@Path("{commands}")
	@POST
	@Produces(MediaType.TEXT_PLAIN)
	public Response move(@PathParam("commands") String commands) {
		Response response = null;
		
		// cria o robo a cada chamada sem salvar o estado para consulta posterior
		Robot robot = new Robot();

		for (String command : commands.split("")) {
			try {
				CommandType commandType = CommandType.getByCommand(command);
				commandType.getCommand().execute(robot);
				response = Response.status(Response.Status.OK).entity(robot.getPosition()).build();
			} catch (CommandNotFoundException e) {
				log.log(Level.WARNING, "Comando não encontrado");
				response = Response.status(Status.BAD_REQUEST).entity(Status.BAD_REQUEST.getStatusCode() + " " + Status.BAD_REQUEST.getReasonPhrase()).build();
				break;
			} catch (InvalidPositionException e) {
				log.log(Level.WARNING, "Posição inválida");
				response = Response.status(Status.BAD_REQUEST).entity(Status.BAD_REQUEST.getStatusCode() + " " + Status.BAD_REQUEST.getReasonPhrase()).build();
				break;
			}
		}
		
		return response;
	}
}