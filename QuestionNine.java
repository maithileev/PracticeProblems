package questionnine;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


/*
 * Write a program to solve the problem below
 * Given an array A[ ] denoting heights of N towers and a positive integer K, 
 * modify the heights of each tower either by increasing or decreasing them by K only once 
 * and then find out the maximum difference of the heights of shortest and longest towers
 * 
 */
public class QuestionNine {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter N");
		int n = sc.nextInt();
		List<Integer> list = new ArrayList<>();
		
		System.out.println("Enter heights");
		for(int i = 0 ; i < n ; i++) {
			list.add(sc.nextInt());
		}
		
		System.out.println("Enter K");
		int k = sc.nextInt();
		
		int result = maximumDifference(list,k);
		System.out.println(result);
	}

	private static int maximumDifference(List<Integer> list, int k) {
		
		int size = (int)Math.pow(2, (double)list.size());
		int allLists[][] = new int[size][list.size()];
		
		int pow = list.size();
		for(int j = 0 ; j < list.size() ; j++) {
			int value = (int)(Math.pow(2, pow)/2);
			int temp = 0 , temp1 = 0;
			int i = 0;
			while(i < size) {
				while(temp < value) {
					int a = list.get(j)+k;
					//System.out.println(a);
					allLists[i][j]=a;
			//		lists.get(i).set(j, a);
					temp++;
					i++;
				}
				while(temp1 < value) {
					int a = list.get(j)-k;
					allLists[i][j]=a;
				//	lists.get(i).set(j, a);
					temp1++;
					i++;
				}
				if(temp == value && temp1 == value) {
					temp = 0;
					temp1 = 0;
				}
			}
			pow--;
		}
		
	/*	for(int i = 0; i < size ; i++) {
			for(int j = 0 ; j < list.size(); j++) {
			System.out.print(allLists[i][j] + "\t");
			}
			System.out.println();
		}*/
		
		for(int i = 0 ; i < size ; i++) {
			for(int j = 0 ; j < list.size(); j++) {
				for(int m = 1 ; m < (list.size()-j); m++) {
					if(allLists[i][m-1] > allLists[i][m]) {
					int temp = allLists[i][m];
					allLists[i][m] = allLists[i][m-1];
					allLists[i][m-1] = temp;
					}
				}
			}
		}
		
		
	/*	for(int i = 0; i < size ; i++) {
			for(int j = 0 ; j < list.size(); j++) {
			System.out.print(allLists[i][j] + "\t");
			}
			System.out.println();
		}
	*/
		int maxHeight = 0 ;
		for(int i = 0 ; i < size ; i++) {
			if(allLists[i][0]>0) {
				int difference = allLists[i][list.size()-1] - allLists[i][0];
				if(maxHeight < difference)
					maxHeight = difference;
			}
		}
		return maxHeight;
	}
	}