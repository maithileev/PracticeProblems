package questioneight;

import java.util.Scanner;

/*
 * Write a function to find the length of the longest substring without repeating characters
 */
public class QuestionEight {
 
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String");
		String s = sc.nextLine();
		int result = lengthOfLongestSubstring(s);
		System.out.println(result);
	}

	private static int lengthOfLongestSubstring(String s) {
		int startIndex = 0,endIndex = 0,maxLength = 0,prevLength =0;
        String subString = null;
        for(int i = 0 ; i < s.length() ; i++){
          
            if(subString == null){
                subString = Character.toString(s.charAt(i));
                startIndex = i;
                maxLength++;
            }
            
            else{
                int j = 0;
            
                if(subString.contains(Character.toString(s.charAt(i)))){
                    j = s.indexOf(Character.toString(s.charAt(i)),startIndex);
                
                    if((endIndex - startIndex) > maxLength){
                         maxLength = endIndex - startIndex;
                    }
                    startIndex = j+1;
                    subString = Character.toString(s.charAt(j+1));
                    maxLength = 1;
                    
                    for(int k = j+2 ; k <= i ; k++ ){
                        subString = subString.concat(Character.toString(s.charAt(k)));
                        maxLength++;
                    }
                }
                
                else{
                        subString = subString.concat(Character.toString(s.charAt(i)));
                        endIndex = i;
                        maxLength++;
                    }
            }
            
            if(prevLength < maxLength){
                prevLength = maxLength;
            }
        }
        return prevLength;

	}
}
