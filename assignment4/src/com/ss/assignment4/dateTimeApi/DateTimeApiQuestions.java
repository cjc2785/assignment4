package com.ss.assignment4.dateTimeApi;

import java.time.ZoneId;
import java.time.DayOfWeek;
import java.time.Month;
import java.time.Year;
import java.time.format.TextStyle;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.time.LocalDate;
import java.time.YearMonth;
import java.time.ZonedDateTime;
import java.time.Instant;
import java.time.temporal.TemporalAdjusters;

/*
 * 1) LocalDateTime (java.time.ZonedDateTime)
 *
 */

class TimeQuestion2 {
	
	static LocalDate getPrevThursday(LocalDate date) {
		
		return date.with(TemporalAdjusters.previous(DayOfWeek.MONDAY));
	}
}

/*
 * 3) A ZoneID identifies a timezone and a ZoneOffset represents an offset of 
 * a timezone from UTC. A timezone may have one offset at one period of the year, 
 * and another during another period of the year. zone.getRules().getOffset(LocalDateTime.now())
 * returns a ZoneOffset object representing the current offset for "zone," 
 * an instance of class ZoneId.
 * 
 */


class TimeQuestion4 {
	
	static ZonedDateTime instantToZonedDateTime(Instant instant, ZoneId zone) {
		
		return instant.atZone(zone);
	}
	
	
	static Instant zonedDateTimeToInstant(ZonedDateTime date) {
		return date.toInstant();
	}
}

class TimeQuestion5 {
	
	static void printMonthLengths(int year) {
		
		for(int i = 1; i <= 12; ++i) {
			YearMonth yearMonth = YearMonth.of(year, i);
			int length = yearMonth.lengthOfMonth();
			String name = Month.of(i).getDisplayName(TextStyle.FULL, Locale.ENGLISH);
			System.out.println(name + ": " + length + " days");
		}
	}
}

class TimeQuestion6 {
	
	static void printMondays(int monthNum) {
		
		int year = Year.now().getValue();
		YearMonth yearMonth = YearMonth.of(year, monthNum);
		int length = yearMonth.lengthOfMonth();
		
		for(int i = 1; i <= length; ++i) {
			
			LocalDate day = yearMonth.atDay(i);
			DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/YYYY");
			String display = formatter.format(day);
			System.out.println(display);
		}
	}
}


class TimeQuestion7 {
	
	static boolean isFridayThe13th(LocalDate date) {
		
		DayOfWeek weekDay = date.getDayOfWeek();
		int monthDay = date.getDayOfMonth();
		
		return weekDay == DayOfWeek.FRIDAY && monthDay == 13;
	}
}
