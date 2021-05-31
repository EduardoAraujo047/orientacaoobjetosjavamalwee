package br.com.senai.exemplo;

import java.util.Scanner;

public class MetodoController {

	public void multiplicar() {
		
		Scanner tec = new Scanner(System.in);

		System.out.println("Informe o valor: ");
		int valor = tec.nextInt();

		for (int i = 0; i <= 10; i++) {
			System.out.println(valor + " x " + i + " = " + (valor * i));
		}
	}
	
	public int somar() {
		Scanner tec = new Scanner(System.in);
		System.out.println("Informe o primeiro valor: ");
		int valor1 = tec.nextInt();
		System.out.println("Informe o segundo valor: ");
		int valor2 = tec.nextInt();
		
		int resultado = valor1 + valor2;
		
		return resultado;
	}
	
	public int subtrair(int valor1, int valor2) {
		
		int resultado = valor1 - valor2;
		
		return resultado;
		
	}
}
