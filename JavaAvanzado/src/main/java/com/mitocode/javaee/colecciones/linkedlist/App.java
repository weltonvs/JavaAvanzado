package com.mitocode.javaee.colecciones.linkedlist;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/**
 * Ejemplo de una colección del tipo LinkedList
 * @author weltonvs
 */
public class App {

	public static void main(String[] args) {
		
		List<Integer> lista = new LinkedList<>();
		lista.add(1);
		lista.add(2);
		lista.add(3);
		System.out.println("El tamanño de la lista es " + lista.size());
		System.out.println("El primer elemento de la lista es " + lista.get(0));
		System.out.println("El último elemento de la lista es " + lista.get(lista.size()-1) );
		
		Iterator<Integer> iteradorLista = lista.iterator();
		
		while(iteradorLista.hasNext()) {
			System.out.println(iteradorLista.next().intValue());
		}

	}

}
