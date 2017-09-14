package br.com.db1;

public class ExerciciosString {

	private String resposta;
	private String[] respostas;
	private Integer resultado;
	

	public ExerciciosString(){
		resposta = null;
		resultado = null;
	}

	public Integer exibirResultado(){
		return resultado;
	}
	
	public String exibirResposta(){
		return resposta;
	}
	
	public String[] exibirRespostas(){
		return respostas;
	}
	
	public void exercicio01(String texto){
		resposta = texto.toUpperCase();
		System.out.println(resposta);
	}
	
	public void exercicio02(String texto){
		resposta = texto.toLowerCase();
		System.out.println(resposta);
	}
	
	public void exercicio03(String texto){
		resultado = texto.length();
		System.out.println("A palavra " + texto + " tem " + resultado + " letras.");
	}
	

	public void exercicio04(String texto){
		String textoCortado = texto.trim();
		resultado = textoCortado.length();
		System.out.println("A frase: '" + texto + "' tem " + resultado + " letras.");
	}
	
	public void exercicio05(String texto){
		String textoCortado = texto.trim();
		System.out.println("A frase: '" + texto + "' sem os espaços fica: " + textoCortado);
		resposta = textoCortado;
	}
	
	public void exercicio06(String texto){
		String textoCortado = texto.trim();
		String primeiras4Letras = textoCortado.substring(0, 4);
		resposta = primeiras4Letras;
		System.out.println("As 4 primeiras letras são: " + primeiras4Letras);
	}
	
	public void exercicio07(String texto){
		String textoCortado = texto.trim();
		Integer fimDaString = textoCortado.length();
		String sem3Letras = textoCortado.substring(3, fimDaString);
		resposta = sem3Letras;
		System.out.println("As 4 primeiras letras são: " + sem3Letras);
	}
	
	public void exercicio08(String texto){
		String textoCortado = texto.trim();
		Integer fimString = textoCortado.length();
		Integer inicioString = textoCortado.length() - 4;
		String ultimas4Letras = textoCortado.substring(inicioString, fimString);
		resposta = ultimas4Letras;
		System.out.println("As últimas 4 letras são: " + ultimas4Letras);
	}
	
	public void exercicio09(String texto){
		String textoCortado = texto.trim();
		char s[] = " ".toCharArray();
		Integer tamanho1Nome = null;
		for (int i = 0; i < textoCortado.length(); i++) {
			if (textoCortado.charAt(i) == s[0]) {
				tamanho1Nome = i;
				i = textoCortado.length();
			}
		}
		String novoNome;
		novoNome = textoCortado.replaceFirst(textoCortado.substring(0, tamanho1Nome), "ALUNO/ALUNA" );
		resposta = novoNome;
		System.out.println(novoNome);
	}
	
	public void exercicio10(String texto){
		String textoCortado = texto.trim();
		respostas = textoCortado.split(", ");
		for (int i = 0; i < 3; i++) {
			System.out.println(respostas[i]);
		}		
	}
	
	
	public void exercicio11(String texto){
		String textoCortado = texto.trim();
		Integer numeroVogais = 0;
		for (int i = 0; i < textoCortado.length(); i++) {
			if ((textoCortado.charAt(i) == 'A') || (textoCortado.charAt(i) == 'a') ||
				      (textoCortado.charAt(i) == 'E') || (textoCortado.charAt(i) == 'e') ||
				      (textoCortado.charAt(i) == 'I') || (textoCortado.charAt(i) == 'i') ||
				      (textoCortado.charAt(i) == 'O') || (textoCortado.charAt(i) == 'o') ||
				      (textoCortado.charAt(i) == 'U') || (textoCortado.charAt(i) == 'u')) {
				      numeroVogais++;
				   }
		}

		resultado = numeroVogais;
		System.out.println("A frase '" + textoCortado + "' tem " + numeroVogais + " vogais.");
	}
	
	public void exercicio12(String texto){
		String textoCortado = texto.trim();
		resposta = new StringBuilder(textoCortado).reverse().toString();
		System.out.println(resposta);
	} 
	
	
}
