package manejofechasjava;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.util.Calendar;
import java.util.Date;
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
	
	public void periodoEntreFechas(int version) {
		if(version == 7) {
			Calendar nascimiento = Calendar.getInstance();
			Calendar actual = Calendar.getInstance();
			
			nascimiento.set(1991,0,21);
			actual.set(2017,1,04);
			
			int anios = 0;
			while(nascimiento.before(actual)) {
				nascimiento.add(Calendar.YEAR, 1);
				if(nascimiento.before(actual)) {
					anios++;
				}
			}
			System.out.println("Versión " + version + " de Java seria:" + anios + " años");
		} else if(version == 8) {
			LocalDate nascimiento = LocalDate.of(1991, 1, 21);
			LocalDate actual = LocalDate.now();
			
			Period periodo = Period.between(nascimiento, actual);
			System.out.println("Versión " + version + " de Java. Han transcurrido " + periodo.getYears() + " años " + periodo.getDays() + " dias desde " +
			nascimiento + " hasta la fecha " + actual);
		}
		
	}
	
	
	public void convertir(int version) throws ParseException{
		if(version == 7) {
			String fecha = "21/01/1991";
			DateFormat formateador = new SimpleDateFormat("dd/MM/yyyy");
			Date fechaConvertida = formateador.parse(fecha);
			System.out.println("Fecha convertida (con Java " + version + ") de String(" + fecha + ") a Date es: " + fechaConvertida);
			
			Date fechaActual = Calendar.getInstance().getTime();
			formateador = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss a");
			String fechaCadena = formateador.format(fechaActual);
			System.out.println("Fecha actual convertida de Date a String es " + fechaCadena);
		} else if(version == 8) {
			String fecha = "21/01/1991";
			LocalDate fechaLocal = LocalDate.parse(fecha);
			System.out.println("Fecha convertida (con Java " + version + ") de String(" + fecha + ") a Date es: " + fechaLocal);
			
		}
	}
	
	public static void main(String[] args) {
		App app = new App();
		try {
			app.verificar(8);
			app.medirTiempo(7);
			app.medirTiempo(8);
			app.periodoEntreFechas(7);
			app.periodoEntreFechas(8);
			app.convertir(7);
			app.convertir(8);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
