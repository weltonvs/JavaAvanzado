package com.mitocode.patrones.observador;

public class PesoMXObservador extends Observador{
	

	private double valorCambio = 19.07;
	
	public PesoMXObservador(Sujeto sujeto) {
		
		this.sujeto = sujeto;
		this.sujeto.agregar(this);
	}
	
	@Override
	public void actualizar() {
		System.out.println("MX: " + (sujeto.getEstado() * valorCambio));
		
	}
}
