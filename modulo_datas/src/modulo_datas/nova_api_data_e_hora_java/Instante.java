package modulo_datas.nova_api_data_e_hora_java;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;

public class Instante {

	public static void main(String[] args) throws InterruptedException {
		Instant inicio = Instant.now();
		
		Thread.sleep(2000);
		
		Instant fim = Instant.now();
		
		Duration duracao = Duration.between(inicio, fim);
		
		System.out.println("Dura��o em NanoSegundos " + duracao.toNanos());
		System.out.println("Dura��o em Minutos " + duracao.toMinutes());
		System.out.println("Dura��o em segundos " + duracao.toSeconds());
		System.out.println("Dura��o em Horas " + duracao.toHours());
		System.out.println("Dura��o em Milissegundos " + duracao.toMillis());
		System.out.println("Dura��o em dias " + duracao.toDays());

	}

}
