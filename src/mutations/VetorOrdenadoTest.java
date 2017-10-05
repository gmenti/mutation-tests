package mutations;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class VetorOrdenadoTest {
	private static int FIRST_VALUE = 10;
	
	@Test
	public void posicaoInicialDeveSerZero() {
		VetorOrdenado vetor = new VetorOrdenado(1);
		assertEquals(0, vetor.getNroElem());
	}
	
	@Test
	public void tamanhoDoVetorDeveIncrementarAoAdicionarElemento() {
		VetorOrdenado vetor = new VetorOrdenado(1);
		int initialSize = vetor.getNroElem();
		vetor.ins(1);
		assertEquals(++initialSize, vetor.getNroElem());
	}
	
	@Test
	public void deveRetornarPrimeiroValorInseridoPassandoIndiceZero() {
		VetorOrdenado vetor = new VetorOrdenado(1);
		vetor.ins(1);
		assertEquals(1, vetor.get(0));
	}
	
	@Test
	public void deveRetornarPrimeiroValorInseridoPassandoIndiceNegativo() {
		VetorOrdenado vetor = new VetorOrdenado(10);
		vetor.ins(5);
		assertEquals(5, vetor.get(-1));
	}
	
	@Test
	public void deveRetornarUltimoElementoInseridoPassandoIndiceMaiorQueTamanho() {
		VetorOrdenado vetor = new VetorOrdenado(1);
		vetor.ins(1);
		assertEquals(1, vetor.get(2));
	}
			
	
	@Test
	public void deveRetornarFalseAoInserirValorComVetorCheio() {
		VetorOrdenado vetor = new VetorOrdenado(1);
		vetor.ins(1);
		assertFalse(vetor.ins(2));
	}
	
	@Test
	public void todosOsValoresDevemEstarOrdenados() {
		int amountToAdd = 20;
		
		VetorOrdenado vetor = new VetorOrdenado(amountToAdd);
		
		for (int i = 0; i < amountToAdd; i++) {
			vetor.ins(i);
		}

		for (int i = 0; i < amountToAdd; i++) {
			assertEquals(((amountToAdd - 1) - i), vetor.get(i));
		}
	}
}
