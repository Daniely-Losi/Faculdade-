package Questao1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

class OrcamentoTeste {

	private Orcamento orc;
	
	@Test
	void test() {
		orc = new Orcamento(1023, 'P', "João", "Rua X, 200.", "(47) 99999-9999", "audi", 89002, 7);
		orc.cadProd("Óleo motor", 'L', 3, 24, 'M');
		orc.cadProd("velas", 'P', 4, 10, 'M');
		orc.cadProd("filtro gasolina", 'P', 1, 34, 'B');
		orc.cadProd("óleo câmbio", 'L', 3, 89, 'A');
		assertEquals(413, orc.calculaValorTodosProdutos());
		assertEquals("óleo câmbio", orc.produtoMaiorValor());
		assertTrue(orc.existeAltaDificuldade());
		assertEquals(490, orc.valorMaoObra());
		assertEquals(812.70, orc.valorTotalOrcamento());
		assertEquals(2, orc.qtdProdMedia());
		
	}

}
