package DateandTime;

import java.time.LocalDate;

public class Assignment1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LocalDate d = LocalDate.now(); 	
				
		System.out.println(d);	//todays date
		System.out.println(d.plusDays(10));		//date after 10 days
		
	}

}
