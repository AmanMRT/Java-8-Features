package Stream_API;

import java.util.Arrays;
import java.util.List;

public class Assignment3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Student> list = Arrays.asList(
				new Student(1,"ABC1",85),
				new Student(2,"ABC2",55),
				new Student(3,"ABC3",45),
				new Student(4,"ABC4",36),
				new Student(5,"ABC5",95)
				);
		
	long c = list.stream()
			.filter(std -> std.getMarks() >= 50)
			.count();
	
		// filter method is Intermdiate method to perform ay condition
		// count method is terminaitng method
		
		System.out.print(c);
	}

}
