package LambdaExpression;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class LambdaExampleSolutionJava7 
{
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		List<Person> list = Arrays.asList(
				new Person("ABC","DEF",10),
				new Person("DEF","GHI",20),
				new Person("GHI","JKL",30),
				new Person("JKL","MNO",40)
				);
		
		//Sort by last name
			Collections.sort(list, new Comparator<Person>() {

				@Override
				public int compare(Person o1, Person o2) {
					// TODO Auto-generated method stub
					return o1.getLastname().compareTo(o2.getLastname());
				}
			});
		
		//Prints all the elements in the list
		printAll(list);
		
		//Prints all the elements whose lastname start with G
		printLastnameStartwithG(list, new Condition()
				{
					@Override
					public boolean test( Person p) {
						
						return 	p.getLastname().startsWith("G");					
					}
				});
	}
	
	private static void printLastnameStartwithG(List<Person> list, Condition condition) {
		// TODO Auto-generated method stub
		for(Person p : list)
		{
			if(condition.test(p))
				System.out.println(p);
		}
		System.out.println();
	}

	private static void printAll(List<Person> list) {
		// TODO Auto-generated method stub
		for(Person p : list)
		{
			System.out.println(p);
		}
		System.out.println();
	}
}

interface Condition
{
	public boolean test(Person p);
}