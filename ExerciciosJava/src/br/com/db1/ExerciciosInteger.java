package br.com.db1;

public class ExerciciosInteger {
	
	private Integer resultado;
	private Boolean resposta;
	private String solucao = " ";
	
	public ExerciciosInteger(){
		resultado = 0;
		resposta = false;
		solucao = " ";
	}
	
	public Integer exibirResultado(){
		return resultado;
	}
	
	public Boolean exibirResposta(){
		return resposta;
	}
	
	public String exibirSolucao(){
		return solucao;
	}
	
	public void exercicio1(Integer valor1, Integer valor2){
		resultado = valor1 + valor2 ; 
	}
	
	public void exercicio2(Integer valor1, Integer valor2){
		resultado = valor1 - valor2;
	}
	
	public void exercicio3(Integer valor1, Integer valor2){
		resultado = valor1 * valor2;
	}
	
	public void exercicio4(Integer valor1, Integer valor2){
		resultado = valor1 / valor2;
	}

	public void exercicio5(Integer valor){
		if (valor%2 == 0) {
			resposta = true;
			System.out.println("O número é par.");
		} else {
			resposta = false;
			System.out.println("O número é ímpar.");
		}
	}
	
	public void exercicio6(Integer valor1, Integer valor2){
		if (valor1 >= valor2) {
			resultado = valor1;
		} else {
			resultado = valor2;
		}
		System.out.println("O maior número é: " + resultado);
	}
	
	public void exercicio7(Integer numero){
		if (numero<= 100) {
			System.out.println(" ");
			System.out.println("Números ímpares maiores ou iguais a " + numero + ": ");
			for (int i = numero; i <= 100; i++) {
				if (i%2 != 0) {
					System.out.print(i + ", ");
					resultado++;
				}
			}
		} else {
			System.out.println("ERRO");
		}
	}

}
