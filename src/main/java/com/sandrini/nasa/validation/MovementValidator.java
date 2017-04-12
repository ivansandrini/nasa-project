package com.sandrini.nasa.validation;

import com.sandrini.nasa.exception.InvalidPositionException;

/**
 * Interface que valida o movimento do robo
 * @author isandrini
 *
 */
public interface MovementValidator {
	int validate(int position) throws InvalidPositionException;
}
