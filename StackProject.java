package stackProject;

import java.util.Scanner;
import java.util.Stack;

public class StackProject {

	public static void main(String[] args) {
		Stack<Integer> games= new Stack<Integer>();
		int n;  
		//Reading total no of Elements from the User
		Scanner scannedNumber=new Scanner(System.in);  
		System.out.println("Enter the number of elements you want to store: ");
		
		n=scannedNumber.nextInt();    
		int[] array = new int[n];  
		
		System.out.println("Enter the elements of the array: ");
		for(int i=0; i<n; i++)  
		{  
		  //reading array elements from the user   
			array[i]=scannedNumber.nextInt();
			games.push(array[i]);
		}
		//Size of the Array and Printing Total Array
		System.out.printf("The Final Size  Array is : %d",games.size()).println();
		System.out.println(games);
        //Stack Function Pop Peek LastElement
		System.out.printf("The Last Element From the Given Array is %d",games.lastElement()).println();
		System.out.printf("The poped  Element From the Given Array is %d",games.pop()).println();
		System.out.printf("The Last Element of Array After Poping is %d",games.peek()).println();
		
		
	}

}
