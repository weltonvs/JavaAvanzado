package com.mitocode.patrones.estrategia;

/**
 * Clase Contexto
 * Patrón Estrategia
 * Es la parte contexto del patrón estrategia.
 * @author weltonvs
 */
public class Contexto {
	
	private IEstrategia estrategia;
	
	public Contexto(IEstrategia estrategia) {
		
		this.estrategia = estrategia;
	}
	
	public void ejecutar() {
		this.estrategia.analizar();
	}
}
