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
	
	@Test
	public void media3NumerosTest(){
		Assert.assertTrue(6d == exercicioMatematica.media3Numeros(1d, 2.5, 14.5));
	}
	
	@Test
	public void areaTrianguloTest(){
		Assert.assertTrue(6d == exercicioMatematica.areaTriangulo(3d, 2.0));
	}
}
