package com.mitocode.tema4.wildcards;

import java.util.ArrayList;
import java.util.List;

/**
 * Clase AppWildCards
 * Utilizado para probar el uso de los comodines de genericidad.
 * @author weltonvs
 */
public class AppWildCards {
	/**
	 * Ejemplo del uso del comodin UpperBoundend <? extends Persona>
	 * @param lista
	 */
	public void listarUpperBounded(List<? extends Persona> lista) {
		for(Persona a: lista) {
			System.out.println(a.getNombre());
		}
	}

	public static void main(String[] args) {
		AppWildCards aw = new AppWildCards();
		
		Alumno a11 = new Alumno("MitoCode");
		Alumno a12 = new Alumno("Jaime");
		Alumno a13 = new Alumno("Mito");
		
		List<Alumno> lista = new ArrayList<>();
		lista.add(a11);
		lista.add(a12);
		lista.add(a13);
		
		aw.listarUpperBounded(lista);

	}

}
