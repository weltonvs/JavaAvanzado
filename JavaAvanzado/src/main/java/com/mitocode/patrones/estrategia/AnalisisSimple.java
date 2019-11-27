package com.mitocode.patrones.estrategia;

/**
 * Clase abstracta AnalisisSimple que implementa el interfaz IEstrategia.
 * Patrón Estrategia
 * Es la parte de la Estrategia Concreta del patrón estrategia.
 * @author weltonvs
 */
public abstract class AnalisisSimple implements IEstrategia{
	
	public void analizar() {
		iniciar();
		saltarZip();
		detener();
	}
	
	public abstract void iniciar();
	public abstract void saltarZip();
	public abstract void detener();

}
