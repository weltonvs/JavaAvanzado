package manejofechasjava;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Calendar;
/**
 * Clase App
 * Manejo de fechas en java.
 * @author weltonvs
 */
public class App {

	public void verificar(int version) {
		if(version == 7) {
			Calendar fecha1 = Calendar.getInstance();
			Calendar fecha2 = Calendar.getInstance();
			fecha1.set(1991, 0, 21);
			System.out.println(fecha1.after(fecha2));
		} else if(version == 8) {
			LocalDate fecha1 = LocalDate.of(1991, 01, 21);
			LocalDate fecha2 = LocalDate.now();
			System.out.println(fecha1.isAfter(fecha2));
			System.out.println(fecha1.isBefore(fecha2));
			
			LocalTime tiempo1 = LocalTime.of(22, 30, 50);
			LocalTime tiempo2 = LocalTime.now();
			System.out.println(tiempo1.isAfter(tiempo2));
			System.out.println(tiempo1.isBefore(tiempo2));
			
			LocalDateTime fechaTiempo1 = LocalDateTime.of(1991,1,21,22, 30, 50);
			LocalDateTime fechaTiempo2 = LocalDateTime.now();
			System.out.println(fechaTiempo1.isAfter(fechaTiempo2));
			System.out.println(fechaTiempo1.isBefore(fechaTiempo2));
		}
	}
	
	public void medirTiempo(int version) throws InterruptedException{
		if(version == 7) {
			long ini = System.currentTimeMillis();
			Thread.sleep(1000);
			long fin = System.currentTimeMillis();
			System.out.println(fin - ini);
		} else if (version == 8) {
			Instant ini = Instant.now();
			Thread.sleep(1000);
			Instant fin = Instant.now();
			System.out.println(Duration.between(ini, fin).toMillis());
		}
	}
	
	public static void main(String[] args) {
		App app = new App();
		try {
			app.verificar(8);
			app.medirTiempo(7);
			app.medirTiempo(8);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
