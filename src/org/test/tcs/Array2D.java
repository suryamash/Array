package org.test.tcs;
//2D array
//syntax is
//datatypes variablename[][]=new int[size row][size column];

public class Array2D {
	public static void main(String[] args) {
		int arr[][]= new int[3][3];
		arr[0][0]=10;
		arr[0][1]=20;
		arr[0][2]=30;
		arr[1][0]=40;
		arr[1][1]=50;
		arr[1][2]=60;
		arr[2][0]=70;
		arr[2][1]=80;
		arr[2][2]=90;
	
		for (int[] a : arr) {
			for (int i : a ) {
				System.out.println(i);
				//System.out.println(i);	
			}	
		}	
	}	
	}
	
	
	


