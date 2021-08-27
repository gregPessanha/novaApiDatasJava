package modulo_datas.nova_api_data_e_hora_java;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class PeriodosEntreDatas {

	public static void main(String[] args) {

		LocalDate dataAntiga = LocalDate.of(1986, 4, 5);
//		LocalDate dataAntiga = LocalDate.parse("05/04/1986"); /* PASSANDO EM FORMA DE STRING */
		LocalDate dataNova = LocalDate.now();

		System.out.println("Data antiga é posterior à data nova? " + dataAntiga.isAfter(dataNova));

		System.out.println("Data antiga é Anterior à data nova? " + dataAntiga.isBefore(dataNova));

		System.out.println("Datas são iguais? " + dataAntiga.isEqual(dataNova));

		Period periodo = Period.between(dataAntiga, dataNova);

		System.out.println("Dias do período: " + periodo.getDays());
		System.out.println("Total de Meses do periodo: " + periodo.toTotalMonths());
		System.out.println("Anos do período: " + periodo.getYears());
		System.out.println(periodo.getYears() + " anos, " + periodo.getMonths() + " meses e " + periodo.getDays() + " dias");
		System.out.println("---------------------------------------------------------------------------------");
		LocalDate dataAtual = LocalDate.now();

		for (int pos = 1; pos <= 6; pos++) {

			dataAtual = dataAtual.plusMonths(1);
			System.out.println("Parcela nº " + pos);
			System.out.println(dataAtual.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
			System.out.println("************");
		}

	}
}
