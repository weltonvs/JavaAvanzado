package com.mitocode.tema6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Clase de prueba del tema 6.
 * Ordenando Colecciones en Java.
 * @author weltonvs
 */
public class App {

	public static void main(String[] args) {
		List<Integer> listaEntero = new ArrayList<>();
		listaEntero.add(25);
		listaEntero.add(10000);
		listaEntero.add(1);
		System.out.println("*** Lista de Enteros ***");
		System.out.println("Lista sin ordenar " + listaEntero);
		//Para ordenar la lista se hace uso del sort de Colletions
		Collections.sort(listaEntero);
		System.out.println("Lista ordenada " + listaEntero);
		
		List<String> listaString = new ArrayList<>();
		listaString.add("Welton");
		listaString.add("Lucia");
		listaString.add("Joao");		
		System.out.println("*** Lista de Strings ***");
		System.out.println("Lista sin ordenar " + listaString);
		//Para ordenar la lista se hace uso del sort de Colletions
		Collections.sort(listaString);
		System.out.println("Lista ordenada " + listaString);
		
		List<Persona> listaPersonas = new ArrayList<>();
		listaPersonas.add(new Persona(1,"Welton",25));
		listaPersonas.add(new Persona(2,"Lucia",24));
		listaPersonas.add(new Persona(3,"Joao",2));		
		System.out.println("*** Lista de Personas ***");
		System.out.println("Lista sin ordenar");
		for(Persona elemento: listaPersonas) {
			System.out.println(elemento.toString());
		}
	}

}
