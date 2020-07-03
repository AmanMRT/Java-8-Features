package ForEach;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ArrayListEmployee extends Employee
{
	public ArrayListEmployee(int id, String name, String address, double salary) {
		super(id, name, address, salary);
		// TODO Auto-generated constructor stub
	}

	static Employee emp1 = new Employee(1,"ABC","Delhi1",1000);
	static Employee emp2 = new Employee(2,"GHI","Delhi2",2000);
	static Employee emp3 = new Employee(3,"DEF","Delhi3",3000);
	static Employee emp4 = new Employee(4,"MNO","Delhi4",4000);
	static Employee emp5 = new Employee(5,"PQR","Delhi5",5000);
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Employee> list = Arrays.asList(emp1,emp2,emp3,emp4,emp5);
		
		list.forEach(System.out::println); 		//Method Reference
	}

}
