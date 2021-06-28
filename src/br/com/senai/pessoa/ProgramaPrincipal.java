package br.com.senai.pessoa;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import br.com.senai.loja.Venda;
import br.com.senai.loja.VendaController;
import br.com.senai.produto.ProdutoController;
import br.com.senai.pessoa.PessoaController;
import br.com.senai.pessoa.Pessoa;

public class ProgramaPrincipal {

	public static void main(String[] args) {
		List<Pessoa> pessoas = new ArrayList<>();
		List<Produto> produtos = new ArrayList<>();
		List<Venda> vendas = new ArrayList<>();

		PessoaController pessoaController = new PessoaController();
		ProdutoController produtoController = new ProdutoController();
		VendaController vendaController = new VendaController();
		
		boolean sair = false;

		do {
			
			pessoaController.menu();
			System.out.println("\n--- MENU ---");
			System.out.println("1) Processo de Pessoas");
			System.out.println("2) Processo de Produtos");
			System.out.println("3) Processo de Vendas");
			System.out.println("4) Sair do sistema");
			System.out.println("-------------------");

			int opcao = pessoaController.leOpcao();

			switch (opcao) {
			case 1:
				pessoas.add(pessoaController.cadastrarPessoa(pessoas));
				pessoaController.menu(pessoas);
				break;

			case 2:
				pessoaController.listarPessoas(pessoas);
				pessoaController.menu(pessoas);
				break;
			case 3:
				produtos.add(produtoController.cadastrarProduto());
				break;
			case 4:
				produtoController.listarProdutos(produtos);
				break;
			case 5:
				produtoController.editarProduto(produtos);
				break;
			case 6:
				produtoController.excluirProduto(produtos);
				vendaController.menu(vendas);
				break;
			case 7:
				pessoaController.editarPessoa(pessoas);
				break;
			case 8:
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
