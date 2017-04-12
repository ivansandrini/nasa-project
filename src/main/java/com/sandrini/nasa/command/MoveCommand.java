package com.sandrini.nasa.command;

import com.sandrini.nasa.Robot;
import com.sandrini.nasa.exception.InvalidPositionException;

/**
 * A classe {@code MoveCommand} é implementação da interface
 * {@code Command} utilizada para indicar que o robo deve deslocar-se
 * uma posição para frente.
 *
 * @author isandrini
 *
 */
public class MoveCommand implements Command {

	public void execute(Robot robot) throws InvalidPositionException {
		robot.move();
	}

}
