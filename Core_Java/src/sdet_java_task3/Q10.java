package sdet_java_task3;

public class Q10 {
	static int modInverse(double a, double m) 
    { 
        a = a % m; 
        for (int x = 1; x < m; x++) 
           if ((a * x) % m == 1) 
              return x; 
        return 1; 
    } 
       
    // Driver Program 
    public static void main(String args[]) 
    { 
        double a = 1.23, m = 4.0; 
        System.out.println(modInverse(a, m)); 
    } 
} 

