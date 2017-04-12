package com.sandrini.nasa.movement;

import com.sandrini.nasa.Robot;
import com.sandrini.nasa.exception.InvalidPositionException;

/**
 * Interface que representa um movimento do robo
 * @author isandrini
 *
 */
public interface Movement {
	void move(Robot robot) throws InvalidPositionException;
}
