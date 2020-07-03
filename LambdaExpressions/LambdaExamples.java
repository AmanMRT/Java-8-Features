package LambdaExpression;

interface mylambda {
	void doubleNumber(int a);
}
interface mylambda2
{
	void doubleNumber();
}

public class LambdaExamples {

	public static void main(String[] args) 
	{
		mylambda2 a = () -> 
		{ 	
			System.out.println("No Paramerter");
		};
		a.doubleNumber();
		
		mylambda a1 = (i) -> 
		{ 	
			i= i* 2;
			System.out.println(i);
		};
		a1.doubleNumber(4);
	}
}
