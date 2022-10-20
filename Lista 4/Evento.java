package Exer5;

import java.text.DateFormat;

public abstract class Evento {
	private String titulo;
	private double valor;
	private String data;
	private Avaliacao avaliacao;
	

	

	public Evento(String titulo, double valor, String data) {
		this.titulo = titulo;
		this.valor = valor;
		this.data = data;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	public String getData() {
		return data;
	}
	public void setData(String data) {
	
		this.data = data;
	}
	
	public Avaliacao getAvaliacao() {
		return avaliacao;
	}
	public void setAvaliacao(Avaliacao avaliacao) {
		this.avaliacao = avaliacao;
	}
	public String mostra() {
		return this.getTitulo() + " no dia " + this.getData()+ "ingresso a " + this.getValor();

	
	}

	
	
}