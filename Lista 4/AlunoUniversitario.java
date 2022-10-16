package Exer2;

public class AlunoUniversitario extends Aluno {
	 
	private char formaIngresso;
	private Curso curso;
	
	

	public AlunoUniversitario(String nome, String dataNascimento, Curso curso, char formaIngresso) {
		super(nome, dataNascimento);
		this.setFormaIngresso(formaIngresso);
		this.setCurso(curso);
	}



	@Override
	public String aluno() {
		
		return null;
	}



	public char getFormaIngresso() {
		return formaIngresso;
	}



	public void setFormaIngresso(char formaIngresso) {
		if((formaIngresso == 'V')||(formaIngresso == 'E')||(formaIngresso == 'S')||(formaIngresso == 'T')||(formaIngresso == 'I')) {
			this.formaIngresso = formaIngresso;
		}
	}

	public String mostra() {
		return this.getNome() + " é aluno  universitário do curso de " + this.getSigla()+ " " + this.getCurso() + " ingressado por" + this.getFormaIngresso();
	
	}



	private String getSigla() {
		return null;
	}



	public Curso getCurso() {
		return curso;
	}



	public void setCurso(Curso curso) {
		this.curso = curso;
	}
	
	
	
}


