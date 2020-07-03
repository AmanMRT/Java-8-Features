package LambdaExpression;

interface A
{
	void show();
	
}
public class LambdaDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		A obj;
		
		// Normal case to use Interface
		/*
		 * obj = new A()	//this is a method to define an Interface
		 *{ 
		 * public void show() 
		 * { // TODO Auto-generated method stub
		 * System.out.println("Hello"); 
		 * }
		 * 
		 * }; obj.show();
		 */
		
		//Lambda Expression without Parameter
		obj = () -> 
		{
			System.out.println("Hello"); 
		};
		
		obj.show();
		//Lambda Expression with Parameter
		// Below code is the implementation of Interface
		/*
		 * obj = (i) -> { System.out.println("Hello " + i); };
		 * 
		 * obj.show(1);
		 */
	}

}
