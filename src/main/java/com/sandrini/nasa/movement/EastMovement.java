package com.sandrini.nasa.movement;

import com.sandrini.nasa.Robot;
import com.sandrini.nasa.exception.InvalidPositionException;
import com.sandrini.nasa.validation.MaximumPositionValidation;

/**
 * A classe {@code EastMovement} é implementação da interface
 * {@code Movement} deve mover o robo para a posição leste.
 *
 * @author isandrini
 *
 */
public class EastMovement implements Movement {

	public void move(Robot robot) throws InvalidPositionException {
		MaximumPositionValidation validation = new MaximumPositionValidation();
		robot.setCoordinateX(validation.validate(robot.getCoordinateX() + 1));
	}

}
