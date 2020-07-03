package LambdaExpressions;

import java.util.Arrays;
import java.util.List;

interface WordCount
{
	//Java 8 Feature to define function inside Interface 
	static int count(String str)
	{
		return str.length();
	}
}

public class MyClassWithLambda implements WordCount 
{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> list = Arrays.asList("Abcd","Cde","EFfg","GGhi","Ijk","Km","MLno","OpDq","Qrs","Stu");
		
		//using lambda expression
		list.forEach(i -> 
		{
			int len = WordCount.count(i);
			System.out.println(len);
			
		}
		);

	}

}
