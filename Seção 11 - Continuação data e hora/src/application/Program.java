package application;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class Program {
	public static void main(String[] args) {
		
		LocalDate d01 = LocalDate.parse("2023-07-24");
		LocalDateTime d02 = LocalDateTime.parse("2023-07-24T01:30:26");
		Instant d03 = Instant.parse("2023-07-24T01:30:26Z");
		
		LocalDate pastWeekLocalDate = d01.minusDays(7);
		LocalDate nextWeekLocalDate = d01.plusDays(7);
		
		System.out.println("Padrao: " + d01);
		System.out.println("Semana anterior: " + pastWeekLocalDate);
		System.out.println("Semana posterior: " + nextWeekLocalDate);
	
		LocalDateTime pastWeekLocalDateTime = d02.minusDays(7);
		LocalDateTime nextWeekLocalDateTime = d02.plusDays(7);
	
		System.out.println("\nPadrao: " + d02);
		System.out.println("Semana anterior: " + pastWeekLocalDateTime);
		System.out.println("Semana posterior: " + nextWeekLocalDateTime);
		
		Instant pastWeekInstant = d03.minus(7, ChronoUnit.DAYS);
		Instant nextWeekInstant = d03.plus(7, ChronoUnit.DAYS);
		
		System.out.println("\nPadrao: " + d02);
		System.out.println("Semana anterior: " + pastWeekInstant);
		System.out.println("Semana posterior: " + nextWeekInstant);
		
		Duration t1 = Duration.between(pastWeekLocalDate.atStartOfDay(), d01.atStartOfDay());
		Duration t2 = Duration.between(pastWeekLocalDateTime, d02);
		Duration t3 = Duration.between(pastWeekInstant, d03);
		Duration t4 = Duration.between(d02, pastWeekLocalDateTime);
		
		System.out.println("\nLocalDate dias: " + t1.toDays());
		System.out.println("LocalDateTime dias: " + t2.toDays());
		System.out.println("Instant dias: " + t3.toDays());
		System.out.println("LocalDateTime invertido dias: " + t4.toDays());
	}
}
