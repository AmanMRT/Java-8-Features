package Stream_API;

import java.util.Arrays;
import java.util.List;

public class StreamBasic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> list = Arrays.asList("Sunday","Monday","Tuesday","Wednesday","Thursday","Friday","Saturday");
		
		//Using Internal ForEach Method to Iterate over Collection
		//list.stream().forEach(System.out::println);				//Ordered Result
		//list.parallelStream().forEach(System.out::println); 		//unordered result
		
	}

}
