package org.test.tcs;
// Array concepts with for loop.
//syntax fo an array is 
// datatypes variable name[] = new datatype[length].
// int arr[]=new int[];
// a[0]=10;
// a[1]=20;

public class Company {
	public static void main(String[] args) {
		//array
		
		int arr[]= new int[5];
		arr[0]=10;
		arr[1]=20;
		arr[2]=30;
		arr[3]=40;
		arr[3]=50;
		arr[4]=50;
		
		// if index repeated it fetches the new or latest value
		System.out.println(arr[2]);
		
		//if the index not present it returns the defaul;t value of the data types.
		//arr[3]=40;
		//arr[3]=50;
		System.out.println(arr[3]);
		
		// to fetch all values in the loop.
		
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
			
	// if we give the extra size instead of the length it throws exception.called ArrayBoundsOfException.
			
		}
		
	
	}
}
