package modulo_datas;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;

public class Boletos {

	public static void main(String[] args) throws ParseException {

		/*
		 * Date dataInicial = new SimpleDateFormat("dd/MM/yyyy").parse("01/01/2021");
		 * 
		 * Calendar calendar = Calendar.getInstance(); calendar.setTime(dataInicial);
		 * 
		 * for (int parcela = 1; parcela <= 5; parcela++) { calendar.add(calendar.MONTH,
		 * 1); System.out.println("Parcela Nº " + parcela + "\nVencimento em " + new
		 * SimpleDateFormat("dd/MM/yyyy").format(calendar.getTime()));
		 * System.out.println("------------------------------"); }
		 */
		
		System.out.println("----------------------------------------------------------------------------------------------------------------------------");
		System.out.println("----------------------------------------------------------------------------------------------------------------------------");
		
		LocalDate dataAtual = LocalDate.now();
		
		for(int pos = 1; pos <= 6; pos++) {
			
			System.out.println("Parcela nº " + pos);
			System.out.println(dataAtual.plusMonths(pos).format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
			System.out.println("************");
		}

	}
}
