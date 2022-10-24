		
package Questao1;

import java.util.ArrayList;

public class Orcamento {
	private int numeroIdentificacao;
	private char tipo;
	private String nomeCliente;
	private String enderecoCliente;
	private String telefoneCliente;
	private String marcaAutomovel;
	private int quilometragemVeiculo;
	private float qtdHoras;
	private ArrayList<Produto> Produtos = new ArrayList<Produto>();
	
	public Orcamento(int numeroIdentificacao, char tipo, String 
			nomeCliente, String enderecoCliente, String telefoneCliente
			, String marcaAutomovel, int quilometragem, float qtdHoras) {
		this.numeroIdentificacao = numeroIdentificacao;
		this.tipo = tipo;
		this.nomeCliente = nomeCliente;
		this.enderecoCliente = enderecoCliente;
		this.telefoneCliente = telefoneCliente;
		this.marcaAutomovel = marcaAutomovel;
		this.quilometragemVeiculo = quilometragem;
		this.qtdHoras = qtdHoras;
	}
	
	public void cadProd(String descricao, char unidMed, int qtd, float valor, char dificuldade) {
		Produto prod = new Produto(descricao, unidMed, qtd, valor, dificuldade);
		Produtos.add(prod);
	}
	 	
	public float valorMaoObra() {
		return qtdHoras * 70;
	}
	
	public float calculaValorTodosProdutos() {
		float valorTotal = 0;
		for (Produto produto : Produtos) {
			valorTotal += produto.getValor() * produto.getQuantidade();
		}
		
		return valorTotal;
	}
	
	public String produtoMaiorValor() {
		float maiorValor = 0;
		String descMaiorValor = "";
		for (Produto produto : Produtos) {
			if ((produto.getValor() * produto.getQuantidade()) > maiorValor) {
				maiorValor = produto.getValor() * produto.getQuantidade();
				descMaiorValor = produto.getDescricao();
			}
		}
		
		return descMaiorValor;
	}
	
	public boolean existeAltaDificuldade() {
		boolean existe = false;
		for (Produto produto : Produtos) {
			if (produto.getDificuldade() == 'A') {
				existe = true;
				break;
			}
		}
		
		return existe;
	}
	
	public int qtdProdMedia() {
		int qtd = 0;
		for (Produto produto : Produtos) {
			if (produto.getDificuldade() == 'M') {
				qtd += 1;
			}
		}
		
		return qtd;
	}
	
	public float valorTotalOrcamento() {
		float valorProdutos = calculaValorTodosProdutos();
		float maoDeObra = valorMaoObra();
		
		float total = valorProdutos + maoDeObra;
		
		if (tipo == 'P') {
			return (float) (total - (total * 0.10));
		}
		if (tipo == 'E') {
			return (float) (total - (total * 0.07));
		}
		
		return 0;
	}
}
