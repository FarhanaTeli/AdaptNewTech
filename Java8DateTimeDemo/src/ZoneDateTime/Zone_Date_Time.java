package ZoneDateTime;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.OffsetDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;

public class Zone_Date_Time {

	public static void main(String[] args) {
		ZoneId zoneId = ZoneId.of("Asia/Tokyo");
		LocalTime time1=LocalTime.now(zoneId);
		System.out.println("Japan Time Zone: "+time1);
		
		/*		Set<String> availableZoneIds = ZoneId.getAvailableZoneIds();
				availableZoneIds.forEach(System.out::println);
		*/
		ZonedDateTime zonedDateTime = ZonedDateTime.of(LocalDateTime.now(), zoneId);
		System.out.println("Japan ZoneDateTime: "+zonedDateTime);
		LocalDateTime localDateTime = LocalDateTime.of(2015, Month.FEBRUARY, 20,06,30);
		System.out.println("Japan LocalDateTime: "+localDateTime);
				
		ZoneOffset offset = ZoneOffset.of("+02:00");
		OffsetDateTime offsetDateTime = OffsetDateTime.of(localDateTime, offset);		
		System.out.println(offsetDateTime);
	}

}
