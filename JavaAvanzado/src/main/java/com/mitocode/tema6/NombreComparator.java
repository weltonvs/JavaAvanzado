package com.mitocode.tema6;

import java.util.Comparator;

/**
 * Clase NombreComparator
 * Esa clase es una imprementación de la interfaz Comparator.
 * @author weltonvs
 */
public class NombreComparator implements Comparator<Persona> {

	/**
	 * Método compare de la clase Comparator.
	 * Se esta subribiendo el método original.
	 * Si obj1 > obj2 => positivo, obj1 < obj2 => negativo, obj1 = obj2 => cero.
	 */
	@Override
	public int compare(Persona obj1, Persona obj2) {
		
		return obj1.getNombre().compareTo(obj2.getNombre());
	}
	
}
