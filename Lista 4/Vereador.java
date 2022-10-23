package Exer4;

public class Vereador {
	private String nome;
	private String partido;
	private ProjetoDeLei projetoLei;
	
	
	public Vereador(String nome, String partido, ProjetoDeLei prj) {
		this.nome = nome;
		this.partido = partido;	
		this.projetoLei = prj;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getPartido() {
		return partido;
	}
	public void setPartido(String partido) {
		this.partido = partido;
	}
	
	public String getMostrar() {
		String str = "Vereador: " + this.getNome() + ", Partido: " + this.getPartido() + ", " + projetoLei.mostrar();
		return str;
	}
	
	
									
}
