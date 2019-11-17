package com.mitocode.tema3;
/**
 * Clase Conexion
 * Implementación del patron Singleton
 * @author weltonvs
 */
public class Conexion {

	private static Conexion instancia = null;
	
	public static Conexion getInstance() {
		if(instancia == null) {
			instancia = new Conexion();
		}
		return instancia;
	}
	/**
	 * Constructor privado
	 * Para que no permita creación de varias instancias.
	 */
	private Conexion() {
		
	}
}
