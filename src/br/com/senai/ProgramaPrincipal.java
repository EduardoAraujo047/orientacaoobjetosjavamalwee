package br.com.senai;

public class ProgramaPrincipal {
	public static void main(String[] args) {

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

		System.out.println("-> Primeira pessoa: ");
		System.out.println(pessoa1.getNome());
		System.out.println(pessoa1.getAnoDeNascimento());
		System.out.println(pessoa1.getSexo());
		System.out.println("");
		
		System.out.println("-> Segunda pessoa: ");
		System.out.println(pessoa2.getNome());
		System.out.println(pessoa2.getAnoDeNascimento());
		System.out.println(pessoa2.getSexo());
		System.out.println("");
		
		System.out.println("-> Terceira pessoa: ");
		System.out.println(pessoa3.getNome());
		System.out.println(pessoa3.getAnoDeNascimento());
		System.out.println(pessoa3.getSexo());
		System.out.println("");
		
		System.out.println("-> Quarta pessoa: ");
		System.out.println(pessoa4.getNome());
		System.out.println(pessoa4.getAnoDeNascimento());
		System.out.println(pessoa4.getSexo());
	}
}