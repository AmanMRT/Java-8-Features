package ForEachMeathod;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

/*class consumerImplement implements Consumer<Integer>
{

	@Override
	public void accept(Integer i) {
		// TODO Auto-generated method stub
		System.out.println(i);
	}
	
}*/
public class ConsumerMethod 
{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9);
		
		//Method 1
		//	Consumer<Integer> cons = new consumerImplement();		//takes values of Arraylist elemnts one by one and print with accept metho
		//	list.forEach(cons);		//will print the elements of ArrayList
		
		//Method 2
		//use by Anonimoius Class (this will remove the class whic implemts Consumer Interfae
		/*
		 * Consumer<Integer> cons = new Consumer<Integer>() //Anonimous Class 
		 * { 
		 * public void accept(Integer i)
		 *  { // TODO Auto-generated method stub
		 * 		System.out.println(i); 
		 * }
		 *  };
		 *  list.forEach(cons); //will print the elements of ArrayList
		 */
		
		//Method 3
		//Working is same as Method 2
		/*
		 *	Consumer<Integer> cons = (i) -> { System.out.println(i); };
		 * 
		 * list.forEach(cons);//will print the elements of ArrayList
		 */
		
		//Method 4
		list.forEach((i) -> System.out.println(i));		//will print the elements of ArrayList
		list.forEach(System.out::println); //method refrence
	}
}
