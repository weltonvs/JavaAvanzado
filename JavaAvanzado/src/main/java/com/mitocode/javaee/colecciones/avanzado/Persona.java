package com.mitocode.javaee.colecciones.avanzado;

public class Persona {
	private int id;
	private String nombre;
	private int edad;
	/**
	 * Método constructor.
	 * @param id
	 * @param nombre
	 * @param edad
	 */
	public Persona(int id, String nombre, int edad) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.edad = edad;
	}
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public int getEdad() {
		return edad;
	}
	
	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	
	
	
}
