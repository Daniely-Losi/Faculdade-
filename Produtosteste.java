package Exerc3;

public class Produtosteste {
	
public  void main(String [] agrs) {
		
		Produtos produto1  = new Produtos("Caderno","Caderno espiral tamanho medio", 4.50, 15);
		produto1.setNome("Caderno");
		produto1.setDescricao("Caderno espiral tamanho medio");
		produto1.setPrecoUni(4.50);
		produto1.setDesconto(15);
		
		Produtos produto2 = new Produtos("Caneta ESF","Caneta esferografica", 1.20, 2);
		produto2.setNome("Caneta ESF");
		produto2.setDescricao("Caneta esferografica");
		produto2.setPrecoUni(1.20);
		produto2.setDesconto(2);
		
		Produtos produto3 = new Produtos("Esquadro","Esquadro de acrilico 20cm", 2.35,10);
		produto3.setNome("Esquadro");
		produto3.setDescricao("Esquadro de acrilico 20cm");
		produto3.setPrecoUni(2.35);
		produto3.setDesconto(10);
		
		}
}
