package sdet_java_task2;

public class Q10 {
	static void combinationUtil(int arr[], int n, int r, 
            int index, int data[], int i) { 
if (index == r) { 
for (int j = 0; j < r; j++) 
  System.out.print(data[j] + " "); 
System.out.println(""); 

return; 
} 
if (i >= n) 
return; 
data[index] = arr[i]; 
combinationUtil(arr, n, r, index + 1,  
                 data, i + 1); 
combinationUtil(arr, n, r, index, data, i + 1); 
} 
static void printCombination(int arr[], int n, int r) 
{ 
int data[] = new int[r]; 
combinationUtil(arr, n, r, 0, data, 0); 
} 
public static void main(String[] args) 
{ 
int arr[] = { 4, 2, 1, 5 }; 
int r = 2; 
int n = 4; 
printCombination(arr, n, r); 
System.out.println("Value=2");

} 

}
