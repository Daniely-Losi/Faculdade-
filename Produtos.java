package Exerc3;


public class Produtos {
	
	String nome;
	String descricao;
	private double precoUni;
	private int desconto;
	
	public Produtos(String nome, String descricao, double precoUni, int desconto) {
		this.nome = nome;
		this.descricao = descricao;
		this.precoUni = precoUni;
		this.desconto = desconto;
		
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public double getPrecoUni() {
		return precoUni;
	}

	public void setPrecoUni(double precoUni) {
		this.precoUni = precoUni;
	}

	public int getDesconto() {
		return desconto;
	}

	public void setDesconto(int desconto) {
		this.desconto = desconto;
	}
	
	
	
	

}
