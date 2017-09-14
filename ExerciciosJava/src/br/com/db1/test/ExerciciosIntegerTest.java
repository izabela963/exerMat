package br.com.db1.test;

import org.junit.Test;

import br.com.db1.ExerciciosInteger;
import org.junit.Assert;;

public class ExerciciosIntegerTest {
	
	private ExerciciosInteger exerciciosInteger = new ExerciciosInteger();
	
	@Test
	public void exercicio1Test(){
		exerciciosInteger.exercicio1(5, 9);
		Assert.assertTrue(14 == exerciciosInteger.exibirResultado());
	}
	
	@Test
	public void exercicio2Test(){
		exerciciosInteger.exercicio2(5, 9);
		Assert.assertTrue(-4 == exerciciosInteger.exibirResultado());
	}
	
	@Test
	public void exercicio3Test(){
		exerciciosInteger.exercicio3(5, 3);
		Assert.assertTrue(15 == exerciciosInteger.exibirResultado());
	}
	
	@Test
	public void exercicio4Test(){
		exerciciosInteger.exercicio4(9, 3);
		Assert.assertTrue(3 == exerciciosInteger.exibirResultado());
	}
	
	@Test
	public void exercicio5Test(){
		exerciciosInteger.exercicio5(9);
		Assert.assertTrue(false == exerciciosInteger.exibirResposta());
	}
	
	@Test
	public void exercicio6Test(){
		exerciciosInteger.exercicio6(5, 9);
		Assert.assertTrue(9 == exerciciosInteger.exibirResultado());
	}

	@Test
	public void exercicio7Test(){
		exerciciosInteger.exercicio7(95);
		Assert.assertTrue(3 == exerciciosInteger.exibirResultado());
	}


}

	

