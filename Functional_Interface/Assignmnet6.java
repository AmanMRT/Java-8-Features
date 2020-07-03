package Functional_Interface;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Assignmnet6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> al = Arrays.asList("abcba","asffsa","fewewg","andjkhsd","mnbvcvbnm","klnff","fweffqqewf","dwfew","ffwf","dsvsd");
		
		Consumer<List<String>> cons = list -> 
		{
			for(int i=0; i<al.size(); i++)
			{
				StringBuffer sb = new StringBuffer(al.get(i));
				al.set(i, sb.reverse().toString());
			}
		};
		
		cons.accept(al);
		al.forEach(System.out::println);		//output will be same 
		//al.forEach(n-> System.out.println(n));		//output will be same
	}

}
