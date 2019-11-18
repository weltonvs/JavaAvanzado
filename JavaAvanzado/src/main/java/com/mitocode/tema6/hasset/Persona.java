package com.mitocode.tema6.hasset;

public class Persona {
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
	/**
	 * Método hashCode de la clase Persona.
	 */
	@Override
	public String toString() {
		return "Persona [id=" + id + ", nombre=" + nombre + ", edad=" + edad + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + edad;
		result = prime * result + id;
		result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
		return result;
	}
	/**
	 * Método equals de la clase Persona.
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Persona other = (Persona) obj;
		if (edad != other.edad)
			return false;
		if (id != other.id)
			return false;
		if (nombre == null) {
			if (other.nombre != null)
				return false;
		} else if (!nombre.equals(other.nombre))
			return false;
		return true;
	}
	
}
