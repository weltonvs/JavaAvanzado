package com.mitocode.javaee.ejemploaplicativo;
/**
 * Clase Banco
 * Ejemplo de un aplicativo del video 34 del curso de JavaEE de MitoCode.
 * @author weltonvs
 */
public class Banco {
	private Persona per1;
	private Persona per2;
	private Persona per3;
	
	
	/**
	 * Método constructor del Banco con tres párametros.
	 * @param per1
	 * @param per2
	 * @param per3
	 */
	public Banco(Persona per1, Persona per2, Persona per3) {
		super();
		this.per1 = per1;
		this.per2 = per2;
		this.per3 = per3;
	}

	/**
	 * Método que devuelve la persona 1.
	 * @return
	 */
	public Persona getPer1() {
		return per1;
	}
	
	/**
	 * Método que modifica persona 1.
	 * @param per1
	 */
	public void setPer1(Persona per1) {
		this.per1 = per1;
	}
	
	/**
	 * Método que devuelve la persona 2.
	 * @return
	 */
	public Persona getPer2() {
		return per2;
	}
	
	/**
	 * Método que modifica persona 2.
	 * @param per2
	 */
	public void setPer2(Persona per2) {
		this.per2 = per2;
	}
	
	/**
	 * Método que devuelve la persona 3.
	 * @return
	 */
	public Persona getPer3() {
		return per3;
	}
	
	/**
	 * Método que modifica persona 3.
	 * @param per3
	 */
	public void setPer3(Persona per3) {
		this.per3 = per3;
	}
	
	
}
