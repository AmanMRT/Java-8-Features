package Optional_Class;

import java.util.Optional;

public class Assignment1 {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] names = new String[5];
		Optional<String> n = Optional.ofNullable(names[0]);
		System.out.print(n.get());
		System.out.print(names[0].length());
	}

}
