package Exer4;

public class Cidadeteste {

	public static void main(String[] args) {
		
		Cidade gaspar = new Cidade("", "", 0, 0);//exemplo1
		gaspar.setNome( "Gapar" );//exemplo2 
		gaspar.setUf( "SC" );
		gaspar.setPopulacaoMasculina(28141);
		
		
		
		Cidade indaial = new Cidade("", "", 0, 0);
		indaial.setNome("Indaial");
		indaial.setPopulacaoFeminina(25844);
		indaial.setCalculado(false);
	
		
		
	
		Cidade blumenau = new Cidade("Blumenau","", 154580, 165420); // 
		blumenau.setNome("Blumenau");
		blumenau.setPopulacaoFeminina(154580);
		blumenau.setPopulacaoMasculina(165420);
		
		
		//testeeee 
		System.out.println("Nome: " + gaspar.nome + "\nUF: "+ gaspar.uf +"\nPopulaçao Masculina " + gaspar.populacaoMasculina);
		System.out.println("Nome: " + indaial.nome + "\nPopulaçao Feminina " + indaial.populacaoFeminina + "\n" + indaial.Calculado);
		System.out.println("Nome: " + blumenau.nome + "\nPopulaçao Feminina " + blumenau.populacaoFeminina +"\nPopulaçao Masculina "+ blumenau.populacaoMasculina);

	}

}
