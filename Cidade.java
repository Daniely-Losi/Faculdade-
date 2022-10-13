package Exer4;

public class Cidade {
	
String nome;
String uf;
int populacaoMasculina;
int populacaoFeminina;
boolean Calculado;
	



	public Cidade(String nome, String uf, int populacaoMasculina, int populacaoFeminina ) {
		this.nome = nome;
		this.uf = uf;
		this.populacaoMasculina = populacaoMasculina;
		this.populacaoFeminina = populacaoFeminina;
		
		
	}


	public String getNome(String string) {

		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getUf() {
		return uf;
	}


	public void setUf(String uf) {
		this.uf = uf;
	}


	public int getPopulacaoMasculina() {
		return populacaoMasculina;
	}


	public void setPopulacaoMasculina(int populacaoMasculina) {
		this.populacaoMasculina = populacaoMasculina;
	}


	public int getPopulacaoFeminina() {
		
		return populacaoFeminina;
	}


	public void setPopulacaoFeminina(int populacaoFeminina) {
		this.populacaoFeminina = populacaoFeminina;
	}
	

	public boolean isCalculado() {
		
	return Calculado;

}
	


public void setCalculado(boolean calculado) {
	
	Calculado = calculado;
}
}
