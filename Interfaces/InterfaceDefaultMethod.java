package Interface;

interface DefaultMethod
{
	//In java 8 we can define methods inside interface
	default void B()
	{
		System.out.println("method B");
	}
}

public class InterfaceDefaultMethod implements DefaultMethod
{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		DefaultMethod a = new InterfaceDefaultMethod();		//object of class through Interface
		a.B();
	}

}
