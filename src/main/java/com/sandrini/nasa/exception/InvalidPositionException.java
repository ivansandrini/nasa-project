package com.sandrini.nasa.exception;

/**
 * A classe {@code InvalidPositionException} é uma subclasse de
 * {@code Exception} utilizada para indicar que a posição enviada
 * ao robo está fora da area especificada no desafio 5x5.
 * @author isandrini
 *
 */
public class InvalidPositionException extends Exception {

	private static final long serialVersionUID = -7375383217214669857L;

	/**
	 * Cria uma InvalidPositionException.
	 */
	public InvalidPositionException() {
		super();
	}
	
	/**
	 * Cria uma InvalidPositionException com uma mensagem especifica.
	 * 
	 * @param mensagem
	 */
	public InvalidPositionException(String message) {
		super(message);
	}
	
	/**
	 * Cria Uma InvalidPositionException com uma mensagem e causa especifica.
	 * 
	 * @param mensagem
	 * @param causa
	 */
	public InvalidPositionException(String message, Exception cause) {
		super(message, cause);
	}

}
