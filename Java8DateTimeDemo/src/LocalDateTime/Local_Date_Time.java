package LocalDateTime;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoField;

public class Local_Date_Time {
	public static void main(String[] args) {
		// LocalDateTime now()Example
		LocalDateTime now = LocalDateTime.now();  
        System.out.println("Before Formatting: " + now);  
        DateTimeFormatter format = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss"); 
		String formatdatetime=now.format(format);
		System.out.println("After Formatting: "+formatdatetime);
		
		// LocalDateTime get()Example
	    LocalDateTime l=LocalDateTime.of(2022, 02, 24, 12, 54);
		System.out.println("DayOfWeek: "+l.get(ChronoField.DAY_OF_WEEK));
		System.out.println("DayOfYear: "+l.get(ChronoField.DAY_OF_YEAR));
		System.out.println("DayOfMonth: "+l.get(ChronoField.DAY_OF_MONTH));
		System.out.println("HourOfDay: "+l.get(ChronoField.HOUR_OF_DAY));
		System.out.println("MinuteOfDay: "+l.get(ChronoField.MINUTE_OF_DAY));
				
		// LocalDateTime minusDays()Example
		LocalDateTime local = LocalDateTime.of(2022, 02, 24, 12, 54); 
		LocalDateTime local1 = local.minusDays(100);  
		System.out.println("Before Formatting: " + local);  
		DateTimeFormatter format1 = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss"); 
	    String formatdatetime1=local1.format(format);
	    System.out.println("After Formatting: "+formatdatetime1);
	    
	    // LocalDateTime plusDays()Example
		LocalDateTime datetime3 = LocalDateTime.of(2017, 2, 14, 10, 34);  
		LocalDateTime datetime4 = datetime3.plusDays(120);  
	    System.out.println("Before Formatting: " + datetime3);  
		DateTimeFormatter format2 = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm");  
	    String formatDateTime = datetime4.format(format2);   
		System.out.println("After Formatting: " + formatDateTime );  
	}

}
