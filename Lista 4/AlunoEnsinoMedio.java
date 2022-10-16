package Exer2;

public class AlunoEnsinoMedio extends Aluno {
	
	private int ano;
	
	

	public AlunoEnsinoMedio(String nome, String dataNascimento, int ano) {
		super(nome, dataNascimento);
		this.setAno(ano);
	}


	
	

	@Override
	public String aluno() {
		// TODO Auto-generated method stub
		return null;
	}





	public int getAno() {
		return ano;
	}





	public void setAno(int ano) {
		if (ano >= 1 || ano <= 3) 
		this.ano = ano;
	}
	
	public String mostrar() {
		return this.getNome() + this.getAno() + this.getDataNascimento();	
		}
}
