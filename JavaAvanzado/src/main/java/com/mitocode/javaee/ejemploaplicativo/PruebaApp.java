package com.mitocode.javaee.ejemploaplicativo;

import java.util.Scanner;

public class PruebaApp {

	public static void main(String[] args) {
		
		Persona persona1 = new Persona(1, "Mito", 1000);
		Persona persona2 = new Persona(2, "Code", 1000);
		Persona persona3 = new Persona(3, "Jaime", 1000); 
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("--------------------------------------");
		System.out.println("BIENVENIDO AL BANCO XYZ, por favor ingrese su número de cuenta");
		
		int cuenta = sc.nextInt();
		String operacion;
		switch (cuenta) {
		case 1:
			System.out.println("Bienvenido " + persona1.getNombre());
			System.out.println("--------------------------------------");
			System.out.println("Ingrese la operación depositar");
			System.out.println("A-Depositar");
			System.out.println("B-Retirar");
			operacion = sc.next();
			switch(operacion) {
			case "A":
				System.out.println("--------------------------------------");
				System.out.println("Ingrese el monto a depositar");
				double montoDeposito = sc.nextDouble();
				double montoAnteriorDeposito = persona1.getMonto();
				persona1.setMonto(montoAnteriorDeposito + montoDeposito);
				System.out.println("El monto final es " + persona1.getMonto());
				break;
			case "B":
				System.out.println("--------------------------------------");
				System.out.println("Ingrese el monto a retirar");
				double montoRetiro = sc.nextDouble();
				double montoAnteriorRetiro = persona1.getMonto();
				persona1.setMonto(montoAnteriorRetiro - montoRetiro);
				System.out.println("El monto final es " + persona1.getMonto());
				break;
			}
			break;
		case 2:
			System.out.println("Bienvenido " + persona2.getNombre());
			System.out.println("--------------------------------------");
			System.out.println("Ingrese la operación depositar");
			System.out.println("A-Depositar");
			System.out.println("B-Retirar");
			operacion = sc.next();
			switch(operacion) {
			case "A":
				System.out.println("--------------------------------------");
				System.out.println("Ingrese el monto a depositar");
				double montoDeposito = sc.nextDouble();
				double montoAnteriorDeposito = persona2.getMonto();
				persona1.setMonto(montoAnteriorDeposito + montoDeposito);
				System.out.println("El monto final es " + persona2.getMonto());
				break;
			case "B":
				System.out.println("--------------------------------------");
				System.out.println("Ingrese el monto a retirar");
				double montoRetiro = sc.nextDouble();
				double montoAnteriorRetiro = persona2.getMonto();
				persona1.setMonto(montoAnteriorRetiro - montoRetiro);
				System.out.println("El monto final es " + persona2.getMonto());
				break;
			}
			break;
		case 3:
			System.out.println("Bienvenido " + persona3.getNombre());
			System.out.println("--------------------------------------");
			System.out.println("Ingrese la operación depositar");
			System.out.println("A-Depositar");
			System.out.println("B-Retirar");
			operacion = sc.next();
			switch(operacion) {
			case "A":
				System.out.println("--------------------------------------");
				System.out.println("Ingrese el monto a depositar");
				double montoDeposito = sc.nextDouble();
				double montoAnteriorDeposito = persona3.getMonto();
				persona1.setMonto(montoAnteriorDeposito + montoDeposito);
				System.out.println("El monto final es " + persona3.getMonto());
				break;
			case "B":
				System.out.println("--------------------------------------");
				System.out.println("Ingrese el monto a retirar");
				double montoRetiro = sc.nextDouble();
				double montoAnteriorRetiro = persona3.getMonto();
				persona1.setMonto(montoAnteriorRetiro - montoRetiro);
				System.out.println("El monto final es " + persona3.getMonto());
				break;
			}
			break;
		default:
			System.out.println("Cuenta no res¡gistrada");
			System.exit(0);
			break;
		}
		
		System.out.println(persona1.getMonto() + persona2.getMonto() + persona3.getMonto());
	}

}
