package br.com.db1;

public class ExercicioMatematica {
	
	public ExercicioMatematica(){
		
	}
	
	public Double menorValor(Double valor1, Double valor2){
		if (valor1 > valor2) {
			System.out.println("O menor valor é: " + valor2);
			return valor2;
		} else if (valor2 > valor1) {
			System.out.println("O menor valor é: " + valor1);
			return valor1;
		} else {
			System.out.println("Os valores são iguais a " + valor2);
			return valor2;
		}
	}
	
	public Double menorValor2(Double valor1, Double valor2, Double valor3){
		if ((valor1 >= valor3) && (valor2 >= valor3)) {
			System.out.println("O menor valor é: " + valor3);
			return valor3;
		} else if ((valor2 >= valor1) && (valor3 >= valor1)) {
			System.out.println("O menor valor é: " + valor1);
			return valor1;
		} else {
			System.out.println("O menor valor é: " + valor2);
			return valor2;
		}
	}
	
}
