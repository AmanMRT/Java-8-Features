package Functional_Interface;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class Assignmnet3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> list = Arrays.asList("abcba","asffsa","fewewg","andjkhsd","mnbvcvbnm","klnff","fweffqqewf","dwfew","ffwf","dsvsd");
		
		String[] str  = (String[]) list.toArray();
		
		Predicate<String> p = s-> 
		{
			StringBuffer sb1 = new StringBuffer(s);
			StringBuffer sb2 = new StringBuffer(s);
			sb2.reverse();
			
			if(sb2.toString().equals(sb1.toString()))
				return true;
			return false;
		};
				
		Arrays.stream(str).filter(p).forEach(System.out::println);
		
		//checkPalindrome(list, s-> System.out.println(s));
	}

	/*private static void checkPalindrome(List<String> list, Consumer<String> consumer) {
				
		Predicate<String> p = new Predicate<String>()
		{
			@Override
			public boolean test(String t) {
										
				StringBuffer sb1 = new StringBuffer(t);
				StringBuffer sb2 = new StringBuffer(t);
				sb2.reverse();
				
				if(sb2.toString().equals(sb1.toString()))
					return true;
				return false;
			}
		};
		
		for(String s : list)
		{
			if(p.test(s))
			{
				consumer.accept(s);
			}
		}
		}*/
	
}
