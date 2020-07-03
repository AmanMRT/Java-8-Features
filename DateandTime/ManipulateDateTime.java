package DateandTime;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Month;

public class ManipulateDateTime {
public static void main(String[] args) {
    
     //12 december 2014
    LocalDate date3 = LocalDate.of(2014, Month.DECEMBER, 12);
    System.out.println("date3: " + date3);
        
    //22 hour 15 minutes
    LocalTime date4 = LocalTime.of(22, 15);
    System.out.println("date4: " + date4);
        
    //parse a string
    LocalTime date5 = LocalTime.parse("20:15:30");
    System.out.println("date5: " + date5);
}
}
