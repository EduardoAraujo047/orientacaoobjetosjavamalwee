package br.com.senai.pessoa;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import br.com.senai.produto.ProdutoController;

public class ProgramaPrincipal {

	public static void main(String[] args) {
		List<Pessoa> pessoas = new ArrayList<>();
		List<Produto> produtos = new ArrayList<>();

		PessoaController pessoaController = new PessoaController();
		ProdutoController produtoController = new ProdutoController();
		
		boolean sair = false;

		do {
			pessoaController.menu();

			int opcao = pessoaController.leOpcao();

			switch (opcao) {
			case 1:
				pessoas.add(pessoaController.cadastrarPessoa());
				break;

			case 2:
				pessoaController.listarPessoas(pessoas);

				break;
				
			default:
				System.out.println("Função inválida.");
				break;

			case 9:
				sair = true;
				break;
			}

		} while (!sair);

		System.out.println("Sistema finalizado.");
	}

}
