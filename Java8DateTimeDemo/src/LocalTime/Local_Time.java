package LocalTime;

import java.time.LocalTime;
import java.time.ZoneId;
import java.time.temporal.ChronoUnit;
public class Local_Time {

	public static void main(String[] args) {
		
		//LocalTime now() Example
		LocalTime ct1=LocalTime.now();
		System.out.println(ct1);
		System.out.println("********************************************************");
		
		//LocalTime of() Example
		LocalTime ct2=LocalTime.of(12, 21, 30);
		System.out.println(ct2);
		System.out.println("********************************************************");

		
		//LocalTime minusHours()and minusMinutes() Example
		LocalTime ct3=LocalTime.of(12, 21, 30);
		System.out.println("Before minusHours and minusMinutes LocalTime: "+ct3);
		LocalTime ct4=ct3.minusHours(3);
		LocalTime ct5=ct4.minusMinutes(7);
		System.out.println("After minusHours and minusMinutes LocalTime: "+ct5);
		System.out.println("********************************************************");

		
		//LocalTime plusHours()and plusMinutes() Example
		LocalTime ct6=LocalTime.of(12, 21, 30);
		System.out.println("Before plusHours and plusMinutes LocalTime: "+ct6);
		LocalTime ct7=ct6.plusHours(3);
		LocalTime ct8=ct7.plusMinutes(7);
		System.out.println("After minusHours and plusMinutes LocalTime: "+ct8);
		System.out.println("********************************************************");
		
		ZoneId zone1=ZoneId.of("Asia/Kolkata");
		LocalTime time1=LocalTime.now(zone1);
		System.out.println("India Time Zone: "+time1);
		System.out.println("********************************************************");

		
		ZoneId zone2=ZoneId.of("Asia/Tokyo");
		LocalTime time2=LocalTime.now(zone2);
		System.out.println("Japan Time Zone: "+time2);
		System.out.println("********************************************************");

		
		LocalTime time3 = LocalTime.parse("09:30");
		System.out.println(time3);
		// boolean java.time.LocalTime.isBefore(LocalTime other)
        // Checks if this time is before the specified time
		boolean before = LocalTime.parse("09:30").isBefore(LocalTime.parse("09:25"));
		System.out.println(before);
		System.out.println("********************************************************");
		
		System.out.println(LocalTime.MAX);
		System.out.println(LocalTime.MIN);






		
		
	}

}
