package com.mitocode.javaee.colecciones.avanzado;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenarColecciones {

	public static void main(String[] args) {
		List<Integer> listaEnteros = new ArrayList<>();
		listaEnteros.add(1);
		listaEnteros.add(5);
		listaEnteros.add(3);
		
		System.out.println("Imprimir lista de enteros si ordenar");
		for(Integer elemento: listaEnteros) {
			System.out.println(elemento);
		}
		System.out.println("Ordenar la lista de enteros");
		Collections.sort(listaEnteros);
		for(Integer elemento: listaEnteros) {
			System.out.println(elemento);
		}
		System.out.println("Para ordenar la lista de enteros al revés");
		Collections.reverse(listaEnteros);
		for(Integer elemento: listaEnteros) {
			System.out.println(elemento);
		}
	}

}
