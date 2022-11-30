package org.test.tcs;

import java.util.ArrayList;
import java.util.List;

//collection 1.List:I
          //  2.Set:I
         //    3.Queue:I

// List:I
         // ArrayList:C
         //LinkedList:C
         //Vector:C

 //ArrayList obj = new ArrayList();[access both parent and child]
//List obj = new ArrayList();[access only {list}]parent
//List obj = new LinkedList();[access only {list}]parent
//List obj = new Vector();[access only {list}]parent

public class EemployeeDetails {
	public static void main(String[] args) {
		//create list
		//List li = new ArrayList();
		//add value in list

		//li.add(10);
		//li.add("Nisha");
		//li.add('j');
		//li.add(143253533L);
		//li.add(3333.655F);
		//li.add(10);
		//System.out.println(li);
		
		 List<Integer> Li= new ArrayList<Integer>();
		 //add value in list
		 Li.add(10);
		 Li.add(40);
		 Li.add(50);
		 Li.add(60);
		 Li.add(70);
		 Li.add(80);
		 Li.add(20);
		 System.out.println(Li);
		 //number of value [size] of list
		 int size = Li.size();
		 System.out.println(size);
		 //add value in particulara index
		 Li.add(3, 80);
		 System.out.println(Li);
		 
		
	}

}
