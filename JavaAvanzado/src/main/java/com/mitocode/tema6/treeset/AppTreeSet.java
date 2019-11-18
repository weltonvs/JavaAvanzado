package com.mitocode.tema6.treeset;

import java.util.Set;
import java.util.TreeSet;

/**
 * Clase AppTreeSet
 * Utilizado para hacer pruebas con la colección TreeSet.
 * @author weltonvs
 */
public class AppTreeSet {

	public static void main(String[] args) {
		//Colección de elementos simples como un String.
		Set<String> listaString = new TreeSet<>();
		listaString.add("MitoCode");
		listaString.add("Mito");
		listaString.add("Code");
		listaString.add("Mito");
		listaString.add("Jaime");
		listaString.add("AAA");
		
		for (String elemento : listaString) {
			System.out.println(elemento);
		}
		System.out.println("Se observa que se preocupa por el orden de los elementos y tampoco permite duplicados");

		//Colección de elementos complejos como una Persona.
				Set<Persona> listaPersonas = new TreeSet<>();
				listaPersonas.add(new Persona(1,"MitoCode",22));
				listaPersonas.add(new Persona(2,"Code",23));
				listaPersonas.add(new Persona(3,"Mito",24));
				listaPersonas.add(new Persona(4,"Jaime",25));
				listaPersonas.add(new Persona(5,"Mito",26));
				listaPersonas.add(new Persona(6,"AAA",27));
				listaPersonas.add(new Persona(1,"MitoCode",22));
				for (Persona elemento : listaPersonas) {
					System.out.println(elemento.toString());
				}
				//System.out.println("Se observa que se preocupa por el orden de los elementos y tampoco permite duplicados");

	}

}
