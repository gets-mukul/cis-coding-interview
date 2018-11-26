/**
 * Write a C program to count number of digits in a number.
 */
package com.basic.programs;

import java.util.Scanner;

/**
 * @author mukul
 *
 */
public class CountNumberOFDigit {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the value of n:");
		int  n = sc.nextInt();
		int count = findNumberOfDigit(n);
		System.out.println(count);
		

	}

	private static int findNumberOfDigit(int n) {
		int count = 0;
		while(n>0) {
			count++;
			n = n/10;
		}
		return count;
	}

}
