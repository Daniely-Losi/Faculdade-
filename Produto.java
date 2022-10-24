package Questao1;

public class Produto {
	private String descricao;
	private char unidadeMedida;
	private int quantidade;
	private float valor;
	private char dificuldade;
	
	public Produto(String descricao, char unidadeMedida, 
			int quantidade, float valor, char dificuldade) {
		this.descricao = descricao;
		this.unidadeMedida = unidadeMedida;
		this.quantidade = quantidade;
		this.valor = valor;
		this.dificuldade = dificuldade;
	}
	
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public char getUnidadeMedida() {
		return unidadeMedida;
	}
	public void setUnidadeMedida(char unidadeMedida) {
		this.unidadeMedida = unidadeMedida;
	}
	public int getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	public float getValor() {
		return valor;
	}
	public void setValor(float valor) {
		this.valor = valor;
	}
	public char getDificuldade() {
		return dificuldade;
	}
	public void setDificuldade(char dificuldade) {
		this.dificuldade = dificuldade;
	}
	
	
}
