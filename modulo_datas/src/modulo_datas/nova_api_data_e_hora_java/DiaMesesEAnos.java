package modulo_datas.nova_api_data_e_hora_java;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class DiaMesesEAnos {

	public static void main(String[] args) {

		LocalDate dataAtual = LocalDate.now();
		System.out.println("Data atual: " + dataAtual.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
		
		System.out.println("Dia da semana: " + dataAtual.getDayOfWeek());
		
		System.out.println("Dia do Mês: " + dataAtual.getDayOfMonth());
		
		System.out.println("Número do Mês: " + dataAtual.getMonthValue());

		System.out.println("Duração do Mês: " + dataAtual.lengthOfMonth());
		
		System.out.println("Ano: " + dataAtual.getYear());
		
		System.out.println("Nome do mês: " + dataAtual.getMonth());
		
		System.out.println("Dia do ano: " + dataAtual.getDayOfYear());
		
		
		
		
		
		
		
		
		
		
	}

}
