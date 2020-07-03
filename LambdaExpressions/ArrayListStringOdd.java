package LambdaExpressions;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArrayListStringOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> list = Arrays.asList("Abcd","Cde","EFfg","GGhi","Ijk","Km","MLno","OpDq","Qrs","Stu");
		
		//using lambda expression
		list.forEach(i -> 
		{
			if(i.length() % 2 !=0)		//check for odd length of string 
			{
			System.out.println(i);
			}
		}
		);
	}
}
