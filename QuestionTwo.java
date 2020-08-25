package questiontwo;

import java.util.Scanner;

/*
 * Write a program to find all prime number up to a given number
 */
public class QuestionTwo {
 
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int num = sc.nextInt();
		System.out.println("***** Prime Numbers upto "+num+" *****" );
		primeNumbers(num);
	}

	private static void primeNumbers(int num) {
		for(int i = 2 ; i <= num ; i++) {
			int factors = 0;
			for(int j = 2 ; j < i ; j++) {
				if(i % j == 0) {
					factors++;
				}
			}
			if(factors == 0) {
				System.out.print(i+"\t");
			}
		}
		
	}
}
