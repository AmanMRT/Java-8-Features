package Stream_API;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import Functional_Interface.Employee1;

public class Assignment2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Employee> list = Arrays.asList(
				new Employee(1,"ABC1","Pune",10000),
				new Employee(2,"ABC2","UP",20000),
				new Employee(3,"ABC3","Banglore",30000),
				new Employee(4,"ABC4","Pune",40000),
				new Employee(5,"ABC5","Noida",50000)
				);
		
		List<Employee> listnew = list.stream().filter(emp -> emp.getLocation().equals("Pune")).collect(Collectors.toList());
		// filter method is Intermdiate method to perform ay condition
		// collect method is terminaitng method
		
		listnew.forEach(System.out::println);
	}

}
