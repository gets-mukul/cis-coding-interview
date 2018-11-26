/**
 * Write a C program to find first and last digit of a number.
 */
package com.basic.programs;

import java.util.Scanner;

/**
 * @author mukul
 *
 */
public class FirstAndLastDigit {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the value of N: ");
		int n = sc.nextInt();
		System.out.println("Last digit is: "+(n%10));
		System.out.println("First Digit is: "+findFirstDigit(n));
	}

	private static int findFirstDigit(int n) {
		while(n>9) {
			n = n/10;
		}
		return n;
	}

}
