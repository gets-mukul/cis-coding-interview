/**
_ _ _ 1
_ _ 2 3 2
_ 3 4 5 4 3
4 5 6 7 6 5 4
 */
package com.c.pattern;

import java.util.Scanner;

/**
 * @author mukul
 *
 */
public class CisPattern20 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the value of n:");
		int n = sc.nextInt();

		for (int i = 1; i <= n; i++) {
			for (int j = n - i; j >= 1; j--) {
				System.out.print("_ ");
			}
			for (int j = i; j <= (2 * i - 1); j++) {
				System.out.print(j + " ");
			}
			for (int j = (2 * i - 2); j >= i; j--) {
				System.out.print(j + " ");
			}
			System.out.println();
		}

	}

}
