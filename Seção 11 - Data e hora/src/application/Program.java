package application;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Program {

	public static void main(String[] args) {
		DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		
		LocalDate d01 = LocalDate.now();
		LocalDateTime d02 = LocalDateTime.now();
		Instant d03 = Instant.now();
		
		LocalDate d04 = LocalDate.parse("2023-07-14");
		LocalDateTime d05 = LocalDateTime.parse("2023-07-14T15:00");
		Instant d06 = Instant.parse("2023-07-14T15:00:01Z");
		Instant d07 = Instant.parse("2023-07-14T15:00:01-03:00");
		
		LocalDate d08 = LocalDate.parse("14/07/2023", fmt1);
		LocalDateTime d09 = LocalDateTime.parse("14/07/2023 01:30", fmt2);
		
		LocalDate d10 = LocalDate.of(2023, 7, 14);
		LocalDateTime d11 = LocalDateTime.of(2023, 7, 14, 15, 00);
		
		System.out.println("Data Local = " + d01);
		System.out.println("Data hora local = " + d02);
		System.out.println("Data hora GMT0 = " + d03);
		System.out.println("Data convertida para padrao ISO = " + d04);
		System.out.println("Data hora convertida para padrao ISO = " + d05);
		System.out.println("Data hora convertida para padrao ISO GMT0 = " + d06);
		System.out.println("Data hora, tempo transcorrido = " + d07);
		System.out.println("Data - Texto Personalizado = " + d08);
		System.out.println("Data hora- Texto Personalizado = " + d09);
		System.out.println("Data a partir de texto = " + d10);
		System.out.println("Data hora a partir de texto = " + d11);
	}

}
