package modulo_datas.nova_api_data_e_hora_java;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class NovaApiJava {

	public static void main(String[] args) {

		LocalDate dataAtual = LocalDate.now();
		System.out.println("Data atual: " + dataAtual.format(DateTimeFormatter.ISO_LOCAL_DATE));
		System.out.println("Data atual: " + dataAtual.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
		System.out.println("");
		
		LocalTime horaAtual = LocalTime.now();
		System.out.println("Hora Atual " + horaAtual.format(DateTimeFormatter.ISO_LOCAL_TIME));
		System.out.println("Hora Atual " + horaAtual.format(DateTimeFormatter.ofPattern("hh:mm:ss")));
		
		System.out.println("");
		LocalDateTime dataEHoraAtual = LocalDateTime.now();
		System.out.println("Data e hora atuais: " + dataEHoraAtual.format(DateTimeFormatter.ofPattern("dd/MM/yyyy hh:mm:ss")));
		System.out.println("Data e hora atuais: " + dataEHoraAtual.format(DateTimeFormatter.ISO_LOCAL_DATE_TIME));
		
		
		
		
		
	}

}
