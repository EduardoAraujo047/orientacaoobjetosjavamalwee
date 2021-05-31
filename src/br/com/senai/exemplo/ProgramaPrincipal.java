package br.com.senai.exemplo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProgramaPrincipal {
	public static void main(String[] args) {

		List<Pessoa> pessoas = new ArrayList<Pessoa>();

		Pessoa pessoa1 = new Pessoa();
		Pessoa pessoa2 = new Pessoa();
		Pessoa pessoa3 = new Pessoa();
		Pessoa pessoa4 = new Pessoa();

		pessoa1.setNome("Eduardo");
		pessoa1.setAnoDeNascimento(2003);
		pessoa1.setSexo("Masculino");

		pessoa2.setNome("Mayara");
		pessoa2.setAnoDeNascimento(1994);
		pessoa2.setSexo("Feminino");

		pessoa3.setNome("Lívia");
		pessoa3.setAnoDeNascimento(2016);
		pessoa3.setSexo("Feminino");

		pessoa4.setNome("Anthony");
		pessoa4.setAnoDeNascimento(2006);
		pessoa4.setSexo("Masculino");

		pessoas.add(pessoa1);
		pessoas.add(pessoa2);
		pessoas.add(pessoa3);
		pessoas.add(pessoa4);

		System.out.println("--- Pessoas Cadastradas ---");
		for (Pessoa people : pessoas) {
			System.out.println(people.getNome());
			System.out.println(people.getAnoDeNascimento());
			System.out.println(people.getSexo());
			System.out.println("-------------------------");
					
		System.out.println("--- Pessoas com ForEach lamda ---");
		pessoas.forEach(aluno -> {
			System.out.println(aluno.getNome());
			System.out.println(aluno.getAnoDeNascimento());
			System.out.println(aluno.getSexo());
			System.out.println("**************************");
		});
		
		}
		
		Scanner tec = new Scanner(System.in);
		System.out.println("--- TABUDADA ---");
		MetodoController metodoController = new MetodoController();
		metodoController.multiplicar();
		
		System.out.println("--- SOMA DE DOIS VALORES ---");
		System.out.println("A soma dá: "+ metodoController.somar());
		
		System.out.println("--- SUBTRAÇÃO DE VALORES por parâmetro --- ");
		System.out.println("Informe o primeiro valor: ");
		int valor1 = tec.nextInt();
		System.out.println("Informe o segundo valor: ");
		int valor2 = tec.nextInt();
		
		System.out.println("A subtração dá: "+ metodoController.subtrair(valor1, valor2));
	}
}