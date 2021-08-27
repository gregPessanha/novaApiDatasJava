package modulo_datas;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.Calendar;

public class ManipulandoDatas {

	public static void main(String[] args) throws ParseException {

		Calendar calendar = Calendar.getInstance(); /* PEGA A DATA ATUAL */

		calendar.setTime(new SimpleDateFormat("dd/MM/yyyy").parse("10/03/2021"));
		/* DEFININDO UMA DATA QUALQUER */
		
//		calendar.add(calendar.DAY_OF_MONTH, 5); /* ADICIONANDO 5 DIAS AO DIA ATUAL; */
//
//		System.out.println(new SimpleDateFormat("dd/MM/yyyy").format(calendar.getTime()));
//
//		calendar.add(calendar.MONTH, 2); /* ADICIONANDO 2 MESES AO MÊS ATUAL; */
//		System.out.println(new SimpleDateFormat("dd/MM/yyyy").format(calendar.getTime()));


		long dias = ChronoUnit.DAYS.between(LocalDate.parse("1986-04-05"), LocalDate.now());
		System.out.println("Já vivi " + dias + " dias.");
		
	
	
	}

}
