package questionten;

import java.util.Scanner;

public class QuestionTen {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of days");
		int n = sc.nextInt();
		
		int arr[] = new int[n];
		System.out.println("Enter prices");
		for(int i = 0 ; i < n ; i++) {
			arr[i] =sc.nextInt();
		}
		int result = maxProfit(arr);
		System.out.println(result);
	}

	private static int maxProfit(int[] arr) {
		int profit = 0;
        for(int i = 0 ; i < arr.length - 1 ; i++ ){
            if(arr[i+1] > arr[i]){
                profit += arr[i+1] - arr[i];
            }
        }
	

		return profit;
	}

}
