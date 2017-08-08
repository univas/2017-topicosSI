package br.edu.univas.si8.ta.hello.calc;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CalculadoraTest {

	private Calculadora calculadora = new Calculadora();

	@Test
	public void shouldSumIntegerValues() {
		int first = 10;
		int second = 15;
		int expected = 25;

		int result = calculadora.somar(first, second);

		assertEquals(expected, result);
	}

}
