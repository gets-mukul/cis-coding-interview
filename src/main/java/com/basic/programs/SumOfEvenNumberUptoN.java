/**
 * Write a C program to find sum of all even numbers between 1 to n.
 */
package com.basic.programs;

import java.util.Scanner;

/**
 * @author mukul
 *
 */
public class SumOfEvenNumberUptoN {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the value of n:");
		int n = sc.nextInt();
		int sum = 0;
		while(n>0) {
			if(n%2==0)
			sum = sum + n;
			n--;
		}
		System.out.println(sum);

	}

}
