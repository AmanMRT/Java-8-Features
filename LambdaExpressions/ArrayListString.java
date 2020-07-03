package LambdaExpressions;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArrayListString 
{
	public static void main(String[] args)
	{
		List<String> list = Arrays.asList("Abc","Cde","Efg","Ghi","Ijk","Klm","Mno","Opq","Qrs","Stu");
		
		//using reverse method to reverse the collection list
		Collections.reverse(list);
		
		//using lambda expression
		list.forEach(i -> System.out.println(i));
	}
}
