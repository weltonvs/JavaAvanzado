package com.mitocode.patrones.estrategia;

/**
 * Clase App
 * Patrón Estrategia
 * Utilizado para probar el patrón estrategia.
 * @author weltonvs
 */
public class App {
	
	public static void main(String[] args) {
		//Utilizando una estrategia concreta AntivirusSimple.
		Contexto contexto = new Contexto(new AntivirusSimple());
		contexto.ejecutar();
		
		//Utilizando una estrategia concreta AntivirusAvanzado
		Contexto contexto2 = new Contexto(new AntivirusAvanzado());
		contexto2.ejecutar();
	}
}
