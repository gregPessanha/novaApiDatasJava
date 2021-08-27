package modulo_datas.nova_api_data_e_hora_java;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class DiaMesesEAnos {

	public static void main(String[] args) {

		LocalDate dataAtual = LocalDate.now();
		System.out.println("Data atual: " + dataAtual.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
		
		System.out.println("Dia da semana: " + dataAtual.getDayOfWeek());
		
		System.out.println("Dia do M�s: " + dataAtual.getDayOfMonth());
		
		System.out.println("N�mero do M�s: " + dataAtual.getMonthValue());

		System.out.println("Dura��o do M�s: " + dataAtual.lengthOfMonth());
		
		System.out.println("Ano: " + dataAtual.getYear());
		
		System.out.println("Nome do m�s: " + dataAtual.getMonth());
		
		System.out.println("Dia do ano: " + dataAtual.getDayOfYear());
		
		
		
		
		
		
		
		
		
		
	}

}
