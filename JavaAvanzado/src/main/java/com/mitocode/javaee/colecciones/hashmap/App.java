package com.mitocode.javaee.colecciones.hashmap;

import java.util.HashMap;

public class App {

	public static void main(String[] args) {
		
		HashMap diccionario = new HashMap();
		diccionario.put("user", "MitoCode");
		diccionario.put("youtube", "www.youtube.com");
		diccionario.put("facebook", "www.facebook.com");
		
		String contenido = diccionario.get("youtube").toString();
		System.out.println(contenido);
		//Para saber si el diccionario tiene una llave.
		boolean respuesta = diccionario.containsKey("youtube");
		System.out.println(respuesta);
	}

}
