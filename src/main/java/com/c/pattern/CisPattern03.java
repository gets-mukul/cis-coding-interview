/**
1111111
1111122
1111333
1114444
1155555
1666666
7777777
 */
package com.c.pattern;

import java.util.Scanner;

/**
 * @author mukul
 *
 */
public class CisPattern03 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter value of n:");
		int n = sc.nextInt();

		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= (n - i); j++) {
				System.out.print("1 ");
			}

			for (int j = (n - i); j < n; j++) {
				System.out.print(i + " ");
			}
			System.out.println("\n");
		}

	}

}
