package Stream_API;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Assignmnet1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> list = Arrays.asList(-9,-8,-7,-6,-5,-4,-3,-2,-1,0,1,2,3,4,5,6,7,8,9);
		
		List<Integer> listnew = list.stream()
				.filter(i -> (i < 0 && i % 2 == 0))
				.collect(Collectors.toList());
		
		// filter method is Intermdiate method to perform ay condition
		// collect method is terminaitng method
		
		listnew.forEach(System.out::println);
	}

}
	