package br.com.db1;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.YearMonth;
import java.util.Date;
import java.util.Calendar;

public class ExercicioDatas {
	
	
	public ExercicioDatas(){
		
	}
	
	
	public Boolean anoBisexto(Integer ano){
		if ((ano%4 == 0) && (ano%100 != 0)) {
			System.out.println("O ano " + ano + " � bisexto.");
			return true;
			
		} else {
			System.out.println("O ano " + ano + " n�o � bisexto.");
			return false;
			
		}
	}
	
	public Boolean diaUtil(Integer dia, Integer mes, Integer ano){
		YearMonth anoMes = YearMonth.of(ano, mes);
		LocalDate data = anoMes.atDay(dia);
		if ((data.getDayOfWeek().equals(DayOfWeek.SATURDAY)) || 
				(data.getDayOfWeek().equals(DayOfWeek.SUNDAY))) {
			System.out.println("N�o � dia �til.");
			return false;
		} else {
			System.out.println("� dia �til.");
			return true;
		}

	}
	
	public Integer idade(Integer dia, Integer mes, Integer ano){
			Calendar data = Calendar.getInstance();
			Integer diaAtual = data.get(Calendar.DAY_OF_MONTH);
			Integer mesAtual = data.get(Calendar.MONTH) + 1;
			Integer anoAtual = data.get(Calendar.YEAR);
			Integer idade = null;
			
			if (ano <= anoAtual) {
				if (mes == mesAtual){
					if (diaAtual >= dia) {
						idade = anoAtual - ano;
						System.out.println("A idade �: " + idade);
						return idade;
					} else {
						idade = anoAtual - ano - 1;
						System.out.println("A idade �: " + idade);
						return idade;
					}
				} else if (mes > mesAtual) {
					idade = anoAtual - ano - 1;
					System.out.println("A idade �: " + idade);
					return idade;
				} else if (mes < mesAtual) {
					idade = anoAtual - ano;
					System.out.println("A idade �: " + idade);
					return idade;
				}
			} else {
				System.out.println("Data inserida inv�lida!");
				return null;
			}
			
			return 20;
		
	}
	
}
