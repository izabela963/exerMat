package br.com.db1.teste;

import org.junit.Assert;
import org.junit.Test;

import br.com.db1.ExercicioDatas;

public class ExercicioDatasTeste {
	ExercicioDatas exercicioDatas = new ExercicioDatas();
	
	@Test
	public void anoBisextoTest(){
		Assert.assertTrue(false == exercicioDatas.anoBisexto(2000));
	}
	
	@Test
	public void diaUtilTest(){
		Assert.assertTrue(true == exercicioDatas.diaUtil(18, 9, 2017));
	} 
	
	@Test
	public void idadeTest(){
		Assert.assertTrue(20 == exercicioDatas.idade(15, 9, 1997));
	}
}
