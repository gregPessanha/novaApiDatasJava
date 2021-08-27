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
		
		System.out.println("Duração em NanoSegundos " + duracao.toNanos());
		System.out.println("Duração em Minutos " + duracao.toMinutes());
		System.out.println("Duração em segundos " + duracao.toSeconds());
		System.out.println("Duração em Horas " + duracao.toHours());
		System.out.println("Duração em Milissegundos " + duracao.toMillis());
		System.out.println("Duração em dias " + duracao.toDays());

	}

}
