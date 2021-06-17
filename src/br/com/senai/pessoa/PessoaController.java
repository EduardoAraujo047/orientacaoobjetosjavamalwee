package br.com.senai.pessoa;

import java.util.List;
import java.util.Scanner;

import br.com.senai.endereco.Endereco;

public class PessoaController {

	private Scanner tec;

	public PessoaController() {
		tec = new Scanner(System.in);
	}

	public int leOpcao() {
		System.out.print("> ");
		return tec.nextInt();
	}

	public void menu() {
		System.out.println("\n--- MENU ---");
		System.out.println("1) Cadastrar pessoa");
		System.out.println("2) Listar pessoas cadastradas");
		System.out.println("3) Cadastrar novo produto");
		System.out.println("4) Listar produtos cadastrados");
		System.out.println("9) Sair do sistema");
		System.out.println("-------------------");
	}

	public Pessoa cadastrarPessoa() {
		Pessoa pessoa = new Pessoa();

		System.out.println("--- CADASTRAR PESSOA ---");
		System.out.print("Informe o nome: ");
		tec.nextLine();
		pessoa.setNome(tec.nextLine());

		System.out.print("Informe o ano de nascimento: ");
		pessoa.setAnoDeNascimento(tec.nextInt());

		System.out.print("Informe a altura: ");
		pessoa.setAltura(tec.nextDouble());

		System.out.print("Informe o pais: ");
		tec.nextLine();
		pessoa.setNomeDopais(tec.nextLine());

		System.out.print("Informe a sigla do pais: ");
		pessoa.setSiglaDoPais(tec.nextLine());

		System.out.print("Informe o nome do estado: ");
		pessoa.setNomeDoEstado(tec.nextLine());

		System.out.print("Informe a UF do estado: ");
		pessoa.setUf(tec.nextLine());

		System.out.print("Informe o nome da cidade: ");
		pessoa.setNomeDaCidade(tec.nextLine());

		System.out.print("Informe o nome da rua: ");
		pessoa.setNomeDaRua(tec.nextLine());

		System.out.print("Informe o nome do bairro: ");
		pessoa.setNomeDoBairro(tec.nextLine());

		System.out.print("Informe o complemento: ");
		pessoa.setComplemento(tec.nextLine());

		System.out.print("Informe o número da casa: ");
		pessoa.setNumero(tec.nextLine());

		return pessoa;
	}

	public List<Pessoa> listarPessoas(List<Pessoa> pessoas) {
		System.out.println("--- PESSOAS CADASTRADAS ---");

		System.out.printf("| %20s | %4s | %5s | %6s | %10s | %5s | %20s | %2s | %20s | %20s | %20s | %11s | %14s |\n",
				"Nome", "Ano", "Idade", "Altura", "Pais", "Sigla", "Estado", "UF", "Cidade", "Rua", "Bairro",
				"Complemento", "Número da Casa");

		for (int i = 0; i < pessoas.size(); i++) {
			System.out.printf(
					"| %20s | %4d | %5d | %6.2f | %10s | %5s | %20s | %2s | %20s | %20s | %20s | %11s | %14s |\n",
					pessoas.get(i).getNome(), pessoas.get(i).getAnoDeNascimento(), pessoas.get(i).getIdade(),
					pessoas.get(i).getAltura(), pessoas.get(i).getNomeDopais(), pessoas.get(i).getSiglaDoPais(),
					pessoas.get(i).getNomeDoEstado(), pessoas.get(i).getUf(), pessoas.get(i).getNomeDaCidade(),
					pessoas.get(i).getNomeDaRua(), pessoas.get(i).getNomeDoBairro(), pessoas.get(i).getComplemento(),
					pessoas.get(i).getNumero());
		}

		return pessoas;
	}

	public Endereco cadEndereco() {
		Endereco endereco = new Endereco();
		return endereco;
	}
}
