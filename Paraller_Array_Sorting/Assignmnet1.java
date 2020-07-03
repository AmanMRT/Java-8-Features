package Paraller_Array_Sorting;

import java.util.Arrays;

public class Assignmnet1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a, b ;
		
		int[] arr = {15,21,75,14,21,32,56,86,52,01,23,2,10,86};
		
		Arrays.parallelSort(arr);
		
		for(int i : arr)
		{
			System.out.print(i+" ");			
		}
		
		//Using Earlier JAVA version 1 to 7
		System.out.println();
		System.out.print(arr[0] + arr[arr.length-1]);
		
		//Using Java 8 Feature
		System.out.println();
		a = Arrays.stream(arr).max().getAsInt();
		b = Arrays.stream(arr).min().getAsInt();
		
		System.out.print(a+b);
		
	}

}
