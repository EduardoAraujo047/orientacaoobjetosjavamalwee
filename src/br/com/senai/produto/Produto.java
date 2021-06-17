package br.com.senai.produto;

//CLASSE
public class Produto {

	// ATRIBUTOS
	private String nomeDoProduto;
	private double valorUnitarioDoProduto;
	private int quantidadeDoProduto;
	private double valorTotaldoProduto;

	// CONSTRUTOR
	public Produto() {
	}

	public Produto(String nomeDoProduto, double valorUnitarioDoProduto, int quantidadeDoProduto,
			double valorTotaldoProduto) {
		super();
		this.nomeDoProduto = nomeDoProduto;
		this.valorUnitarioDoProduto = valorUnitarioDoProduto;
		this.quantidadeDoProduto = quantidadeDoProduto;
		this.valorTotaldoProduto = valorTotaldoProduto;
	}

	// METODOS
	public String getNomeDoProduto() {
		return nomeDoProduto;
	}

	public void setNomeDoProduto(String nomeDoProduto) {
		this.nomeDoProduto = nomeDoProduto;
	}

	public double getValorUnitarioDoProduto() {
		return valorUnitarioDoProduto;
	}

	public void setValorUnitarioDoProduto(double valorUnitarioDoProduto) {
		this.valorUnitarioDoProduto = valorUnitarioDoProduto;
	}

	public int getQuantidadeDoProduto() {
		return quantidadeDoProduto;
	}

	public void setQuantidadeDoProduto(int quantidadeDoProduto) {
		this.quantidadeDoProduto = quantidadeDoProduto;
	}

	public double getValorTotaldoProduto() {
		this.valorTotaldoProduto = getValorUnitarioDoProduto() * getQuantidadeDoProduto();
		return valorTotaldoProduto;
	}

	public void setValorTotaldoProduto(double valorTotaldoProduto) {
		this.valorTotaldoProduto = valorTotaldoProduto;
	}

}
