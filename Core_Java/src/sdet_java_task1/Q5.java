package sdet_java_task1;

import java.util.Scanner;

public class Q5 {
	public static void power(int num)
	{
			if(num<=1)
			System.out.println("no");
		while(num> 1){
			   if(num % 2 != 0){
				   System.out.println("no");
				   break;
				   }
				   num = num / 2;
				  System.out.println("yes");
				  break;
		}
	}
		public static void main(String[] args) {
			// TODO Auto-generated method stub      
			Scanner values = new Scanner(System.in);
			System.out.println("Enter the values:");
			int num= values.nextInt();
			power(num);
}
}
