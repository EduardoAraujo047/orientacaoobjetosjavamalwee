package br.com.senai.exemplo;

public class Pessoa {
	
	private String nome;
	private int anoDeNascimento;
	private String  sexo;
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void setAnoDeNascimento(int anoDeNascimento) {
		this.anoDeNascimento = anoDeNascimento;
	}
	public int getAnoDeNascimento() {
		return anoDeNascimento;
	}
	
	public String getSexo() {
		return sexo;
	}
	
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
}