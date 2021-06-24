package br.com.senai;

import java.util.ArrayList;
import java.util.List;

import br.com.senai.loja.Venda;
import br.com.senai.loja.VendaController;
import br.com.senai.pessoa.Pessoa;
import br.com.senai.pessoa.PessoaController;
import br.com.senai.produto.Produto;
import br.com.senai.produto.ProdutoController;

public class ProgramaPrincipal {

	public static void main(String[] args) {
		List<Pessoa> pessoas = new ArrayList<>();
		List<Produto> produtos = new ArrayList<>();
		List<Venda> vendas = new ArrayList<Venda>();

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
			
			pessoaController.menu();

			int opcao = pessoaController.leOpcao();
			
			switch (opcao) {
			case 1:
				pessoaController.menu(pessoas);
				break;
			case 2:
				produtoController.menu(produtos);
				break;
			case 3:
				vendaController.menu(vendas);
				break;
			case 4:
				sair = true;
				break;
			default:
				System.out.println("Opção inválida!");
				break;
			}
		} while (!sair);

		System.out.println("Sistema finalizado!");
	}

}
