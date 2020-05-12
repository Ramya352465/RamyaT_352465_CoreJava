package sdet_java_task3;

import java.util.Scanner;

public class Q5 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
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
	 	System.out.println("The Lower Triangular Matrix is:");
        for(int i=0;i<3;i++)
         {
          for(int j=0;j<3;j++)
           {
            if(i>=j)
             {
               System.out.print(a[i][j] +" ");
             }
          else
          {
              System.out.print("0"+" ");
          } 
        }
      System.out.println("");
     }
 
	}

}
