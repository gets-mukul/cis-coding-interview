/**
 * Write a C program to print multiplication table of any number.
 */
package com.basic.programs;

import java.util.Scanner;

/**
 * @author mukul
 *
 */
public class MultiplicationTable {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub\
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the vallue of n:");
		int n = sc.nextInt();
		for(int i=1; i<=10; i++) {
			System.out.println(i+"*"+n+"="+(i*n));
		}

	}

}
