package sdet_java_task3;

import java.util.Scanner;

public class Q1 {
	public static void main(String[] args) {    
        int rows, cols;    
        boolean flag = true;   
        
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
        if(rows != cols){    
            System.out.println("Matrix should be a square matrix");    
        }    
        else {    
           
            for( int i = 0; i < rows; i++){    
                for(int j = 0; j < cols; j++){    
                  if(i == j && a[i][j] != 1){    
                      flag = false;    
                      break;    
                  }    
                  if(i != j && a[i][j] != 0){    
                      flag = false;    
                      break;    
                  }    
                }    
            }    
                
            if(flag)    
                System.out.println("Given matrix is an identity matrix");    
            else    
                System.out.println("Given matrix is not an identity matrix");    
        }    
	  	}
}
