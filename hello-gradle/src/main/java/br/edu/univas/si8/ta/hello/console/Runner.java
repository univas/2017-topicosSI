package br.edu.univas.si8.ta.hello.console;

import java.util.Scanner;

import br.edu.univas.si8.ta.hello.calc.Calculadora;

public class Runner {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Calculadora calculadora = new Calculadora();

		System.out.print("Primeiro numero: ");
		int first = scanner.nextInt();

		System.out.print("Segundo numero: ");
		int second = scanner.nextInt();

		int result = calculadora.somar(first, second);

		System.out.println("Resultado: " + result);

		scanner.close();
	}

}
