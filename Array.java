package arrayList;

import java.util.Scanner;

public class Array {

	public static void main(String[] args) {
		int initialValue=0;
		int n;  
		//Reading total no of Elements from the User
		Scanner scannedNumber=new Scanner(System.in);  
		System.out.println("Enter the Size of Array you want to store: ");
		
		n=scannedNumber.nextInt();    
		int[] arrayOfElements = new int[n];  
		
		System.out.println("Enter the elements in the array: ");
		
		int output=0;
		
		for(int i=0; i<n; i++)  
		{  
		  //reading array elements from the user   
			arrayOfElements[i]=scannedNumber.nextInt();  
		}
		for (int elementOfArray:arrayOfElements){
			int DivisorsCount=0;
			for (int listOfArray:arrayOfElements){
				if (elementOfArray%listOfArray==0){
					DivisorsCount+=1;
				}
			}
			if (DivisorsCount>initialValue)
			{
				initialValue=DivisorsCount;
				output=elementOfArray;
				
			}
		}
		System.out.printf("The Element which has Maximun Divisors in the Given Array is %d",output).println();
		System.out.printf("The total no of Divisors %d has in Array is %d.",output,initialValue).println();

	}

}

