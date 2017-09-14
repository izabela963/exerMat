package br.com.db1;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.YearMonth;
import java.util.Date;

public class ExercicioDatas {
	
	
	public ExercicioDatas(){
		
	}
	
	
	public Boolean anoBisexto(Integer ano){
		if ((ano%4 == 0) && (ano%100 != 0)) {
			System.out.println("O ano " + ano + " é bisexto.");
			return true;
			
		} else {
			System.out.println("O ano " + ano + " não é bisexto.");
			return false;
			
		}
	}
	
	public Boolean diaUtil(Integer dia, Integer mes, Integer ano){
		YearMonth anoMes = YearMonth.of(ano, mes);
		LocalDate data = anoMes.atDay(dia);
		if ((data.getDayOfWeek().equals(DayOfWeek.SATURDAY)) || 
				(data.getDayOfWeek().equals(DayOfWeek.SUNDAY))) {
			System.out.println("Não é dia útil.");
			return false;
		} else {
			System.out.println("É dia útil.");
			return true;
		}

	}
	
	public Integer idade(Integer dia, Integer mes, Integer ano){
		Date data = new Date(System.currentTimeMillis());
		Integer diaAtual = data.getDay();
		System.out.println(diaAtual);
		Integer mesAtual = data.getMonth();
		System.out.println(mesAtual);
		Integer anoAtual = data.getYear();
		System.out.println(anoAtual);
		if ((ano < anoAtual)) {
			if (mes < mesAtual) {
					Integer idade = anoAtual - ano;
					System.out.println(idade);
					return idade;
			} else if (mes == mesAtual) {
				if (dia <= diaAtual) {
					Integer idade = anoAtual - ano;
					System.out.println(idade);
					return idade;
				} else {
					Integer idade = anoAtual - ano - 1;
					System.out.println(idade);
					return idade;
				}
			} else {
				Integer idade = anoAtual - ano - 1;
				System.out.println(idade);
				return idade;
			}
		} else {
			System.out.println("Ano inválido!");
			return 0;
		}
	}
	
}
