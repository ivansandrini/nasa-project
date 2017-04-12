package com.sandrini.nasa;

import com.sandrini.nasa.exception.InvalidPositionException;
import com.sandrini.nasa.movement.OrientationType;

/**
 * Classe que representa o objeto robo com sua coordenada e orientação
 * @author isandrini
 *
 */
public class Robot {
	private int coordinateX;

	private int coordinateY;

	private OrientationType orientation;

	/**
	 * Construtor padrão conforme orientação no exercicio:
	 * O robô inicia na coordenada (0,0,N);
	 */
	public Robot() {
		this.coordinateX = 0;
		this.coordinateY = 0;
		this.orientation = OrientationType.NORTH;
	}

	public int getCoordinateX() {
		return coordinateX;
	}

	public void setCoordinateX(int coordinateX) {
		this.coordinateX = coordinateX;
	}

	public int getCoordinateY() {
		return coordinateY;
	}

	public void setCoordinateY(int coordinateY) {
		this.coordinateY = coordinateY;
	}

	public OrientationType getOrientation() {
		return orientation;
	}

	public void setOrientation(OrientationType orientation) {
		this.orientation = orientation;
	}

	/**
	 * Realiza o movimeto do robo a partir da sua orientação
	 * @throws InvalidPositionException
	 */
	public void move() throws InvalidPositionException {
		orientation.getMovement().move(this);
	}
	
	/**
	 * Recupera a posição do robô
	 * @return posição do robo
	 */
	public String getPosition() {
		return String.format("(%s,%s,%s)", this.coordinateX, this.coordinateY, this.orientation.getAbbreviation());
	}

}
