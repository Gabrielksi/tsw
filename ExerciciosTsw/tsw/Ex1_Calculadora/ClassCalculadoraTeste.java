package Ex1_Calculadora;

import static org.junit.Assert.*;
import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;

public class ClassCalculadoraTeste {

	ClassCalculadora calculadora;
	@Before
	public void setUp() throws Exception {
		calculadora = new ClassCalculadora();
	}

	@Test
	public void somarTeste() {
		String numero1 = "4";
		String numero2 = "6";
		int resultado = calculadora.somar(numero1, numero2);
		int valorEsperado = 10;
		assertEquals(valorEsperado, resultado);
	}
	
	@Test(expected=RuntimeException.class)
	public void somarSemValorTest() {
		String numero1 = "";
		String numero2 = "";
		int resultado = calculadora.somar(numero1, numero2);
		assertNull(resultado);
	}
	
	@Test
	public void somarValorNegativoTest() {
		String numero1 = "-4";
		String numero2 = "-6";
		int resultado = calculadora.somar(numero1, numero2);
		int valorEsperado = -10;
		assertEquals(valorEsperado, resultado);
	}
	
	@Test
	public void dividir2Por20Test() {
		String numero1 = "2";
		String numero2 = "20";
		double resultado = calculadora.dividir(numero1, numero2);
		double valorEsperado = 0.1;
		assertEquals(valorEsperado, resultado, 0);
	}
	
	@Test
	public void dividir20Por2Test() {
		String numero1 = "20";
		String numero2 = "2";
		double resultado = calculadora.dividir(numero1, numero2);
		double valorEsperado = 10;
		assertEquals(valorEsperado, resultado, 0);
	}
	
	@Test(expected=RuntimeException.class)
	public void dividirSemValor() {
		String numero1 = "20";
		String numero2 = "";
		double resultado = calculadora.dividir(numero1, numero2);
		assertNull(resultado);
	}
	
	@Test
	public void dividirFloatTest() {
		String numero1 = "2.5";
		String numero2 = "2";
		double resultado = calculadora.dividir(numero1, numero2);
		double valorEsperado = 1.25;
		assertEquals(valorEsperado, resultado, 0);
	}
	
	@Test
	public void raizQuadradaTest() {
		String numero = "4";
		double resultado = calculadora.raizQuadrada(numero);
		double valorEsperado = 2;
		assertEquals(valorEsperado, resultado, 0);
	}
}
