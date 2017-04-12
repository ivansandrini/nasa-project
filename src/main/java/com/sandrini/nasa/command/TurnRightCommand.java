package com.sandrini.nasa.command;

import com.sandrini.nasa.Robot;
import com.sandrini.nasa.movement.OrientationType;

/**
 * A classe {@code TurnRightCommand} é implementação da interface
 * {@code Command} deve rotacionar em seu proprio eixo 90 graus
 * para a direita.
 *
 * @author isandrini
 *
 */
public class TurnRightCommand implements Command {

	public void execute(Robot robot) {
		if (OrientationType.WEAST.equals(robot.getOrientation())) {
			robot.setOrientation(OrientationType.NORTH);
		} else {
			robot.setOrientation(OrientationType.getByOrdinal(robot.getOrientation().ordinal() + 1));
		}
	}
}
