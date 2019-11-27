package com.mitocode.patrones.estrategia;

/**
 * Clase AntivirusSimple que hereda de AnalisisSimple.
 * Patrón Estrategia
 * Es la parte de la Implementación de la Estrategia Concreta del patrón estrategia.
 * @author weltonvs
 */
public class AntivirusSimple extends AnalisisSimple {
	

	@Override
	public void iniciar() {
		System.out.println("Antivirus Simple - Análisis simple iniciado");
		
	}

	@Override
	public void saltarZip() {
		try {
			System.out.println("Analizando...");
			Thread.sleep(2500);
			System.out.println("No se pudo analizar con extensión '.Zip'");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
	}

	@Override
	public void detener() {
		System.out.println("Antivirus Simple - Análisis simple finalizado");
		
	}
}
