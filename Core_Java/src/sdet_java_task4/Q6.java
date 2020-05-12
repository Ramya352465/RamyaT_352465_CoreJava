package sdet_java_task4;

public class Q6 {
static void BinaryCheck(int number){
		boolean isBinary= true;
		int copynum= number;
		while(copynum!=0)
		{
			int temp = copynum%10;   //Gives last digit of the number
            if(temp > 1)
            {
                isBinary = false;
                break;
            }
            else
            {
                copynum = copynum/10;    //Removes last digit from the number
            }
        }
        if (isBinary)
        {
            System.out.println(number+" is a binary number");
        }
        else
        {
            System.out.println(number+" is not a binary number");
        }
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       BinaryCheck(101010);
       BinaryCheck(124759);
	}
}
