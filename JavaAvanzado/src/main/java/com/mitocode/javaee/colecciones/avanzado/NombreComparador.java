package com.mitocode.javaee.colecciones.avanzado;

import java.util.Comparator;

public class NombreComparador implements Comparator<Persona> {

	/**
	 * Método que efectuará la comparación de dos objetos procedientes de una colección
	 * Valor positivo es porque obj1 > obj2.
	 * Valor negativo es porque obj1 < obj2.
	 * Valor cero es porque obj1 = obj2.
	 */
	@Override
	public int compare(Persona obj1, Persona obj2) {
		
		return obj1.getNombre().compareTo(obj2.getNombre());
	}
}

