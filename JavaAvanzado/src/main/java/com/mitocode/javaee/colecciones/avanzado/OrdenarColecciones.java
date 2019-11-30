package com.mitocode.javaee.colecciones.avanzado;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class OrdenarColecciones {

	public static void main(String[] args) {
		List<Persona> listaPersonas = new ArrayList<>();
		listaPersonas.add(new Persona(1, "Jaime", 25));
		listaPersonas.add(new Persona(2, "Mito", 15));
		listaPersonas.add(new Persona(3, "Code", 29));
		
		System.out.println("Colección con los datos originales");
		for(Persona elemento: listaPersonas) {
			System.out.println(elemento.getNombre());
		}
		
		//Collections.sort(listaPersonas);//Me da un error porque necesito algo con que comparar.
		Collections.sort(listaPersonas, new NombreComparador());//Despues de crear el comparador nombre lo paso como comparar la ordenación.
		System.out.println("Ordenar una colección con objetos complejos según el criterio del comparador creado.");
		for(Persona elemento: listaPersonas) {
			System.out.println(elemento.getNombre());
		}
		
		/**
		 * Se puede hacer tambien de una forma directa sin crear una clase que implementa Comparator.
		 */
		Collections.sort(listaPersonas,new Comparator<Persona>() {

			@Override
			public int compare(Persona obj1, Persona obj2) {
				
				return obj1.getEdad() - obj2.getEdad();
			}
			
		});	
		
		System.out.println("Ordenar una colección con objetos complejos según el criterio del comparador creado dentro de esa misma clase.");
		for(Persona elemento: listaPersonas) {
			System.out.println(elemento.getNombre() + "-" + elemento.getEdad());
		}
	}
}

