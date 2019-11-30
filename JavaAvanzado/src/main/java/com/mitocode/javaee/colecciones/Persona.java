package com.mitocode.javaee.colecciones;
/**
 * Clase Persona
 * Ejemplo de un aplicativo del video 34 del curso de JavaEE de MitoCode.
 * @author weltonvs
 */
public class Persona {
	private int cuenta;
	private String nombre;
	private double monto;
	
	
	/**
	 * Constructor con tres parámetros de entrada.
	 * @param cuenta
	 * @param nombre
	 * @param monto
	 */
	public Persona(int cuenta, String nombre, double monto) {		
		this.cuenta = cuenta;
		this.nombre = nombre;
		this.monto = monto;
	}
	
	/**
	 * Método que devuelve el número de la cuenta.
	 * @return int
	 */
	public int getCuenta() {
		return cuenta;
	}
	
	/**
	 * Método que modifica el número de la cuenta.
	 * @param cuenta int
	 */
	public void setCuenta(int cuenta) {
		this.cuenta = cuenta;
	}
	
	/**
	 * Método que devuelve el nombre de la persona.
	 * @return
	 */
	public String getNombre() {
		return nombre;
	}
	
	/**
	 * Método que modifica el nombre de la persona.
	 * @param nombre String
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	/**
	 * Método que devuelve el monto de la cuenta.
	 * @return double
	 */
	public double getMonto() {
		return monto;
	}
	
	/**
	 * Método que modifica el monto de la cuenta.
	 * @param monto
	 */
	public void setMonto(double monto) {
		this.monto = monto;
	}
	
	
}
