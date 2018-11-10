/**
1_2_3_4_5_6_7
_2_3_4_5_6_7_
__3_4_5_6_7__
___4 5 6 7___
____5 6 7____
_____6 7_____
______7______
_____6 7_____
____5 6 7____
___4 5 6 7___
__3 4 5 6 7__
_2 3 4 5 6 7_
1 2 3 4 5 6 7
 */
package com.c.pattern;

import java.util.Scanner;

/**
 * @author mukul
 *
 */
public class CisPattern04 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the value of n:");
		int n = sc.nextInt();

		for (int i = 0; i < n; i++) {
			for (int j = (n - i); j < n; j++) {
				System.out.print(" ");
			}
			for (int j = i + 1; j <= n; j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}

		for (int i = 2; i <= n; i++) {
			for (int j = 1; j <= (n - i); j--) {
				System.out.print(" ");
			}
			for (int j = (n-i); j < n; j++) {
				System.out.print((j+1) + " ");
			}
			System.out.println();
		}

	}
}
