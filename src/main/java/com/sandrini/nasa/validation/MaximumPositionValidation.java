package com.sandrini.nasa.validation;

import com.sandrini.nasa.exception.InvalidPositionException;

/**
 * Classe que valida a maior posição que o robo pode se mover
 * @author isandrini
 *
 */
public class MaximumPositionValidation implements MovementValidator {

	private static final int MAX_SIZE = 4;
	
	public int validate(int position) throws InvalidPositionException {
		int validPosition = position;
		
		if(validPosition > MAX_SIZE) {
			throw new InvalidPositionException();
		}
		
		return validPosition;
	}

}
