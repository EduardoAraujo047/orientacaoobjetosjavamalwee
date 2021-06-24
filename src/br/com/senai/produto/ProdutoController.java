package br.com.senai.produto;

import java.util.List;
import java.util.Scanner;

public class ProdutoController {

	private Scanner tec;

	public ProdutoController() {
		tec = new Scanner(System.in);
	}
	
	public void menu(List<Produto> produtos) {
		
	}

	public Produto cadastrarProduto() {
		Produto produto = new Produto();

		System.out.println("--- NOVO PRODUTO ---");
		System.out.print("Informe o nome do produto: ");
		produto.setNomeDoProduto(tec.next());

		System.out.print("Informe o valor unit�rio do produto: ");
		produto.setValorUnitarioDoProduto(tec.nextDouble());

		System.out.print("Informe a quantidade do produto: ");
		produto.setQuantidadeDoProduto(tec.nextInt());

		return produto;
	}

	public List<Produto> listarProdutos(List<Produto> produtos) {
		
		if(produtos.isEmpty()) {
			System.out.println("N�o possui produtos cadastrados.");
			return null;
		}
		
		System.out.println("--- PRODUTOS CADASTRADOS ---");

		System.out.printf("| %2s | %15s | %10s | %10s | %14s |\n", "ID", "Nome", "Pre�o", "Quantidade", "Valor Total");

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
		System.out.println("3) Valor unit�rio do produto");
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
			System.out.println("--- EDITAR O VALOR UNIT�RIO DO PRODUTO ---");
			System.out.print("Informe o novo valor unit�rio do produto: ");
			produto.setValorUnitarioDoProduto(tec.nextDouble());

			produto.setQuantidadeDoProduto(produtos.get(idProduto).getQuantidadeDoProduto());
			produto.setNomeDoProduto(produtos.get(idProduto).getNomeDoProduto());

			produtos.set(idProduto, produto);

			produto.setValorTotaldoProduto(produto.getQuantidadeDoProduto() * produto.getValorUnitarioDoProduto());

			break;

		default:
			System.out.println("Op��o inv�lida!");
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
			System.out.println("Produto n�o cadastrado.");
			return;
		}
		
		produtos.remove(idProduto);
	}

}
