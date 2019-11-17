package com.mitocode.tema2;

import java.util.List;
import java.util.ArrayList;

/**
 * Clase App
 * Temario 2 - Hablar de instanceof
 * @author welto
 *
 */
public class App {
	private List canasta = new ArrayList();
	
	private void verificar(Object objeto) {
		if(objeto instanceof Fruta) {
			canasta.add(objeto);
			System.out.println("Fruta agregada " + ((Fruta)objeto).getNombre());
		} else {
			System.out.println("Elemento no permitido");
		}
	}

	public static void main(String[] args) {
		String texto = new  String("MitoCode");
		
		if(texto instanceof String){
			System.out.println("texto es una String");
		}
		
		Alumno a1 = new Alumno();
		if(a1 instanceof Alumno) {
			System.out.println("a1 es un Alumno");
		}
		
		if(a1 instanceof Persona) {
			System.out.println("a1 tambien es una Persona");
		}
		
		//Se tiene una canasta en donde solo se debe permitir ingreso de frutas.
		System.out.println("Canasta abierta, por favor ingresar SOLO FRUTAS");
		
		
		Manzana m1 = new Manzana("Roja");
		Manzana m2 = new Manzana("Verde");
		Naranja n1 = new Naranja("Naranja sin pepa");
		Galleta g1 = new Galleta("Chocolate");
		
		App app = new App();
		app.verificar(m1);
		app.verificar(m2);
		app.verificar(n1);
		app.verificar(g1);
		

	}

}
