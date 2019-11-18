package com.mitocode.tema6.linkedhashset;

import java.util.LinkedHashSet;
import java.util.Set;

/**
 * Clase de Prueba AppSet
 * Probar el funcionamiento de la estructura de colección HashSet de Java.
 * @author weltonvs
 */
public class AppLinkedHashSet {

	public static void main(String[] args) {
		//Colección de elmentos simples como un String.
		Set<String> listaString = new LinkedHashSet<>();
		listaString.add("MitoCode");
		listaString.add("Mito");
		listaString.add("Code");
		listaString.add("MitoCode");
		System.out.println("Colección de elementos simples como String");
		for (String elemento : listaString) {
			System.out.println(elemento);
		}
		
		//Colección de elmentos mas complejos como una Persona.
		Set<Persona> listaPersonas = new LinkedHashSet<>();
		listaPersonas.add(new Persona(1,"MitoCode",22));
		listaPersonas.add(new Persona(2,"Mito",22));
		listaPersonas.add(new Persona(3,"Code",22));
		listaPersonas.add(new Persona(1,"MitoCode",22));
		listaPersonas.add(new Persona(1,"AAA",20));
		
		System.out.println("Colección de elementos complejos como una Persona");
		for (Persona elemento : listaPersonas) {
			System.out.println(elemento.toString());
		}
	}
}
