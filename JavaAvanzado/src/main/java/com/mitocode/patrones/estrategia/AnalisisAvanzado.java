package com.mitocode.patrones.estrategia;


/**
 * Clase abstracta AnalisisAvanzado que implementa el interfaz IEstrategia.
 * Patrón Estrategia
 * Es la parte de la Estrategia Concreta del patrón estrategia.
 * @author weltonvs
 */
public abstract class AnalisisAvanzado implements IEstrategia {

	@Override
	public void analizar() {
		iniciar();
		analizarMemoria();
		analizarKeyLoggers();
		analizarRootKits();
		descomprimirZip();
		detener();		
	}
	
	public abstract void iniciar();
	public abstract void analizarMemoria();
	public abstract void analizarKeyLoggers();
	public abstract void analizarRootKits();
	public abstract void descomprimirZip();
	public abstract void detener();

	
}
