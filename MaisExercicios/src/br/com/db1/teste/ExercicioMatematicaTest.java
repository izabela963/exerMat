package br.com.db1.teste;

import org.junit.Assert;
import org.junit.Test;

import br.com.db1.ExercicioMatematica;

public class ExercicioMatematicaTest {
	
	ExercicioMatematica exercicioMatematica = new ExercicioMatematica();
	
	
	@Test
	public void menorValorTest(){
		
		Assert.assertTrue(2d == exercicioMatematica.menorValor(3d, 2d));
		
	}
	
	@Test
	public void menorValor2Test(){
		Assert.assertTrue(5d == exercicioMatematica.menorValor2(34d, 45.123, 5.0));
	}
}
