package com.sandrini.nasa.movement;

/**
 * O enum {@code OrientationType} representa os tipos de movimentos permitidos ao robo
 * <ul>
 *     <li><kbd><strong>NORTH</strong></kbd>: Indica que o robo deve deslocar-se uma posição ao norte.</li>
 *     <li><kbd><strong>EAST</strong></kbd>: Indica que o robo deve deslocar-se uma posição ao leste.</li>
 *     <li><kbd><strong>SOUTH</strong></kbd>: Indica que o robo deve deslocar-se uma posição ao sul.</li>
 *     <li><kbd><strong>WEAST</strong></kbd>: Indica que o robo deve deslocar-se uma posição ao oeste.</li>
 * </ul>
 * @author isandrini
 *
 */
public enum OrientationType {
	NORTH(new NorthMovement()), 
	EAST(new EastMovement()), 
	SOUTH(new SouthMovement()), 
	WEAST(new WestMovement());

	private Movement movement;

	OrientationType(Movement movement) {
		this.movement = movement;
	}

	/**
	 * Retorna 
	 * @param ordinal ordinal do enum
	 * @return retorna um {@code OrientationType}
	 */
	public static OrientationType getByOrdinal(final int ordinal) {
		OrientationType orientation = null;
		for (OrientationType value : values()) {
			if (value.ordinal() == ordinal) {
				orientation = value;
			}
		}

		return orientation;
	}

	public Movement getMovement() {
		return this.movement;
	}
	
	/**
	 * Retorna a abreviação do enum, representada pela primeira letra do nome
	 * @return abreviacao do enum
	 */
	public String getAbbreviation() {
		return String.valueOf(this.toString().charAt(0));
	}
}
