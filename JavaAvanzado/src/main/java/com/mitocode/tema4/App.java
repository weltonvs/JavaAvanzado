package com.mitocode.tema4;

import java.util.ArrayList;
import java.util.List;

public class App {
	public static void main(String[] args) {
		//Concepto de TypeSafety
		List<String> lista = new ArrayList<>();
		lista.add("MitoCode");
		//lista.add(25);//Nos provoca error de compilación debido al uso del tipo entero en lugar de String definido en la lista.
		
		String[] array = new String[5];
		array[0] = "MitoCode";
		//array[1] = 1;//Provoca error de compilación debido al uso del tipo entero en lugar de String, ya que el array almcena String.
		
		
	}

}
