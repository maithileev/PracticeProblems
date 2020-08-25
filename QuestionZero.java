package questionzero;

import java.util.Scanner;

/*
 * Write a function called “QuickTest” that will accept one positive integer and return either one of
 * the four strings:
 * Apple: if given number is divisible by 3
 * Orange: if given number is divisible by 5
 * Pineapple: if given number is divisible by 3 and 5
 * Banana: In any other condition
 */

public class QuestionZero {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int value = sc.nextInt();
		String result  = quickTest(value);
		System.out.println(result);
	}

	private static String quickTest(int value) {
		String result = null;
		if(value % 3 == 0 && value % 5 == 0)
			result = "Pineapple";
		else if(value % 3 == 0)
			result = "Apple";
		else if(value % 5 == 0)
			result = "Orange";
		else
			result = "Banana";
		return result;
	}
	
}
