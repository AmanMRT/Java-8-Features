package MethodReference;

//Functional Interface
interface parser
{
	String parse(String str);
}

class StringParser
{
	public static String convert(String str)
	{
		if(str.length() <= 3)
		{
			str = str.toUpperCase();
		}
		else
		{
			str = str.toLowerCase();
		}
		
		return str;
	}
}
class MyPrinter
{
	public void print(String str, parser p)
	{
		str = p.parse(str);
		System.out.println(str);
	}
}
public class MRDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str ="Aman Gupta";
		MyPrinter mp = new MyPrinter();
		
		//Method 1
		// Using Annonimous Class 
		/*
		 * mp.print(str, new parser() 
		 * {
		 *  public String parse(String str) 
		 *  {
		 *   return StringParser.convert(str); 
		 *  }
		 * });
		 */
		
		//Method 2
		//Using Lambda Expression
	//	mp.print(str,(s) -> StringParser.convert(str));
		
		//Method 3
		//Using Method Reference
		mp.print(str,(StringParser::convert));
	}

}
