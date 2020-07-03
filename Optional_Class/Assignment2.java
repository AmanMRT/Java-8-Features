package Optional_Class;

import java.util.Optional;

public class Assignment2 {

	//static String address;
	static String address = "Uttar Pradesh";
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Optional<String> n = Optional.ofNullable(address);
		if(n.isPresent())
		{
			System.out.print(n.get());
		}
		else
		{
			System.out.print("India");
		}
		
	}

}
