package application;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class Program2 {
	public static void main(String[] args) {
		
		LocalDate d01 = LocalDate.parse("2023-07-14");
		LocalDateTime d02 = LocalDateTime.parse("2023-07-14T15:00:01");
		Instant d03 = Instant.parse("2023-07-14T15:00:01Z");
		
		DateTimeFormatter fmt01 = DateTimeFormatter.ofPattern("dd/MM/yy");
		DateTimeFormatter fmt02 = DateTimeFormatter.ofPattern("dd/MM/yy HH:mm");
		DateTimeFormatter fmt03 = DateTimeFormatter.ofPattern("dd/MM/yy HH:mm").withZone(ZoneId.systemDefault());
		DateTimeFormatter fmt04 = DateTimeFormatter.ISO_DATE_TIME;
		
		System.out.println("d01 = " + d01.format(fmt01));
		System.out.println();
		System.out.println("d02 = " + d02.format(fmt02));
		System.out.println();
		System.out.println("d03 = " + fmt03.format(d03));
		System.out.println();
		System.out.println("d02 = " + fmt04.format(d02));
	}
}
