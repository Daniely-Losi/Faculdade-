package Exer2;

public class Curso {
			
		private String sigla;
		private String nomeCurso;
		public Curso(String nomeCurso, String sigla) {
			super();
			this.sigla = sigla;
			this.nomeCurso = nomeCurso;
		}
		public String getSigla() {
			return sigla;
		}
		public void setSigla(String sigla) {
			if(sigla.length()==3)
			this.sigla = sigla;
		}
		public String getNomeCurso() {
			return nomeCurso;
		}
		public void setNomeCurso(String nomeCurso) {
			if(nomeCurso.length() >= 5)
			this.nomeCurso = nomeCurso;
		}
		
		

			
		}
		
		