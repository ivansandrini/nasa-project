package com.sandrini.nasa.command;

import com.sandrini.nasa.Robot;
import com.sandrini.nasa.movement.OrientationType;

/**
 * A classe {@code TurnLeftCommand} é implementação da interface
 * {@code Command} deve rotacionar em seu proprio eixo 90 graus
 * para a esquerda.
 *
 * @author isandrini
 *
 */
public class TurnLeftCommand implements Command {

	public void execute(Robot robot) {
		if (OrientationType.NORTH.equals(robot.getOrientation())) {
			robot.setOrientation(OrientationType.WEAST);
		} else {
			robot.setOrientation(OrientationType.getByOrdinal(robot.getOrientation().ordinal() - 1));
		}
	}

}
