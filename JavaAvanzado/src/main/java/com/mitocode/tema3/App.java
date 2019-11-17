package com.mitocode.tema3;

public class App {

	public static void main(String[] args) {		
		
		
		System.out.println("Con uso del Singleton");
		PaisDAOImpl daoSingleton = PaisDAOImpl.getInstance();
		for(Object obj: daoSingleton.getPaises()) {
			System.out.println(((Pais)obj).getNombre());
		}
	}

}
