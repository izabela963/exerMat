package br.com.db1.test;

import org.junit.Assert;
import org.junit.Test;

import br.com.db1.ExerciciosString;

public class ExerciciosStringTest {
	ExerciciosString exerciciosString = new ExerciciosString();
	
	
	@Test
	public void exercicio01Test(){
		exerciciosString.exercicio01("Hello, world");
		Assert.assertTrue(exerciciosString.exibirResposta().equals("HELLO, WORLD"));
	}
	
	@Test
	public void exercicio02Test(){
		exerciciosString.exercicio02("HellO");
		Assert.assertTrue(exerciciosString.exibirResposta().equals("hello"));
	}
	
	@Test
	public void exercicio03Test(){
		exerciciosString.exercicio03("DB1START");
		Assert.assertTrue(8 == exerciciosString.exibirResultado());
	}
	
	@Test
	public void exercicio04Test(){
		exerciciosString.exercicio04(" DB1START ");
		Assert.assertTrue(8 == exerciciosString.exibirResultado());
	}
	
	@Test
	public void exercicio05Test(){
		exerciciosString.exercicio05(" DB1START ");
		Assert.assertTrue("DB1START".equals(exerciciosString.exibirResposta()));
	}
	
	@Test
	public void exercicio06Test(){
		exerciciosString.exercicio06("Izabela Cristina Cardozo");
		Assert.assertTrue("Izab".equals(exerciciosString.exibirResposta()));
	}
	
	@Test
	public void exercicio07Test(){
		exerciciosString.exercicio07("Izabela Cristina Cardozo");
		Assert.assertTrue("bela Cristina Cardozo".equals(exerciciosString.exibirResposta()));
	}
	
	@Test
	public void exercicio08Test(){
		exerciciosString.exercicio08("Izabela Cristina Cardozo");
		Assert.assertTrue("dozo".equals(exerciciosString.exibirResposta()));
	}
	
	@Test
	public void exercicio09Test(){
		exerciciosString.exercicio09("Izabela Cristina Cardozo");
		Assert.assertTrue("ALUNO/ALUNA Cristina Cardozo".equals(exerciciosString.exibirResposta()));
	}
	
	@Test
	public void exercicio10Test(){
		exerciciosString.exercicio10("banana, maçã, melancia");
		Assert.assertTrue("banana".equals(exerciciosString.exibirRespostas()[0]));
		Assert.assertTrue("maçã".equals(exerciciosString.exibirRespostas()[1]));
		Assert.assertTrue("melancia".equals(exerciciosString.exibirRespostas()[2]));
	}
	
	@Test
	public void exercicio11Test(){
		exerciciosString.exercicio11("Izabela Cristina Cardozo");
		Assert.assertTrue(10 == exerciciosString.exibirResultado());
	}
	
	
	@Test
	public void exercicio12Test(){
		exerciciosString.exercicio12("Izabela");
		Assert.assertTrue("alebazI".equals(exerciciosString.exibirResposta()));
	}

}
