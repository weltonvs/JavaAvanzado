package com.mitocode.tema4;
/**
 * Clase Clase
 * Para probasr el uso de los genéricos.
 * @author weltonvs
 */
public class Clase<T> {
	private T objeto;

	/**
	 * Método constructor de la clase genérica Clase
	 * @param objeto T - Tipo genérico.
	 */
	public Clase(T objeto) {
		super();
		this.objeto = objeto;
	}
	
	/**
	 * Método que muestra el tipo de objeto utilizado.
	 */
	public void mostrarTipo() {
		System.out.println("T es un: " + objeto.getClass().getName());
	}
	

}
