package br.com.db1;

public class ExercicioMatematica {
	
	public ExercicioMatematica(){
		
	}
	
	public Double menorValor(Double valor1, Double valor2){
		if (valor1 > valor2) {
			System.out.println("O menor valor �: " + valor2);
			return valor2;
		} else if (valor2 > valor1) {
			System.out.println("O menor valor �: " + valor1);
			return valor1;
		} else {
			System.out.println("Os valores s�o iguais a " + valor2);
			return valor2;
		}
	}
	
	public Double menorValor2(Double valor1, Double valor2, Double valor3){
		if ((valor1 >= valor3) && (valor2 >= valor3)) {
			System.out.println("O menor valor �: " + valor3);
			return valor3;
		} else if ((valor2 >= valor1) && (valor3 >= valor1)) {
			System.out.println("O menor valor �: " + valor1);
			return valor1;
		} else {
			System.out.println("O menor valor �: " + valor2);
			return valor2;
		}
	}
	
	public Double media3Numeros (Double valor1, Double valor2, Double valor3){
		Double media = (valor1 + valor2 + valor3)/3;
		System.out.println("A m�dia ponderada dos n�meros: " + valor1 + ", " + valor2 + " e " + valor3 + "�: " + media);
		return media;
	}
	
	public Double areaTriangulo(Double base, Double altura){
		Double area = base * altura;
		System.out.println("A area do triangulo retangulo de base: " + base + " e altura " + altura + " � de: " + area);
		return area;
	}
}
