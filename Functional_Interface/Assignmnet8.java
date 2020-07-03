package Functional_Interface;

import java.util.function.Supplier;

public class Assignmnet8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Supplier<Integer> s1 = ()->
		{
			int num = 3, flag = 0;
			for ( int i = 2 ; i <=10 ;  )
		      {
		         for ( int j = 2; j <= Math.sqrt(num); j++ )
		         {
		            if ( num % j == 0 )
		            {
		               flag = 0;
		               break;
		            }
		         }
		         if ( flag != 0 )
		         {
		            System.out.println(num);
		            i++;
		         }
		         flag = 1;
		         num++;
		      }
			return num;   
		};
		
		System.out.print(s1.get());
		
	}

}
