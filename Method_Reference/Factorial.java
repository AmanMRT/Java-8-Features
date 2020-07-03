package Method_Reference;

//Functional Interface
interface parser
{
	int parse(int num);
}


class findfactorial
{
	public int findfac(int num)  	//Instance Method
	{
		int fac = 1;
		while(num > 0)
		{
			fac = fac * num;
			num--;
		}
		return fac;
	}
}
class MyPrinter
{
	public void print(int num, parser p)
	{
		num = p.parse(num);
		System.out.println(num);
	}
}
public class Factorial 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		findfactorial fac = new findfactorial();
		int num = 5;
		MyPrinter mp = new MyPrinter();
		mp.print(num,(fac::findfac));
	}
}
