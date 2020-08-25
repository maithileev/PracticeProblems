package questionsix;
import java.util.ArrayList;
import java.util.List;
/*
 * Write a program to count a number of vowels and consonants in a given string
 */
import java.util.Scanner;

public class QuestionSix {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter String");
		String str = sc.nextLine();
		List<Integer> vowelList = new ArrayList<>();
		vowelList.add(65);
		vowelList.add(69);
		vowelList.add(73);
		vowelList.add(79);
		vowelList.add(85);
		vowelList.add(97);
		vowelList.add(101);
		vowelList.add(105);
		vowelList.add(111);
		vowelList.add(117);
 		int vowels = 0;
 		int space = 32;
		int consonants = 0;
		for(int i = 0 ; i < str.length() ; i++) {
			int asciivalue = (int)str.charAt(i);
			if(asciivalue >= 65 && asciivalue <= 90  || asciivalue >= 97 && asciivalue <= 122 || asciivalue == 32) {
				if(vowelList.contains(asciivalue)) {
					vowels++;
				}
				else if(asciivalue != space) {
					consonants++;
				}
			}
			else {
				System.out.println("Incorrect String.");
			}
		}
		System.out.println("Vowels - "+vowels+"\t Consonants - "+consonants);
	}
}
