package Method_Reference;


//Functional Interface
interface parser2
{
	int parse(int num);
}

class countdigit
{
	public static int count(int num)  	//static Method
	{
		String str = Integer.toString(num);
		return str.length();
	}
}

class MyPrinter2
{
	public void print(int num, parser p)
	{
		num = p.parse(num);
		System.out.println(num);
	}
}
public class DigitCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num = 553643543;
		MyPrinter2 mp = new MyPrinter2();
		mp.print(num,(countdigit::count));
	}

}
