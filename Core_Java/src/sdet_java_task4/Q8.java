package sdet_java_task4;

import java.util.Arrays;
import java.util.Scanner;

public class Q8 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	      Scanner sc = new Scanner(System.in);
	      System.out.println("Enter the size of the array that is to be created: ");
	      int size = sc.nextInt();
	      int[] myArray = new int[size];
	      System.out.println("Enter the elements of the array: ");
	      for(int i=0; i<size; i++){
	         myArray[i] = sc.nextInt();
	      }
	      System.out.println("The array created is: "+Arrays.toString(myArray));
	      System.out.println("Resultant array: ");
	      int pos = 0;
	      for(int i=0; i<myArray.length; i++){
	         if(myArray[i]!=0){
	            myArray[pos]=myArray[i];
	            pos++;
	         }
	      }
	      while(pos<myArray.length) {
	         myArray[pos] = 0;
	         pos++;
	      }
	      System.out.println("The array created is: "+Arrays.toString(myArray));
	   }
}
