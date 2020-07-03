package MethodReference;

import java.util.Arrays;
import java.util.List;

//Passing a method inside a method is Method Reference
public class MethodReferenceBasic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> list = Arrays.asList("Sunday","Monday","Tuesday","Wednesday","Thursday","Friday","Saturday");
		
		//here println a method of
		list.forEach(System.out::println);
	}
}
