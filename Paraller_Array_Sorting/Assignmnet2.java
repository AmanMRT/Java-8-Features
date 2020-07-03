package Paraller_Array_Sorting;

import java.util.Arrays;
import java.util.Scanner;

public class Assignmnet2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc= new Scanner(System.in);
		String str = sc.nextLine();			//input String
		
		char[] arr = str.toCharArray();		//convert string to Char Array
		
		Arrays.parallelSort(arr);			// Sort Array using Parallel Sort(Java 8 Feature)
		
		Arrays.toString(arr);				//convert Char Array to String
		
		System.out.print(arr);
		
	}

}
