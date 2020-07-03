package ForEachMeathod;
import java.util.Arrays;
import java.util.List;

public class ForEachMethod {

//	Java8 ForEach Method
	//External Method
	//Internal Method
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9);
		
		list.forEach(i -> System.out.println(i));	//Internal ForEach method
		list.forEach(System.out::println);		//Method Refrence
	}
}
