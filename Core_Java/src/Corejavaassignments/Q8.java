package Corejavaassignments;

public class Q8 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int m =25;
		int n, sum=0;
		while(m>0)
		{
			n=m%10;
			sum= sum+n;
			m=m/10;
		}
		System.out.println("The Sum of digits of 25 is "+sum);
}
}
