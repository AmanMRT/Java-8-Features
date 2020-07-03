package Functional_Interface;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Assignment5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> list = Arrays.asList(0,1,2,3,4,5,6,7,8,9);

		Integer[] num = (Integer[]) list.toArray();
		
		Predicate<Integer> p = i ->
		{
			//System.out.println(i);
			i=i*i;
			System.out.println(i);
			return true;
			
		};
		
		Arrays.stream(num)
		.filter(p)
		.forEach(System.out::println);
	}

}
