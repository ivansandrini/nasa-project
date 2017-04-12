package com.sandrini.nasa.exception;

/**
 * A classe {@code CommandNotFoundException} é uma subclasse de
 * {@code Exception} utilizada para indicar que um comando enviado
 * ao robo não existe
 * @author isandrini
 *
 */
public class CommandNotFoundException extends Exception {

	private static final long serialVersionUID = 5426568245703733410L;

	/**
	 * Cria uma CommandNotFound.
	 * 
	 * @param mensagem
	 */
	public CommandNotFoundException() {
		super();
	}
	
	/**
	 * Cria uma CommandNotFound com uma mensagem especifica.
	 * 
	 * @param mensagem
	 */
	public CommandNotFoundException(String message) {
		super(message);
	}
	
	/**
	 * Cria Uma CommandNotFound com uma mensagem e causa especifica.
	 * 
	 * @param mensagem
	 * @param causa
	 */
	public CommandNotFoundException(String message, Exception cause) {
		super(message, cause);
	}

}
