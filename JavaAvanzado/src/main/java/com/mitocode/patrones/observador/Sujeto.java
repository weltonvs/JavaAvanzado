package com.mitocode.patrones.observador;

import java.util.ArrayList;
import java.util.List;

/**
 * Clase Sujeto
 * Ejemplo del Patrón Observador.
 * Esta clase cumple el papel del Sujeto
 * @author welto
 *
 */
public class Sujeto {
	private List<Observador> observadores = new ArrayList<>();
	private int estado;
	
	public int getEstado() {
		return estado;
	}
	
	public void setEstado(int estado) {
		this.estado = estado;
		notificarTodosObservadores();
	}
	
	public void agregar(Observador observador) {
		observadores.add(observador);
	}
	
	public void notificarTodosObservadores() {
		for(Observador observador: observadores) {
			observador.actualizar();
		}
	}
}
