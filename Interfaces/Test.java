package Interfaces;

interface Testfun
{
	abstract int myFunction(int a, int b,int c);
}
public class Test implements Testfun
{
	@Override
	public int myFunction(int a, int b, int c) {
		// TODO Auto-generated method stub
		return 0;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//t1 for Addition
		Testfun t1 = new Test()		//Anonimous class
		{
			public int myFunction(int a, int b,int c)
			{
				return (a+b+c);
			}
		};
		System.out.println(t1.myFunction(2, 3, 4));
				
				
		Testfun t2 = new Test()		//Anonimous class
		{
			public int myFunction(int a, int b,int c)
			{
				return (a*b*c);
			}
		};
		System.out.println(t2.myFunction(2, 3, 4));
	}
}
