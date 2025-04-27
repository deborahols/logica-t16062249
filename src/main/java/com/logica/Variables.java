package com.logica;

import java.util.Date;

public class Variables {

	public static void main(String[] args) {
	
		// Variaveis do tipo String
		
		 String nome = "Deborah";
		 String sobrenome = "Oliveira";
		
		
		System.out.printf("Your name is " + nome +" "+sobrenome+"?");
		System.out.printf("      ");
		
		// Variaveis do tipo Integer
		Integer value1 = 5;
		Integer value2 = 18;
		
		Integer total = value1 + value2;
		
		System.out.println("The total value is: " + total);
		
		// Variaveis do tipo Double
		
		Double value3 = 15.88;
		Double value4 = 45.92;
		
		Double totalDouble = value3 * value4;
		System.out.println("The total double value is: "+totalDouble);
		
		//Variaveis do tipo Boolean
		Boolean married = false;
		
		if (married) {
			System.out.println("This person is married!");
		}
		else {
			System.out.println("This person not is married!");
		}
		
		// Variaveis do tipo Date
		Date current = new Date();
		System.out.println("The current date is: " +current);
		
		Integer year = Integer.parseInt("2025");
		
		System.out.println("The year is: "+year);
	
	}

}
