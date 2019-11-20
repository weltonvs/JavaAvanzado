package manejofechasjava;

import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 * Clase App
 * Manejo de fechas en java.
 * @author weltonvs
 */
public class App {

	public static void main(String[] args) {
		Calendar calendario = new GregorianCalendar(2015,Calendar.DECEMBER,25);
		int anio = calendario.get(calendario.YEAR);
		
		System.out.println(anio);
	}

}
