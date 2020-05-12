package sdet_java_task1;

public class Q1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	String original = "Core Java Programming";
	String reverse ="";
	int length = original.length();
	for(int i = length-1; i>=0; i--)
	{
		reverse= reverse+original.charAt(i);
	}
	System.out.println(reverse);
		}
}
