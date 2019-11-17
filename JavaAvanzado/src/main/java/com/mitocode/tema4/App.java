package com.mitocode.tema4;

public class App {
	public static void main(String[] args) {
		Clase<String> c = new Clase<>("MitoCode");
		c.mostrarTipo();
		
		Clase<Integer> c2 = new Clase<>(2);
		c2.mostrarTipo();
		
		
	}

}
