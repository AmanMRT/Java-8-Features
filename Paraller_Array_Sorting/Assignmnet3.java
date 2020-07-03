package Paraller_Array_Sorting;

import java.util.Arrays;

public class Assignmnet3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

int[] arr = {15,21,75,14,21,32,56,86,52,01,23,2,10,86};
		
		Arrays.parallelSort(arr, 0, 5);		// Sort first 5 elements of the array
		
		for(int i : arr)
		{
			System.out.print(i+" ");			
		}
		
	}

}
