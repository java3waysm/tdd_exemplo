package teste;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import controle.CalculadoraBC;
import controle.CalculadoraBCI;


class TesteCalc {
	

	private CalculadoraBCI calc = new CalculadoraBC();
	
	@Test
	public void testeSoma() {
		Integer valorRecebido = calc.somar(50, 20);
		Integer valorEsperado = 70;
		Integer valorNaoEsperado = 90;
		
		Assert.assertEquals(valorEsperado, valorRecebido);
		Assert.assertNotEquals(valorNaoEsperado, valorRecebido);

	}
	
	public void testeSubtracao() {
		Integer valorRecebido = calc.somar(50, 20);
		Integer valorEsperado = 70;
		Integer valorNaoEsperado = 90;
		
		Assert.assertEquals(valorEsperado, valorRecebido);
		Assert.assertNotEquals(valorNaoEsperado, valorRecebido);
		
	}

	
	
	
}
