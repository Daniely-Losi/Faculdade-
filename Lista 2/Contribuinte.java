package Exerc1;

public class Contribuinte {
	private String nome;
	private String cpf;
	private String uf;
	private double RendaAnual;
	
	public Contribuinte(String nome, String cpf, String uf, double RendaAnual) {
		this.nome = nome;
		this.cpf = cpf;
		this.uf = uf;
		this.RendaAnual = RendaAnual;
	}
	
	public double CalculaImposto() {
		if(RendaAnual > 0 && RendaAnual <= 4000){
			return RendaAnual * 0;
		}
		if(RendaAnual > 4000 && RendaAnual <= 9000){
			return RendaAnual * 0.058;
		}
		if(RendaAnual > 9000 && RendaAnual <= 25000){
			return RendaAnual * 0.15;
		}
		if(RendaAnual > 25000 && RendaAnual <= 35000){
			return RendaAnual * 0.275;
		}
		if(RendaAnual > 35000){
			return RendaAnual * 0.30;
		}
		
		return 0;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getUf() {
		return uf;
	}

	public void setUf(String uf) {
		this.uf = uf;
	}

	public double getRendaAnual() {
		return RendaAnual;
	}

	public void setRendaAnual(double rendaAnual) {
		RendaAnual = rendaAnual;
	}
}
