package questionthree;

import java.util.Scanner;

/*
 * Write a simple algorithm to find Container With Most Water
 * 
 * Algorithm - 
 * 
 * 1. for i 0 to length do steps 2 to 5
 * 2. for j i+1 to length do steps 3 to 5
 * 3. length = smaller of height[j] and height[i]
 * 4. breadth = j - i
 * 5. if max < length * breadth then max = length * breadth
 * 6. return max
 */ 
public class QuestionThree {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter n");
		int n = sc.nextInt();
		System.out.println("Enter heights");
		int[] height = new int[n];
		for(int i = 0 ; i < n ; i++) {
			height[i] = sc.nextInt();
		}
		int result = maxArea(height);
		System.out.println(result);
	}

	private static int maxArea(int[] height) {
		int max = 0,l=0,b=0;
		for(int i = 0; i < height.length ;i++){
			for(int j = i+1 ; j < height.length ; j++){
				if(height[i]<height[j]) 
					l = height[i];
		        else 
		        	l = height[j];
		        b = j-i;
		        if(max < l*b)
		        	max = l*b;
		     }
		 }
		 return max; 
	}
}
