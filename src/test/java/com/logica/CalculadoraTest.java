package com.logica;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculadoraTest {
	
	@Test
	public void testSomaDoisValoresPositivos() {
		
		Calculadora calculadora = new Calculadora();
		Integer total = calculadora.soma(7, 22);
		
		Assertions.assertEquals(29, total);
	}
	
	@Test
	public void testSomaDoisValoresNegativos() {
		Calculadora calc = new Calculadora();
		Integer total = calc.soma(-8, -11);
		
		Assertions.assertEquals(-19, total);
		
	}
	
	@Test
	public void testSomaZero() {
		Calculadora calc = new Calculadora();
		Integer total = calc.soma(0, 0);
		
		Assertions.assertEquals(0, total);

	}
	
	@Test
	public void testMult() {
		Calculadora calc = new Calculadora();
		Integer total = calc.mult(5, 5);
		
		Assertions.assertEquals(25, total);

	}
}
