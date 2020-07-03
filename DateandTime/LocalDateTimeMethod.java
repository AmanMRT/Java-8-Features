package DateandTime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;

public class LocalDateTimeMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LocalDate d = LocalDate.now(); 	//output 2020-06-22
		System.out.println(d);
		
		LocalTime t = LocalTime.now();		//output 14:41:18.251 
		System.out.println(t);
		
		LocalDateTime dt = LocalDateTime.now();		//output 2020-06-22T14:42:30.185
		System.out.println(dt);
		
		System.out.println(ZoneId.getAvailableZoneIds());		//output zonesId across countries 
		
		LocalTime f = LocalTime.now(ZoneId.of("Pacific/Wallis"));		//output Time of differnt country 
		System.out.println(f);
		
	}

}
