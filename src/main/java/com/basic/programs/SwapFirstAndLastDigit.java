/**
 * Write a C program to swap first and last digits of a number.
 */
package com.basic.programs;

import java.util.Scanner;

/**
 * @author mukul
 *
 */
public class SwapFirstAndLastDigit extends FirstAndLastDigit {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the value of n: ");
		int n = sc.nextInt();
		int first = FirstAndLastDigit.findFirstDigit(n);
		int last = n%10;
		

	}

}
