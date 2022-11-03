	package Exer2;

public abstract class Aluno {
	
	
	private String nome;
	private String dataNascimento;
	

	public Aluno(String nome, String dataNascimento) {
		super();
		this.nome = nome;
		this.dataNascimento = dataNascimento;
	}


	public Aluno() {
		
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getDataNascimento() {
		return dataNascimento;
	}


	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	
	public abstract String aluno();

}
