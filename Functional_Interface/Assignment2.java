package Functional_Interface;

import java.util.Arrays;
import java.util.List;

public class Assignment2 {

	static int sum = 0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> list = Arrays.asList(10,20,30,40,50,60,70,80,90,100);
		
		findsum(list);
		System.out.println(sum);
	}

	private static void findsum(List<Integer> list) {
		// TODO Auto-generated method stub
				
		list.forEach(i -> sum += i); 
	}

}
