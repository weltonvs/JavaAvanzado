package com.mitocode.patrones.observador;

public abstract class Observador {
	protected Sujeto sujeto;
	public abstract void actualizar();
}
