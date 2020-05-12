package sdet_java_task4;

import java.util.Scanner;

public class Q1 {
static final int NO_OF_CHARS = 256; 
    static void fillCharCounts(String str, int[] count) 
    { 
       for (int i = 0; i < str.length();  i++) 
          count[str.charAt(i)]++; 
    } 
       
        static void duplicate(String str) 
    { 
            int count[] = new int[NO_OF_CHARS]; 
            fillCharCounts(str, count); 
      
      for (int i = 0; i < NO_OF_CHARS; i++) 
        if(count[i] > 1) 
            System.out.printf("%c,  count = %d \n", i,  count[i]); 
       
    } 
    public static void main(String[] args) 
    { 
    	System.out.println("String is:");
    	Scanner s= new Scanner(System.in);
    	String str  = s.next();
        duplicate(str); 
    } 

}
