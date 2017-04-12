package com.sandrini.nasa.command;

import com.sandrini.nasa.Robot;
import com.sandrini.nasa.exception.InvalidPositionException;

/**
 * Interface que representa um comando enviado ao robo
 * @author isandrini
 *
 */
public interface Command {

	public void execute(Robot robot) throws InvalidPositionException;

}
