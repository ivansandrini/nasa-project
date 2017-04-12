package com.sandrini.nasa.movement;

import com.sandrini.nasa.Robot;
import com.sandrini.nasa.exception.InvalidPositionException;
import com.sandrini.nasa.validation.MaximumPositionValidation;

/**
 * A classe {@code NorthMovement} é implementação da interface
 * {@code Movement} deve mover o robo para a posição norte.
 *
 * @author isandrini
 *
 */
public class NorthMovement implements Movement {

	public void move(Robot robot) throws InvalidPositionException {
		MaximumPositionValidation validation = new MaximumPositionValidation();
		robot.setCoordinateY(validation.validate(robot.getCoordinateY() + 1));
	}

}
