/**
 * Write a program to find kth max number in an array?
 */
package com.basic.programs;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author mukul
 *
 */
public class KLargestElement {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the value of K: ");
		int k = sc.nextInt();
		int[] arr = {9, 4, 5, 2, 7, 6, 1, 8, 3};
	    int result  = findLargest(k, arr);
	    System.out.println(result);
	    

	}

	private static int findLargest(int k, int[] arr) {
		Arrays.sort(arr);
		
		return arr[arr.length-k];
	}
	

}
