package org.test.tcs;
//ARRAY 
//SYNTAX---> datatype variableName[] = new datatype[length]

//2DARRAY--->SYSNTAX---> datatype variablename[][] = new datatype[size Rows][size Column]

public class JennimamArray {
	public static void main(String[] args) {
		//2D ARRAY
		int arr[][] = new int[3][3];
		arr[0][0]=10;
		arr[0][1]=20;
		arr[0][2]=30;
		arr[1][0]=40;
		arr[1][1]=50;
		arr[1][2]=60;
		arr[2][0]=70;
		arr[2][1]=80;
		arr[2][2]=90;
		
		//length
		int length = arr.length;
		System.out.println(length);
		
	
		for (int[] arr1 : arr) {
			for (int i : arr1) {
				System.out.println(i);
				
			}
			
			
		}
		
	
		
	}
		
	
	
	
	
	
	}
		/*
		//ARRAY
		int arr[] = new int[5];
		arr[0]=10;
		arr[1]=20;
		arr[2]=30;
		arr[3]=40;
		arr[4]=50;		
		System.out.println(arr[2]);
		for (int a : arr) {
			System.out.println(a);			
		}
				
		for (int i = 0; i < arr.length; i++) {
			System.out.print(" "+i);			
		}		
		for (int a : arr) {
			System.out.println(a);			
		}
	}
}
		*/
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
	


