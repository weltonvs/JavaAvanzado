package com.mitocode.patrones.estrategia;

/**
 * Clase AntivirusAvanzado que hereda de AnalisisAvanzado.
 * Patrón Estrategia
 * Es la parte de la Implementación de la Estrategia Concreta del patrón estrategia.
 * @author weltonvs
 */
public class AntivirusAvanzado extends AnalisisAvanzado{

	@Override
	public void iniciar() {
		System.out.println("Antivirus Avanzado - Analisis simple iniciado");
		
	}

	@Override
	public void analizarMemoria() {
		try {
			System.out.println("Analizando memoria RAM...");
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
	}

	@Override
	public void analizarKeyLoggers() {
		try {
			System.out.println("Analizando en busca de Keyloggers...");
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
	}

	@Override
	public void analizarRootKits() {
		try {
			System.out.println("Analizando en busca de RootKits...");
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
	}

	@Override
	public void descomprimirZip() {
		try {
			System.out.println("Analizando archivos Zip...");
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
	}

	@Override
	public void detener() {
		System.out.println("Antivirus Avanzado - Analisis simple terminado");
		
	}

	
}
