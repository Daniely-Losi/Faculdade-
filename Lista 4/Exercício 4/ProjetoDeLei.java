package Exer4;

public  class ProjetoDeLei {
	private String titulo;
	private String dataApresentacao;
	private String dataAprovacao;
	private int numeroProjeto;
	
	public ProjetoDeLei(String titulo, String dataApresentacao, String dataAprovacao, int numeroProjeto) {
		this.titulo = titulo;
		this.dataApresentacao = dataApresentacao;
		this.dataAprovacao = dataAprovacao;
		this.numeroProjeto = numeroProjeto;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getDataApresentacao() {
		return dataApresentacao;
	}

	public void setDataApresentacao(String dataApresentacao) {
		this.dataApresentacao = dataApresentacao;
	}

	public String getDataAprovacao() {
		return dataAprovacao;
	}

	public void setDataAprovacao(String dataAprovacao) {
		this.dataAprovacao = dataAprovacao;
	}

	public int getNumeroProjeto() {
		return numeroProjeto;
	}

	public void setNumeroProjeto(int numeroProjeto) {
		this.numeroProjeto = numeroProjeto;
	}
	public  String mostrar() {
		return this.getTitulo() + this.getNumeroProjeto()+ this.getDataAprovacao() + this.getDataApresentacao();
	}
	{
		}
		 
 {
	}

	
}
