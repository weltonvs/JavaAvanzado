package com.mitocode.patrones.observador;

/**
 * Clase AppObservador
 * Ejemplo de uso de un Patrón Observador
 * @author weltonvs
 *
 */
public class AppObservador {

	public static void main(String[] args) {
		Sujeto sujeto = new Sujeto();
		
		new SolObservador(sujeto);
		new PesoARGObservador(sujeto);
		new PesoMXObservador(sujeto);
		
		System.out.println("Si desea cambiar 10 dólares obtendrá : ");
		sujeto.setEstado(10);
		System.out.println("----------------------");
		System.out.println("Si desea cambiar 100 dólares obtendra :");
		sujeto.setEstado(100);

	}

}
