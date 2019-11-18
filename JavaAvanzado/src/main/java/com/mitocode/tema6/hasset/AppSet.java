package com.mitocode.tema6.hasset;

import java.util.HashSet;
import java.util.Set;

/**
 * Clase de Prueba AppSet
 * Probar el funcionamiento de la estructura de colección HashSet de Java.
 * @author weltonvs
 */
public class AppSet {

	public static void main(String[] args) {
		Set<String> listaString = new HashSet<>();
		listaString.add("MitoCode");
		listaString.add("Mito");
		listaString.add("Code");
		listaString.add("MitoCode");
		
		for (String elemento : listaString) {
			System.out.println(elemento);
		}
	}

}
