package Functional_Interface;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Assignmnet4 {

	public static void main(String[] args) {
			
		List<Employee1> list = Arrays.asList(
				new Employee1(1,"ABC1","UP1",10000),
				new Employee1(2,"ABC2","UP2",2000),
				new Employee1(3,"ABC3","UP3",30000),
				new Employee1(4,"ABC4","UP4",40000),
				new Employee1(5,"ABC5","UP5",50000)
				);
		
		Employee1[] emp = (Employee1[]) list.toArray();
		Predicate<Employee1> p = s-> s.getSalary() < 10000;
		Arrays.stream(emp).filter(p).forEach(System.out::println);
		
	}
}
