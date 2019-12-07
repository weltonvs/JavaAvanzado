package com.mitocode.patrones.observador;

/**
 * Clase PesoARGObservador
 * @author weltonvs
 *
 */
public class PesoARGObservador extends Observador{
	
	private double valorCambio = 29.86;
	
	public PesoARGObservador(Sujeto sujeto) {
		
		this.sujeto = sujeto;
		this.sujeto.agregar(this);
	}
	
	@Override
	public void actualizar() {
		System.out.println("ARG: " + (sujeto.getEstado() * valorCambio));
		
	}

}
