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

	public void menu(List<Pessoa> pessoas) {
		
		boolean sair = false;
		
		do {
			System.out.println("+----- PROCESSO DE PESSOAS -----+");
			System.out.println("|1) Cadastrar uma nova pessoa   |");
			System.out.println("|2) Editar pessoas cadastradas  |");
			System.out.println("|3) Listar pessoas cadastradas  |");
			System.out.println("|4) Excluir pessoas             |");
			System.out.println("|5) Voltar                      |");
			System.out.println("+-------------------------------+");
		
			int opcao = leOpcao();
		
			switch(opcao) {
			case 1:
				pessoas.add(cadastrarPessoa(pessoas));
				break;
			case 2:
				editarPessoa(pessoas);
				break;
			case 3:
				listarPessoas(pessoas);
				break;
			case 4:
				excluirPessoa(pessoas);
				break;
			case 5:
				sair = true;
				break;
			default:
				System.out.println("Op??o inv?lida!");
				break;
		
			}
		} while(!sair);
	}
	
	public Pessoa cadastrarPessoa(List<Pessoa> pessoas) {
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

		System.out.print("Informe o n?mero da casa: ");
		pessoa.setNumero(tec.nextLine());

		return pessoa;
	}

	public List<Pessoa> editarPessoa(List<Pessoa> pessoas) {
			
			Pessoa pessoa = new Pessoa();
			listarPessoas(pessoas);
			
		if(pessoas.isEmpty()) {
				return null;
		}
		System.out.print("Informe o ID da pessoa para editar: ");
		int idPessoa = tec.nextInt();
		
		System.out.println("1) Nome da pessoa");
		System.out.println("2) Ano de nascimento");
		System.out.println("3) Altura");
		System.out.println("4) Pais");
		System.out.println("5) Sigla do pais");
		System.out.println("6) Estado");
		System.out.println("7) UF");
		System.out.println("8) Cidade");
		System.out.println("9) Rua");
		System.out.println("10) Bairro");
		System.out.println("11) Complemento");
		System.out.println("12) N?mero da casa");
		System.out.print("Informe o campo para ser editado: ");
		int opcao = tec.nextInt();
		
		switch(opcao) {
		case 1:
			System.out.println("--- EDITAR NOME DA PESSOA ---");
			System.out.print("Informe o novo nome: ");
			pessoa.setNome(tec.next());
			
			pessoa.setAltura(pessoas.get(idPessoa).getAltura());
			pessoa.setAnoDeNascimento(pessoas.get(idPessoa).getAnoDeNascimento());
			pessoa.setComplemento(pessoas.get(idPessoa).getComplemento());
			pessoa.setNomeDaCidade(pessoas.get(idPessoa).getComplemento());
			pessoa.setNomeDaRua(pessoas.get(idPessoa).getNomeDaRua());
			pessoa.setNomeDoBairro(pessoas.get(idPessoa).getNomeDoBairro());
			pessoa.setNomeDoEstado(pessoas.get(idPessoa).getNomeDoEstado());
			pessoa.setNomeDopais(pessoas.get(idPessoa).getNomeDopais());
			pessoa.setNumero(pessoas.get(idPessoa).getNumero());
			pessoa.setSiglaDoPais(pessoas.get(idPessoa).getSiglaDoPais());
			pessoa.setUf(pessoas.get(idPessoa).getUf());
			
			pessoas.set(idPessoa, pessoa);

			break;
			
		case 2:
			System.out.println("--- EDITAR ANO DE NASCIMENTO ---");
			System.out.print("Informe o o novo ano de nascimento: ");
			pessoa.setAnoDeNascimento(tec.nextInt());
			
			pessoa.setNome(pessoas.get(idPessoa).getNome());
			pessoa.setAltura(pessoas.get(idPessoa).getAltura());
			pessoa.setComplemento(pessoas.get(idPessoa).getComplemento());
			pessoa.setNomeDaCidade(pessoas.get(idPessoa).getComplemento());
			pessoa.setNomeDaRua(pessoas.get(idPessoa).getNomeDaRua());
			pessoa.setNomeDoBairro(pessoas.get(idPessoa).getNomeDoBairro());
			pessoa.setNomeDoEstado(pessoas.get(idPessoa).getNomeDoEstado());
			pessoa.setNomeDopais(pessoas.get(idPessoa).getNomeDopais());
			pessoa.setNumero(pessoas.get(idPessoa).getNumero());
			pessoa.setSiglaDoPais(pessoas.get(idPessoa).getSiglaDoPais());
			pessoa.setUf(pessoas.get(idPessoa).getUf());
			
			pessoas.set(idPessoa, pessoa);
			
			break;
			
		case 3:
			System.out.println("--- EDITAR ALTURA ---");
			System.out.print("Informe a nova altura: ");
			pessoa.setAltura(tec.nextDouble());
			
			pessoa.setNome(pessoas.get(idPessoa).getNome());
			pessoa.setAnoDeNascimento(pessoas.get(idPessoa).getAnoDeNascimento());
			pessoa.setComplemento(pessoas.get(idPessoa).getComplemento());
			pessoa.setNomeDaCidade(pessoas.get(idPessoa).getComplemento());
			pessoa.setNomeDaRua(pessoas.get(idPessoa).getNomeDaRua());
			pessoa.setNomeDoBairro(pessoas.get(idPessoa).getNomeDoBairro());
			pessoa.setNomeDoEstado(pessoas.get(idPessoa).getNomeDoEstado());
			pessoa.setNomeDopais(pessoas.get(idPessoa).getNomeDopais());
			pessoa.setNumero(pessoas.get(idPessoa).getNumero());
			pessoa.setSiglaDoPais(pessoas.get(idPessoa).getSiglaDoPais());
			pessoa.setUf(pessoas.get(idPessoa).getUf());
			
			pessoas.set(idPessoa, pessoa);
			
			break;
			
		case 4:
			System.out.println("--- EDITAR PAIS ---");
			System.out.print("Informe o novo pais: ");
			pessoa.setNomeDopais(tec.next());
			
			pessoa.setNome(pessoas.get(idPessoa).getNome());
			pessoa.setAnoDeNascimento(pessoas.get(idPessoa).getAnoDeNascimento());
			pessoa.setComplemento(pessoas.get(idPessoa).getComplemento());
			pessoa.setNomeDaCidade(pessoas.get(idPessoa).getComplemento());
			pessoa.setNomeDaRua(pessoas.get(idPessoa).getNomeDaRua());
			pessoa.setNomeDoBairro(pessoas.get(idPessoa).getNomeDoBairro());
			pessoa.setNomeDoEstado(pessoas.get(idPessoa).getNomeDoEstado());
			pessoa.setNumero(pessoas.get(idPessoa).getNumero());
			pessoa.setSiglaDoPais(pessoas.get(idPessoa).getSiglaDoPais());
			pessoa.setUf(pessoas.get(idPessoa).getUf());
			
			pessoas.set(idPessoa, pessoa);

			break;
			
		case 5:
			System.out.println("--- EDITAR S?GLA DO PAIS ---");
			System.out.print("Informe a nova sigla: ");
			pessoa.setSiglaDoPais(tec.next());
			
			pessoa.setNome(pessoas.get(idPessoa).getNome());
			pessoa.setAnoDeNascimento(pessoas.get(idPessoa).getAnoDeNascimento());
			pessoa.setComplemento(pessoas.get(idPessoa).getComplemento());
			pessoa.setNomeDaCidade(pessoas.get(idPessoa).getComplemento());
			pessoa.setNomeDaRua(pessoas.get(idPessoa).getNomeDaRua());
			pessoa.setNomeDoBairro(pessoas.get(idPessoa).getNomeDoBairro());
			pessoa.setNomeDoEstado(pessoas.get(idPessoa).getNomeDoEstado());
			pessoa.setNumero(pessoas.get(idPessoa).getNumero());
			pessoa.setUf(pessoas.get(idPessoa).getUf());
			pessoa.setNomeDopais(pessoas.get(idPessoa).getNomeDopais());
			
			pessoas.set(idPessoa, pessoa);
			
			break;
			
		case 6:
			System.out.println("--- EDITAR ESTADO ---");
			System.out.print("Informe o novo estado: ");
			pessoa.setNomeDoEstado(tec.next());
			
			pessoa.setNome(pessoas.get(idPessoa).getNome());
			pessoa.setAnoDeNascimento(pessoas.get(idPessoa).getAnoDeNascimento());
			pessoa.setComplemento(pessoas.get(idPessoa).getComplemento());
			pessoa.setNomeDaCidade(pessoas.get(idPessoa).getComplemento());
			pessoa.setNomeDaRua(pessoas.get(idPessoa).getNomeDaRua());
			pessoa.setNomeDoBairro(pessoas.get(idPessoa).getNomeDoBairro());
			pessoa.setSiglaDoPais(pessoas.get(idPessoa).getSiglaDoPais());
			pessoa.setNumero(pessoas.get(idPessoa).getNumero());
			pessoa.setUf(pessoas.get(idPessoa).getUf());
			pessoa.setNomeDopais(pessoas.get(idPessoa).getNomeDopais());

			pessoas.set(idPessoa, pessoa);
			
			break;
			
		case 7:
			System.out.println("--- EDITAR UF ---");
			System.out.print("Informe a nova UF: ");
			pessoa.setUf(tec.next());
			
			pessoa.setNome(pessoas.get(idPessoa).getNome());
			pessoa.setAnoDeNascimento(pessoas.get(idPessoa).getAnoDeNascimento());
			pessoa.setComplemento(pessoas.get(idPessoa).getComplemento());
			pessoa.setNomeDaCidade(pessoas.get(idPessoa).getComplemento());
			pessoa.setNomeDaRua(pessoas.get(idPessoa).getNomeDaRua());
			pessoa.setNomeDoBairro(pessoas.get(idPessoa).getNomeDoBairro());
			pessoa.setSiglaDoPais(pessoas.get(idPessoa).getSiglaDoPais());
			pessoa.setNumero(pessoas.get(idPessoa).getNumero());
			pessoa.setNomeDopais(pessoas.get(idPessoa).getNomeDopais());
			pessoa.setNomeDoEstado(pessoas.get(idPessoa).getNomeDoEstado());

			pessoas.set(idPessoa, pessoa);
			
			break;
		
		case 8:
			System.out.println("--- EDITAR NOME DA CIDADE ---");
			System.out.print("Informe o novo nome da cidade: ");
			pessoa.setNomeDaCidade(tec.next());
			
			pessoa.setNome(pessoas.get(idPessoa).getNome());
			pessoa.setAnoDeNascimento(pessoas.get(idPessoa).getAnoDeNascimento());
			pessoa.setComplemento(pessoas.get(idPessoa).getComplemento());
			pessoa.setNomeDaRua(pessoas.get(idPessoa).getNomeDaRua());
			pessoa.setNomeDoBairro(pessoas.get(idPessoa).getNomeDoBairro());
			pessoa.setSiglaDoPais(pessoas.get(idPessoa).getSiglaDoPais());
			pessoa.setNumero(pessoas.get(idPessoa).getNumero());
			pessoa.setNomeDopais(pessoas.get(idPessoa).getNomeDopais());
			pessoa.setNomeDoEstado(pessoas.get(idPessoa).getNomeDoEstado());
			pessoa.setUf(pessoas.get(idPessoa).getUf());

			pessoas.set(idPessoa, pessoa);
			
			break;
			
		case 9:
			System.out.println("--- EDITAR NOME DA RUA ---");
			System.out.print("Informe o novo nome da rua: ");
			pessoa.setNomeDaRua(tec.next());
			
			pessoa.setNome(pessoas.get(idPessoa).getNome());
			pessoa.setAnoDeNascimento(pessoas.get(idPessoa).getAnoDeNascimento());
			pessoa.setComplemento(pessoas.get(idPessoa).getComplemento());
			pessoa.setNomeDoBairro(pessoas.get(idPessoa).getNomeDoBairro());
			pessoa.setSiglaDoPais(pessoas.get(idPessoa).getSiglaDoPais());
			pessoa.setNumero(pessoas.get(idPessoa).getNumero());
			pessoa.setNomeDopais(pessoas.get(idPessoa).getNomeDopais());
			pessoa.setNomeDoEstado(pessoas.get(idPessoa).getNomeDoEstado());
			pessoa.setUf(pessoas.get(idPessoa).getUf());
			pessoa.setNomeDaCidade(pessoas.get(idPessoa).getComplemento());

			pessoas.set(idPessoa, pessoa);
			
			break;
			
		case 10:
			System.out.println("--- EDITAR NOME DO BAIRRO ---");
			System.out.print("Informe o novo nome do bairro: ");
			pessoa.setNomeDoBairro(tec.next());
			
			pessoa.setNome(pessoas.get(idPessoa).getNome());
			pessoa.setAnoDeNascimento(pessoas.get(idPessoa).getAnoDeNascimento());
			pessoa.setComplemento(pessoas.get(idPessoa).getComplemento());
			pessoa.setSiglaDoPais(pessoas.get(idPessoa).getSiglaDoPais());
			pessoa.setNumero(pessoas.get(idPessoa).getNumero());
			pessoa.setNomeDopais(pessoas.get(idPessoa).getNomeDopais());
			pessoa.setNomeDoEstado(pessoas.get(idPessoa).getNomeDoEstado());
			pessoa.setUf(pessoas.get(idPessoa).getUf());
			pessoa.setNomeDaCidade(pessoas.get(idPessoa).getComplemento());
			pessoa.setNomeDaRua(pessoas.get(idPessoa).getNomeDaRua());

			pessoas.set(idPessoa, pessoa);
			
			
			break;
			
		case 11:
			System.out.println("--- EDITAR COMPLEMENTO ---");
			System.out.print("Informe o novo complemento: ");
			pessoa.setComplemento(tec.next());
			
			pessoa.setNome(pessoas.get(idPessoa).getNome());
			pessoa.setAnoDeNascimento(pessoas.get(idPessoa).getAnoDeNascimento());
			pessoa.setSiglaDoPais(pessoas.get(idPessoa).getSiglaDoPais());
			pessoa.setNumero(pessoas.get(idPessoa).getNumero());
			pessoa.setNomeDopais(pessoas.get(idPessoa).getNomeDopais());
			pessoa.setNomeDoEstado(pessoas.get(idPessoa).getNomeDoEstado());
			pessoa.setUf(pessoas.get(idPessoa).getUf());
			pessoa.setNomeDaCidade(pessoas.get(idPessoa).getComplemento());
			pessoa.setNomeDaRua(pessoas.get(idPessoa).getNomeDaRua());
			pessoa.setNomeDoBairro(pessoas.get(idPessoa).getNomeDoBairro());

			pessoas.set(idPessoa, pessoa);
			
			break;
			
		case 12:
			System.out.println("--- EDITAR N?MERO ---");
			System.out.println("Informe o novo n?mero: ");
			pessoa.setNumero(tec.next());
			
			pessoa.setNome(pessoas.get(idPessoa).getNome());
			pessoa.setAnoDeNascimento(pessoas.get(idPessoa).getAnoDeNascimento());
			pessoa.setSiglaDoPais(pessoas.get(idPessoa).getSiglaDoPais());
			pessoa.setNomeDopais(pessoas.get(idPessoa).getNomeDopais());
			pessoa.setNomeDoEstado(pessoas.get(idPessoa).getNomeDoEstado());
			pessoa.setUf(pessoas.get(idPessoa).getUf());
			pessoa.setNomeDaCidade(pessoas.get(idPessoa).getComplemento());
			pessoa.setNomeDaRua(pessoas.get(idPessoa).getNomeDaRua());
			pessoa.setNomeDoBairro(pessoas.get(idPessoa).getNomeDoBairro());
			pessoa.setComplemento(pessoas.get(idPessoa).getComplemento());

			pessoas.set(idPessoa, pessoa);
			
			break;
			
		default:
			System.out.println("Op??o inv?lida!");
			break;
		}		
		return pessoas;
		
	}
	public List<Pessoa> listarPessoas(List<Pessoa> pessoas) {

		if (pessoas.isEmpty()) {
			System.out.println("N?o possui pessoas cadastradas.");
			return null;
		}

		System.out.println("--- PESSOAS CADASTRADAS ---");

		System.out.printf(
				"| %2s | %20s | %4s | %5s | %6s | %10s | %5s | %20s | %2s | %20s | %20s | %20s | %11s | %14s |\n", "ID",
				"Nome", "Ano", "Idade", "Altura", "Pais", "Sigla", "Estado", "UF", "Cidade", "Rua", "Bairro",
				"Complemento", "N?mero da Casa");

		for (int i = 0; i < pessoas.size(); i++) {
			System.out.printf(
					"| %2d | %20s | %4d | %5d | %6.2f | %10s | %5s | %20s | %2s | %20s | %20s | %20s | %11s | %14s |\n",
					i, pessoas.get(i).getNome(), pessoas.get(i).getAnoDeNascimento(), pessoas.get(i).getIdade(),
					pessoas.get(i).getAltura(), pessoas.get(i).getNomeDopais(), pessoas.get(i).getSiglaDoPais(),
					pessoas.get(i).getNomeDoEstado(), pessoas.get(i).getUf(), pessoas.get(i).getNomeDaCidade(),
					pessoas.get(i).getNomeDaRua(), pessoas.get(i).getNomeDoBairro(), pessoas.get(i).getComplemento(),
					pessoas.get(i).getNumero());
		}

		return pessoas;
	}
	
	public void excluirPessoa(List<Pessoa> pessoas) {
			
			listarPessoas(pessoas);
			
			if(pessoas.isEmpty()) {
				return;
			}
			
			System.out.println("--- EXCLUIR PESSOA ---");
			
			System.out.print("Informe o ID do da pessoa para excluir: ");
			int idPessoa = tec.nextInt();
					
			pessoas.remove(idPessoa);
		}

	public Endereco cadEndereco() {
		Endereco endereco = new Endereco();
		return endereco;
	}

}
