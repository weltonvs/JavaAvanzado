package com.mitocode.tema4;

import java.util.ArrayList;
import java.util.List;

public class App {
	public static void main(String[] args) {
		Clase<String, Integer, String,Double> c = new Clase<>("MitoCode", 25, "Jaime", 25.5);
		
		List<Clase<String,Integer,String,String>> lista = new ArrayList<>();
		lista.add(new Clase<String,Integer,String,String>("MitoCode",25,"Jaime","sucribete"));//Este caso el diamante puede quedar vacio porque se esta instanciando.
		
		for(Clase<String,Integer,String,String> c1 : lista) {
			c1.mostrarTipo();
		}
	}

}
