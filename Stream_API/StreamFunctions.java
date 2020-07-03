package Stream_API;

import java.util.Arrays;
import java.util.List;

public class StreamFunctions {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> list = Arrays.asList(8,55,12,65,42,75,80,96,105);
		
		System.out.println(list.stream() 	//convert list to stream
				.filter(i-> i%5==0)			//check for the condition
				.map(i->i*2)				// Doubles each value
				.findFirst()				//returns the first value which satisfies the condition
				.orElse(0));				// if not then returns 0
		
		
		//Efficent Approach
		System.out.println(list.stream() 				//convert list to stream
				.filter(StreamFunctions::isDivisible)	//check for the condition
				.map(StreamFunctions::doubleit)			// Doubles each value
				.findFirst()							//returns the first value which satisfies the condition
				.orElse(0));							// if not then returns 0
	}

		public static boolean isDivisible(int i)
		{
			return i%5==0;
		}
		
		public static int doubleit(int i)
		{
			return i*2;
		}
}