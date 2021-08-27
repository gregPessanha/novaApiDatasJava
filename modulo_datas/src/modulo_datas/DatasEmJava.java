package modulo_datas;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DatasEmJava {

	public static void main(String[] args) throws ParseException {
		Calendar calendar = Calendar.getInstance();
		
		
		Date date = new Date();
		System.out.println("Data em milisegundos " + calendar.getTimeInMillis());
		System.out.println("Dia do Mês: " + calendar.get(calendar.DAY_OF_MONTH));
		System.out.println("Dia da Semana: " + calendar.get(calendar.DAY_OF_WEEK));
		System.out.println("Hora do dia: " + calendar.get(calendar.HOUR_OF_DAY));
		System.out.println("Ano: " + (calendar.get(calendar.YEAR)));
		System.out.println("Dia do ano: " + calendar.get(calendar.DAY_OF_YEAR));
		System.out.println("Mês: " + calendar.get(calendar.MONTH));
		System.out.println("Segundos: " + calendar.get(calendar.SECOND));
		
		/*---------------------- SIMPLE DATE FORMAT ---------------------- */
		
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		
		System.out.println("Data atual para mostrar ao usuário: " + simpleDateFormat.format(date));
		System.out.println("calendar Data atual para mostrar ao usuário: " + simpleDateFormat.format(calendar.getTime()));
		
		simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
		System.out.println("Data no formato de banco de dados: " + simpleDateFormat.format(date));
		
		System.out.println("Objeto Date: " + simpleDateFormat.parse("1986-04-05"));
		
		
		
		
		
	}
}
