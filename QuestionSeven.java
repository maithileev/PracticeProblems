package questionseven;

import java.util.Scanner;

/*
 * Write a program to reverse the characters in each word of a string
 */
public class QuestionSeven {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String reverseString = null;
		System.out.println("Enter String");
		String str = sc.nextLine();
		
		String list[] = str.split(" ");
		for(String i : list) {
			int end = i.length()-1;
			int j = 0;
			char arr[] = i.toCharArray();
			while(j < end) {
				char temp = arr[j];
				arr[j] = arr[end];
				arr[end] = temp;
				j++;
				end--;
			}
			i = String.valueOf(arr);
			if(reverseString == null) {
				reverseString = i;
			}
			else {
				reverseString=reverseString.concat(i);
			}
			reverseString = reverseString.concat(Character.toString(' ')); 
		}
		System.out.println(reverseString);
	
	}
}
