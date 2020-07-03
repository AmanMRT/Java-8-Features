package String_Joiner;

import java.util.Arrays;
import java.util.List;
import java.util.StringJoiner;

public class Assignment1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> list = Arrays.asList("Sunday","Monday","Tuesday","Wednesday","Thursday","Friday","Saturday");
		StringJoiner s = new StringJoiner(",");
		
		// Using Java 7 or earlier
		/*
		 * for(String str : list) { s.add(str); }
		 */
		
		// Using Java 8 
		list.forEach(str -> s.add(str));
		
		System.out.print(s);
		
		
	}

}
