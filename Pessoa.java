package Exerc2;


public class Pessoa {
	
	private String nome;
	private char sexo;
	private int dataNascimento;
	private String estadoCivil;
	public char setSexo;
	
	public Pessoa (String nome, char sexo, int dataNascimento) {
	this.nome = nome;
	this.sexo = sexo;
	this.dataNascimento = dataNascimento;
	this.estadoCivil = "Solteiro"; //padrao//
	
	
}

	public Pessoa() {
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public char getSexo() {
      	return sexo;
	}

	public void setSexo(char sexo) {
		if((sexo == 'M')|| (sexo ==	'F'))	// M ou F//		
		this.sexo = sexo;
	}

	public void  getDataNascimento() {
		return;
	}

	public void setDataNascimento(int i) {
		this.dataNascimento = i;
	}

	public String getEstadoCivil() {
		return estadoCivil;
	}

	public void setEstadoCivil(String estadoCivil) {
		this.estadoCivil = estadoCivil;
	}
	
	


}                     
