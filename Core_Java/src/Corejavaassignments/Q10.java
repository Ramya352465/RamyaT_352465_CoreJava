package Corejavaassignments;

public class Q10 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	String original = "The quick brown fox";
	String reverse ="";
	int length = original.length();
	for(int i = length-1; i>=0; i--)
	{
		reverse= reverse+original.charAt(i);
	}
	System.out.println(reverse);
		}
}
