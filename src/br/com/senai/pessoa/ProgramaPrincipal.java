package br.com.senai.pessoa;

import java.util.ArrayList;
import java.util.List;

import br.com.senai.loja.Venda;
import br.com.senai.loja.VendaController;
import br.com.senai.produto.Produto;
import br.com.senai.produto.ProdutoController;
import br.com.senai.pessoa.PessoaController;
import br.com.senai.pessoa.Pessoa;

public class ProgramaPrincipal {

	public static void main(String[] args) {
		List<Pessoa> pessoas = new ArrayList<>();
		List<Produto> produtos = new ArrayList<>();
		List<Venda> vendas = new ArrayList<>();
		
		Produto produto = new Produto(
				"Abacate",
				2.5,
				35,
				2.5 * 35
				);
		produtos.add(produto);

		PessoaController pessoaController = new PessoaController();
		ProdutoController produtoController = new ProdutoController();
		VendaController vendaController = new VendaController();
		
		
		boolean sair = false;

		do {			
			System.out.println("+---------- MENU ----------+");
			System.out.println("|1) Processo de Pessoas    |");
			System.out.println("|2) Processo de Produtos   |");
			System.out.println("|3) Processo de Vendas     |");
			System.out.println("|4) Sair do sistema        |");
			System.out.println("+--------------------------+");

			int opcao = pessoaController.leOpcao();

			switch (opcao) {
			case 1:
				pessoaController.menu(pessoas);
				break;
			case 2:
				produtoController.menu(produtos);
				break;
			case 3:
				vendaController.menu(vendas, produtos, pessoas);
				break;
			case 4:
				sair = true;
				break;
			default:
				System.out.println("Função inválida.");
				break;

			}

		} while (!sair);

		System.out.println("Sistema finalizado.");
	}
}