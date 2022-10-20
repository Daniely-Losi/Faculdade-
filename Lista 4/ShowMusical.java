package Exer5;


public class ShowMusical extends Evento {
	private String banda;
	private String estiloMusical;
	public ShowMusical(String titulo, double valor, String data, String banda, String estiloMusical) {
		super(titulo, valor, data);
		this.banda = banda;
		this.estiloMusical = estiloMusical;
	}
	public String getBanda() {
		return banda;
	}
	public void setBanda(String banda) {
		this.banda = banda;
	}
	public String getEstiloMusical() {
		return estiloMusical;
	}
	public void setEstiloMusical(String estiloMusical) {
		this.estiloMusical = estiloMusical;
	}
	public String mostra() {
		return this.getTitulo() + " no dia " + this.getData()+ 
				" ingresso a  " + this.getValor() + this.getBanda() + this.getEstiloMusical();
	
}
}