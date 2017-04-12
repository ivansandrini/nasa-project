package com.sandrini.nasa.movement;

import com.sandrini.nasa.Robot;
import com.sandrini.nasa.exception.InvalidPositionException;
import com.sandrini.nasa.validation.MinimumPositionValidation;

/**
 * A classe {@code SouthMovement} é implementação da interface
 * {@code Movement} deve mover o robo para a posição sul.
 *
 * @author isandrini
 *
 */
public class SouthMovement implements Movement {

	public void move(Robot robot) throws InvalidPositionException {
		MinimumPositionValidation validation = new MinimumPositionValidation();
		robot.setCoordinateY(validation.validate(robot.getCoordinateY() - 1));
	}

}