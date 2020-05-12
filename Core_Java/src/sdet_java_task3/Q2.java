package sdet_java_task3;

import java.util.Scanner;

public class Q2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		   int rows, cols, countOdd = 0, countEven = 0; 
	        Scanner s= new Scanner(System.in);
	        int a[][] = new int[3][3];
			System.out.println("Enter matrix:");
		 	for(int i = 0; i < 3; i++)
		  	{
		   	    for(int j = 0; j < 3; j++) 
		     	    {
		        	a[i][j] = s.nextInt();
		        	System.out.print(" ");
		            } 
		  	}
		 	rows = a.length;    
	        cols = a[0].length;    
	            
	        for(int i = 0; i < rows; i++){    
	            for(int j = 0; j < cols; j++){    
	              if(a[i][j] % 2 == 0)    
	                countEven++;    
	              else    
	                countOdd++;    
	            }    
	        }    
	        System.out.println("Frequency of odd numbers: " + countOdd);    
	        System.out.println("Frequency of even numbers: " + countEven);    
	    }    
}
