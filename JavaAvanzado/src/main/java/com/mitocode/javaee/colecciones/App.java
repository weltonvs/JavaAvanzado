package com.mitocode.javaee.colecciones;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class App {

	public static void main(String[] args) {
		
		List<String> lista = new ArrayList<>();
		lista.add("MitoCode");
		lista.add("Welton Vieira");
		lista.add("Aprende facil");
		for(String elemento: lista) {
			System.out.println(elemento);
		}
		
		//Para recorrer una lista hay que utilzar el interfaz Interator. No confudir Inteble (es un interfaz)
		// e Interator es un objeto para interar en las listas.
		Iterator<String> iterador = lista.iterator();
		
		while(iterador.hasNext()) {
			System.out.println(iterador.next());
		}
		System.out.println("------------------------------------------------");
		//Para la clase persona utilizamos.
		Persona persona = new Persona(1, "Welton", 2000);
		Persona persona2 = new Persona(2, "Lucia", 45000);
		Persona persona3 = new Persona(3, "Joao", 50000);
		
		List<Persona> listaPersonas = new ArrayList<>();
		listaPersonas.add(persona);
		listaPersonas.add(persona2);
		listaPersonas.add(persona3);
		//Crea un iterador tambien para la lista de personas.
		Iterator<Persona> iteradorPersonas = listaPersonas.iterator();
		
		for(Persona elemento: listaPersonas) {
			System.out.println(elemento.getNombre());
		}
		
		//Utilizando el iteradorPersona.
		while(iteradorPersonas.hasNext()) {
			System.out.println(iteradorPersonas.next().getNombre());
		}

	}

}
