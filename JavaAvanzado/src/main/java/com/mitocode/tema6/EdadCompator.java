package com.mitocode.tema6;
import java.util.Comparator;

public class EdadCompator implements Comparator<Persona> {

	@Override
	public int compare(Persona obj1, Persona obj2) {
		if(obj1.getEdad() > obj2.getEdad()) {
			return 1;
		} else if(obj1.getEdad() < obj2.getEdad()) {
			return -1;
		}
		return 0;
	}
}
