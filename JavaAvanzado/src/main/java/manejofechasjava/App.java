package manejofechasjava;

import java.util.Date;

/**
 * Clase App
 * Manejo de fechas en java.
 * @author weltonvs
 */
public class App {

	public static void main(String[] args) {
		Date fecha = new Date();
		int anio = fecha.getYear() + 1900;//Hay que sumar 1900 debido a implementación de la api date de java.
		int dia = fecha.getDate();//Devuelve el dia.
		System.out.println("Año:" + anio);
		System.out.println("Dia:" + dia);
		//Se puede observar que los métodos están desactualizados.
		//Eso es porque futuramente se va dejar de utilizar por parte de la 
		//API de java.
	}

}
