package sdet_java_task2;

public class Q4 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Core Java Programming training";
        char ch = 'i';
        int frequency = 0;

        for(int i = 0; i < str.length(); i++) {
            if(ch == str.charAt(i)) {
                ++frequency;
            }
        }

        System.out.println("Frequency of " + ch + " = " + frequency);
	}
}
