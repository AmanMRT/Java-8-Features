package Functional_Interface;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Assignment1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> al = new ArrayList<>();
		List<Employee1> list = Arrays.asList(
				new Employee1(1,"ABC1","UP1",10000),
				new Employee1(2,"ABC2","UP2",20000),
				new Employee1(3,"ABC3","UP3",30000),
				new Employee1(4,"ABC4","UP4",40000),
				new Employee1(5,"ABC5","UP5",50000)
				);
		
		addlocation(al, list);
		System.out.print(al);
		
	}
	private static void addlocation(List<String> al, List<Employee1> list) {
		// TODO Auto-generated method stub
				
		list.forEach(i -> al.add(i.getLocation())); 
	}
	
}
