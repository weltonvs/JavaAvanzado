package com.mitocode.tema4.wildcards;

import java.util.ArrayList;
import java.util.List;

/**
 * Clase AppWildCards
 * Utilizado para probar el uso de los comodines de genericidad.
 * @author weltonvs
 */
public class AppWildCards {
	/**
	 * Ejemplo del uso del comodin UpperBoundend <? extends Persona>
	 * @param lista
	 */
	public void listarUpperBounded(List<? extends Persona> lista) {
		for(Persona a: lista) {
			System.out.println(a.getNombre());
		}
	}
	/**
	 * Ejemplo del uso del comodin LowerBounded <? super Alumno>
	 * Concepto hacia arriba, pero para alumno.
	 * @param lista
	 */
	public void listarLowerBoundedAlumno(List<? super Alumno> lista) {
		for(Object a: lista) {
			System.out.println(((Alumno)a).getNombre());
		}
	}
	/**
	 * Ejemplo del uso del comodin LowerBounded <? super Profesor>
	 * Concepto hacia arriba, pero para Profesor.
	 * @param lista
	 */
	public void listarLowerBoundedProfesor(List<? super Profesor> lista) {
		for(Object a: lista) {
			System.out.println(((Profesor)a).getNombre());
		}
	}
	/**
	 * Ejemplo del uso del comodin UnBounded <?>
	 * @param lista
	 */
	public void listarUnBoundedAlumno(List<?> lista) {
		for(Object a: lista) {
			System.out.println(((Alumno)a).getNombre());
		}
	}
	
	/**
	 * Ejemplo del uso del comodin UnBounded <?>	 
	 * @param lista
	 */
	public void listarUnBoundedProfesor(List<?> lista) {
		for(Object a: lista) {
			System.out.println(((Profesor)a).getNombre());
		}
	}

	public static void main(String[] args) {
		AppWildCards aw = new AppWildCards();
		
		Alumno a11 = new Alumno("Alumno MitoCode");
		Alumno a12 = new Alumno("Alumno Jaime");
		Alumno a13 = new Alumno("Alumno Mito");
		
		List<Alumno> listaAlumno = new ArrayList<>();
		listaAlumno.add(a11);
		listaAlumno.add(a12);
		listaAlumno.add(a13);
		
		Profesor p11 = new Profesor("Profesor MitoCode");
		Profesor p12 = new Profesor("Profesor Jaime");
		Profesor p13 = new Profesor("Profesor Mito");
		
		List<Profesor> listaProfesor = new ArrayList<>();
		listaProfesor.add(p11);
		listaProfesor.add(p12);
		listaProfesor.add(p13);
		
		System.out.println("** Uso del método UpperBounded ***");
		aw.listarUpperBounded(listaAlumno);
		aw.listarUpperBounded(listaProfesor);
		
		System.out.println("** Uso del método LowerBounded ***");
		aw.listarLowerBoundedAlumno(listaAlumno);
		aw.listarLowerBoundedProfesor(listaProfesor);
		
		System.out.println("** Uso del método UnBounded ***");
		aw.listarUnBoundedAlumno(listaAlumno);
		aw.listarUnBoundedProfesor(listaProfesor);
		

	}

}
