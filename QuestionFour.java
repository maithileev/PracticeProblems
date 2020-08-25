package questionfour;

import java.util.Scanner;

/*
 * Write a simple algorithm to find a contiguous subarray of an integer array with the largest sum 
 * Algorithm - 
 * 1. Initialise sum and previousSum to zero
 * 2. Add array element in sum
 * 3. if the sum < 0, set it to 0 and mark the startindex as the next array element
 * 4. if the sum > 0, check --> 
 * 					            if sum > previousSum update previousSum and set endindex as that array element
 * 5. repeat steps 2 to 4 for all elements of the given array
 * 6. display the previousSum and subarray starting from startindex upto endindex 
 * 
 */
public class QuestionFour {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the length of array");
		int n = sc.nextInt();
		int arr[] = new int[n];
		
		System.out.println("Enter Array");
		for(int i = 0 ; i < n ; i++) {
			arr[i]=sc.nextInt();
		}
		
		largestSum(arr);
	}

	private static void largestSum(int[] arr) {
		int startIndex = 0, endIndex = 0, sum = 0, prevSum =0;
		for(int i = 0 ; i < arr.length ; i++) {
			sum = sum +arr[i];
			if(sum < 0) {
				sum = 0;
				startIndex = i+1;
			}
			
			if(sum > 0) {
				if(prevSum < sum) {
					endIndex = i;
					prevSum = sum;
				}
			}	
		}
		System.out.println(prevSum);
		System.out.println("Subarray is - ");
		for(int i = startIndex ; i  <= endIndex ; i++) {
			System.out.print(arr[i] + "\t");
		}
				
	}

}
