package Interface;

interface StaticMethod
{
	//In java 8 we can define methods inside interface
	static void B()
	{
		System.out.println("method B");
	}
}

public class InterfaceStaticMethod implements StaticMethod 
{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StaticMethod.B(); 	//access static method of Interface StaticMethod with its name
	}

}
