package com.sandrini.nasa.command;

import com.sandrini.nasa.exception.CommandNotFoundException;

/**
 * O enum {@code CommandType} representa os tipos de comandos permitidos ao robo
 * <ul>
 *     <li><kbd><strong>LEFT</strong></kbd>: Indica que o robo deve rotacionar em seu proprio eixo 90 graus para a esquerda.</li>
 *     <li><kbd><strong>RIGHT</strong></kbd>: Indica que o robo deve rotacionar em seu proprio eixo 90 graus para a direita.</li>
 *     <li><kbd><strong>MOVE</strong></kbd>: Indica que o robô deve deslocar-se uma posição para frente.</li>
 * </ul>
 * @author isandrini
 *
 */
public enum CommandType {
	LEFT(new TurnLeftCommand()), 
	RIGHT(new TurnRightCommand()), 
	MOVE(new MoveCommand());

	private Command command;

	private CommandType(Command command) {
		this.command = command;
	}

	public Command getCommand() {
		return command;
	}

	/**
	 * Retorna um comando
	 * @param command string que representa o comando passado ao robo
	 * @return retorna um {@code CommandType} que representa o camando passado como parâmetro
	 * @throws CommandNotFoundException é lançada se o comando for inválido
	 */
	public static CommandType getByCommand(String command) throws CommandNotFoundException {
		CommandType commandType = null;
		for (CommandType type : values()) {
			if (type.getAbbreviation().equals(command)) {
				commandType = type;
			}
		}

		if (commandType == null) {
			throw new CommandNotFoundException();
		}

		return commandType;
	}
	
	/**
	 * Retorna a abreviação do enum, representada pela primeira letra do nome
	 * @return abreviacao do enum
	 */
	public String getAbbreviation() {
		return String.valueOf(this.toString().charAt(0));
	}
	

}
