package String_Joiner;

import java.util.Arrays;
import java.util.List;
import java.util.StringJoiner;

public class Assignmnet2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> list1 = Arrays.asList("Uttar Pradesh","Jammu and Kashmir","Delhi","Punjab","Haryana","Gujarat","Maharastra");
		List<String> list2 = Arrays.asList("Andhra Pradesh","Assam","Himachal Pradesh","Tamil Nadu","Karnataka","Goa","Kerela");
		
		StringJoiner s1 = new StringJoiner("-");
		StringJoiner s2 = new StringJoiner("-");
		
		list1.forEach(str -> s1.add(str));
		list2.forEach(str -> s2.add(str));
		
		System.out.println(s1.merge(s2));
		System.out.println();
		System.out.println(s2.merge(s1));
		
		
	}

}
