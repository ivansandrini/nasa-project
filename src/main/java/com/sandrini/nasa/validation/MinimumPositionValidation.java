package com.sandrini.nasa.validation;

import com.sandrini.nasa.exception.InvalidPositionException;

/**
 * Classe que valida a menor posição que o robo pode se mover
 * @author isandrini
 *
 */
public class MinimumPositionValidation implements MovementValidator {

	private static final int MIN_SIZE = 0;
	
	@Override
	public int validate(int position) throws InvalidPositionException {
		int validPosition = position;
		
		if(validPosition < MIN_SIZE) {
			throw new InvalidPositionException();
		}
		
		return validPosition;
	}

}
