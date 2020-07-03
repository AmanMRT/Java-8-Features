package ForEach;

import java.util.Arrays;
import java.util.List;

public class ArrayListWeekdays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> list = Arrays.asList("Sunday","Monday","Tuesday","Wednesday","Thursday","Friday","Saturday");
		
		//Using Internal ForEach Method to Iterate over Collection
		list.forEach(System.out::println);
	}

}
