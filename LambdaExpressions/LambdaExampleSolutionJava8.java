package LambdaExpression;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class LambdaExampleSolutionJava8
{
	public static void main(String[] args)
	{
		List<Person> list = Arrays.asList(
				new Person("ABC","DEF",10),
				new Person("DEF","GHI",20),
				new Person("GHI","JKL",30),
				new Person("JKL","MNO",40)
				);
		
		//Sort by last name
		Collections.sort(list, (p1, p2) -> p1.getLastname().compareTo(p2.getLastname()));
	
		//Prints all the elements in the list
		printconditionally(list, p-> true, p-> System.out.println(p));
		
		//Prints all the elements whose lastname start with G
		printconditionally(list, p -> p.getLastname().startsWith("G"), p-> System.out.println(p));
		
		//Prints all the elements whose firstname start with G
		printconditionally(list, p -> p.getFirstname().startsWith("G"), p-> System.out.println(p));
	
	}
	
	private static void printconditionally(List<Person> list, Predicate<Person> predicate, Consumer<Person> consumer) 	
	//Predicate and Consumer are Interfaces present in Java 8
	{
		// TODO Auto-generated method stub
		for(Person p : list)
		{
			if(predicate.test(p))
				consumer.accept(p);
		}
			System.out.println();
	}
}
