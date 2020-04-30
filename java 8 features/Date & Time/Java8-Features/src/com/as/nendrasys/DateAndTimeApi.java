package com.as.nendrasys;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.Period;
import java.time.Year;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Scanner;

public class DateAndTimeApi {

	public static void main(String[] args) {

		// Local Date
		LocalDate localDate = LocalDate.now();
		System.out.println("Current Date 		 :  " + localDate);
		System.out.println("Day of month         :  " + localDate.getDayOfMonth());
		System.out.println("Day of Year          :  " + localDate.getDayOfYear());
		System.out.println("month's value        :  " + localDate.getMonthValue());
		System.out.println("length of year       :  " + localDate.lengthOfYear());
		System.out.println("month's value        :  " + localDate.getMonthValue());
		System.out.println("Epoch Day value      :  " + localDate.toEpochDay());
		System.out.println("Current Year Year    :  " + localDate.getYear());
		System.out.println("Day of Week          :  " + localDate.getDayOfWeek());
		System.out.println();

		int dd = localDate.getDayOfMonth();
		int mm = localDate.getMonthValue();
		int yyyy = localDate.getYear();

		System.out.println(dd + "." + mm + "." + yyyy);
		// System.out.printf("%d-%d-%d" + dd, mm, yyyy);
		// System.out.printf("%d/%d/%d" + dd, mm, yyyy);

		System.out.println("____________________________________________________");

		// Local Date
		LocalTime localTime = LocalTime.now();
		System.out.println("Current Time		 :  " + localTime);
		System.out.println("Current Hour         :  " + localTime.getHour());
		System.out.println("Current Minutes      :  " + localTime.getMinute());
		System.out.println("Current Seconds      :  " + localTime.getSecond());
		System.out.println("Current NanoSeconds  :  " + localTime.getNano());
		System.out.println("Nano of the day      :  " + localTime.toNanoOfDay());
		System.out.println("Second od the day    :  " + localTime.toSecondOfDay());
		System.out.println();

		int hh = localTime.getHour();
		int min = localTime.getMinute();
		int ss = localTime.getSecond();
		int nn = localTime.getNano();
		// System.out.printf("%d:%d:%d:%d" + hh, min, ss,nn);

		System.out.println("____________________________________________________");

		LocalDateTime localDateTime = LocalDateTime.now();
		System.out.println(localDateTime);
		int mm1 = localDateTime.getDayOfMonth();
		int dd1 = localDateTime.getMonthValue();
		int yyyy1 = localDateTime.getYear();
		System.out.println(mm1 + "-" + dd1 + "-" + yyyy1);
		int min1 = localDateTime.getMinute();
		int sec = localDateTime.getSecond();
		int hour = localDateTime.getHour();
		int ns = localDateTime.getNano();
		System.out.printf("\n%d:%d:%d:%d", hour, min1, sec, ns);
		System.out.println("\n____________________________________________________");

		/* LocalDateTime dateTime = LocalDateTime.of(yyyy1,mm1,dd1,hour,min1,sec,ns); */

		LocalDateTime dateTime = LocalDateTime.of(1995, Month.JANUARY, 12, 9, 56, 45);
		System.out.println(dateTime);
		System.out.println("After  4-months: " + dateTime.plusMonths(4));
		System.out.println("Before 4-months: " + dateTime.minusMonths(4));
		System.out.println("After  4-Days:   " + dateTime.plusDays(4));
		System.out.println("Before 4-Sec:    " + dateTime.minusSeconds(4));
		System.out.println("After  4-weeks   " + dateTime.minusWeeks(4));
		System.out.println("____________________________________________________");

		LocalDate bdy = LocalDate.of(1995, 12, 1);
		LocalDate today = LocalDate.now();
		Period period = Period.between(bdy, today);
		System.out.printf("Your Age is %d years %d months %d days", period.getYears(), period.getMonths(),
				period.getDays());

		System.out.println("____________________________________________________");
		// Chwck the Year is leay year or not

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the year..");
		int year = sc.nextInt();
		Year y = Year.of(year);
		if(y.isLeap()) {
			System.out.println(year + "is leap year");
		}
		else {
			System.out.println(year+"is not leap year");
		}
		
		//check the zone of the Date and Time
		
		ZoneId zone = ZoneId.systemDefault();
		System.out.println(zone);
		ZoneId id=ZoneId.of("America/Los_Angeles");
		ZonedDateTime zonedDateTime = ZonedDateTime.now(id);
		System.out.println(zonedDateTime);
	}

}
