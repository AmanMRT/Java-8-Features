package Functional_Interface;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Assignment7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> al = Arrays.asList(0,1,2,3,4,5,6,7,8,9);
		
		Consumer<Integer> cons1 = i -> System.out.print(i);
		
		Consumer<Integer> cons2 = cons1.andThen(num -> 
					{
						if(num % 2 == 0)
							System.out.println(" even");
						else
							System.out.println(" odd");
					});
			
		al.forEach(n-> cons2.accept(n));	
	}

}
