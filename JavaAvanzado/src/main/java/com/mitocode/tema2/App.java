package com.mitocode.tema2;
/**
 * Clase App
 * Temario 2 - Hablar de instanceof
 * @author welto
 *
 */
public class App {

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

	}

}
