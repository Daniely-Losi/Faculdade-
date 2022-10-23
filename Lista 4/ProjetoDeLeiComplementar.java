package Exer4;

public class ProjetoDeLeiComplementar extends ProjetoDeLei {
	private String artigo;
	private int qntVotos;
	
	public ProjetoDeLeiComplementar(String titulo, String dataApresentacao, 
		String dataAprovacao, int numeroProjeto,String artigo, int qntVotos) {
		super(titulo, dataApresentacao, dataAprovacao, numeroProjeto);
		this.artigo = artigo;
		this.qntVotos = qntVotos;
	}

	public String getArtigo() {
		return artigo;
	}

	public void setArtigo(String artigo) {
		this.artigo = artigo;
	}

	public int getQntVotos() {
		return qntVotos;
	}

	public void setQntVotos(int qntVotos) {
		this.qntVotos = qntVotos;
	}
	public String mostrar(){
		return this.getArtigo() + this.getQntVotos();
		}		
	}
	
