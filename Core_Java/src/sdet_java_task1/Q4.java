package sdet_java_task1;

import java.util.Scanner;

public class Q4 {
		public static void reverse(int a, int b)
		{
			a= a+b;
			b=a-b;
			a=a-b;
			System.out.println("a="+a);
			System.out.println("b="+b);
		}
			public static void main(String[] args) {
			// TODO Auto-generated method stub      
			Scanner values = new Scanner(System.in);
			System.out.println("Enter the values:");
			
			int a= values.nextInt();
			int b= values.nextInt();
			
			System.out.println("a="+a);
			System.out.println("b="+b);
			
			System.out.println("After reversing:");
			
			reverse(a,b);	
		}
	}

