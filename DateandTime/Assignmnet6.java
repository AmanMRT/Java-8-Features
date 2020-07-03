package DateandTime;

import java.time.LocalTime;

public class Assignmnet6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LocalTime t = LocalTime.now();		
		System.out.println(t);
		System.out.println(t.minusHours(5).minusMinutes(30));
	}

}
