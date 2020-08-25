package questionone;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
 * Write a function to find the sum of numbers which are missing in an array of numbers from 1 to
 * 100 in unsorted order
 * 
 */
public class QuestionOne {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		List<Integer> list = new ArrayList<>();
		
		System.out.println("Enter the array. Type -100 when done");
		while(true) {
			int num = sc.nextInt();
			if(num != -100) {
				list.add(num);
			}
			else
				break;
		}
		int result = findSum(list);
		System.out.println(result);
	}

	private static int findSum(List<Integer> list) {
		int result = 0;
		for(int i = 1 ; i <= 100 ; i++) {
			if(!list.contains(i)) {
				result += i;
			}
		}
		return result;
	}
}
