package com.mitocode.tema6;

public class Persona implements Comparable<Persona>{
	private int id;
	private String nombre;
	private int edad;
	/**
	 * Método constructor de Persona.
	 * @param id int
	 * @param nombre String
	 * @param edad int
	 */
	public Persona(int id, String nombre, int edad) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.edad = edad;
	}
	/**
	 * Método que devuelve el id.
	 * @return int
	 */
	public int getId() {
		return id;
	}
	/**
	 * Método que permite modificar id.
	 * @param id int
	 */
	public void setId(int id) {
		this.id = id;
	}
	/**
	 * Método que devuelve el nombre.
	 * @return String
	 */
	public String getNombre() {
		return nombre;
	}
	/**
	 * Método que permite modificar nombre
	 * @param nombre String
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	/**
	 * Método que devuelve la edad.
	 * @return int
	 */
	public int getEdad() {
		return edad;
	}
	/**
	 * Método que permite modificar la edad
	 * @param edad int
	 */
	public void setEdad(int edad) {
		this.edad = edad;
	}
	@Override
	public String toString() {
		return "Persona [id=" + id + ", nombre=" + nombre + ", edad=" + edad + "]";
	}
	@Override
	public int compareTo(Persona obj) {
		
		//return this.edad - obj.getEdad();//Utilizado para comparar enteros.
		return this.nombre.compareTo(obj.getNombre());//Para utilizar para comparar Strings.
	}
	
	
	
}
