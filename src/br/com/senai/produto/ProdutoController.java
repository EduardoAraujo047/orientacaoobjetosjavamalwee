package br.com.senai.produto;

import java.util.List;
import java.util.Scanner;

public class ProdutoController {

	private Scanner tec;

	public ProdutoController() {
		tec = new Scanner(System.in);
	}

	public int leOpcao() {
		System.out.print("> ");
		return tec.nextInt();
	}
	
	public Produto cadastrarProduto() {
		Produto produto = new Produto();

		System.out.println("--- NOVO PRODUTO ---");
		System.out.print("Informe o nome do produto: ");
		produto.setNomeDoProduto(tec.next());

		System.out.print("Informe o valor unitário do produto: ");
		produto.setValorUnitarioDoProduto(tec.nextDouble());

		System.out.print("Informe a quantidade do produto: ");
		produto.setQuantidadeDoProduto(tec.nextInt());

		return produto;
	}

	public List<Produto> listarProdutos(List<Produto> produtos) {
		
		if(produtos.isEmpty()) {
			System.out.println("Não possui produtos cadastrados.");
			return null;
		}
		
		System.out.println("--- PRODUTOS CADASTRADOS ---");

		System.out.printf("| %2s | %15s | %10s | %10s | %14s |\n", "ID", "Nome", "Preço", "Quantidade", "Valor Total");

		for (int i = 0; i < produtos.size(); i++) {
			System.out.printf("| %2d | %15s | %10.2f | %10d | R$ %11.2f |\n", 
					i + 1, produtos.get(i).getNomeDoProduto(),
					produtos.get(i).getValorUnitarioDoProduto(),
					produtos.get(i).getQuantidadeDoProduto(),
					produtos.get(i).getValorTotaldoProduto());
		}
		return produtos;
	}

	public List<Produto> editarProduto(List<Produto> produtos) {
		
		Produto produto = new Produto();
		listarProdutos(produtos);
		
		if(produtos.isEmpty()) {
			return null;
		}
		

		System.out.print("Informe o ID do produto para editar: ");
		int idProduto = tec.nextInt() - 1;

		System.out.println("1) Nome do produto");
		System.out.println("2) Quantidade do produto");
		System.out.println("3) Valor unitário do produto");
		System.out.print("Informe o campo para ser editado: ");
		int opcao = tec.nextInt();

		switch (opcao) {
		case 1:
			System.out.println("--- EDITAR O NOME DO PRODUTO ---");
			System.out.print("Informe o novo nome do produto: ");
			produto.setNomeDoProduto(tec.next());

			produto.setQuantidadeDoProduto(produtos.get(idProduto).getQuantidadeDoProduto());
			produto.setValorUnitarioDoProduto(produtos.get(idProduto).getValorUnitarioDoProduto());
			produto.setValorTotaldoProduto(produtos.get(idProduto).getValorTotaldoProduto());

			produtos.set(idProduto, produto);

			break;
		case 2:
			System.out.println("--- EDITAR QUANTIDADE DE PRODUTO --");
			System.out.print("Informe a nova quantidade do produto: ");
			produto.setQuantidadeDoProduto(tec.nextInt());

			produto.setNomeDoProduto(produtos.get(idProduto).getNomeDoProduto());
			produto.setValorUnitarioDoProduto(produtos.get(idProduto).getValorUnitarioDoProduto());

			produtos.set(idProduto, produto);

			produto.setValorTotaldoProduto(produto.getQuantidadeDoProduto() * produto.getValorUnitarioDoProduto());

			break;
		case 3:
			System.out.println("--- EDITAR O VALOR UNITÁRIO DO PRODUTO ---");
			System.out.print("Informe o novo valor unitário do produto: ");
			produto.setValorUnitarioDoProduto(tec.nextDouble());

			produto.setQuantidadeDoProduto(produtos.get(idProduto).getQuantidadeDoProduto());
			produto.setNomeDoProduto(produtos.get(idProduto).getNomeDoProduto());

			produtos.set(idProduto, produto);

			produto.setValorTotaldoProduto(produto.getQuantidadeDoProduto() * produto.getValorUnitarioDoProduto());

			break;

		default:
			System.out.println("Opção inválida!");
			break;
		}

		return produtos;
	}
	
	public void excluirProduto(List<Produto> produtos) {
		
		listarProdutos(produtos);
		
		if(produtos.isEmpty()) {
			return;
		}
		
		System.out.println("--- EXCLUIR PRODUTO ---");
		
		System.out.print("Informe o ID do produto para excluir: ");
		int idProduto = tec.nextInt() - 1;
		
		if(produtos.size() <= idProduto) {
			System.out.println("Produto não cadastrado.");
			return;
		}
		
		produtos.remove(idProduto);
	}
	
	public void menu(List <Produto> produtos) {
		
		boolean sair = false;
		
	do {
			System.out.println("+---------- MENU -----------+");
			System.out.println("|1) Cadastrar produtos      |");
			System.out.println("|2) Listar produtos         |");
			System.out.println("|3) Editar produto          |");
			System.out.println("|4) Excluir produto         |");
			System.out.println("|5) Voltar                  |");
			System.out.println("+---------------------------+");

			int opcao = leOpcao();

			switch(opcao) {
			case 1:
				produtos.add(cadastrarProduto());
				break;
			case 2:
				listarProdutos(produtos);
				break;
			case 3:
				editarProduto(produtos);
				break;
			case 4:
				excluirProduto(produtos);
				break;
			case 5:
				sair = true;
				break;
			default:
				System.out.println("Opção inválida!");
				break;
			}

	
		} while(!sair);

	}
}