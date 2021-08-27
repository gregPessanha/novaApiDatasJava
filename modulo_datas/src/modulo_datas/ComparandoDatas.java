package modulo_datas;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class ComparandoDatas {

	public static void main(String[] args) throws ParseException {

		Calendar calendar = Calendar.getInstance();
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
		

		Date dataVencimentoBoleto = simpleDateFormat.parse("11/08/2021");

		Date dataHoje = simpleDateFormat.parse("25/08/2021");

		if (dataVencimentoBoleto.after(dataHoje)) {
			System.out.println("Boleto ainda não venceu!");
		} else {
			System.out.println("Boleto vencido. Pague Imediatamente!");
		}
	}
}
