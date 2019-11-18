package com.mitocode.tema4.wildcards;
/**
 * Clase padre Persona.
 * @author weltonvs
 */
public class Persona {

	private String nombre;

	/**
	 * Método constructor de la clase Persona
	 * @param nombre String
	 */
	public Persona(String nombre) {
		super();
		this.nombre = nombre;
	}

	/**
	 * Método getNombre
	 * @return String
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * Método setNombre
	 * @param nombre String
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
}
