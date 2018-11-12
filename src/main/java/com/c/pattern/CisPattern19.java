/**


_ _ _ *
_ _ * A *
_ * A * A *
* A * A * A * 



 */
package com.c.pattern;

import java.util.Scanner;

/**
 * @author mukul
 *
 */
public class CisPattern19 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("ENter the value of n:");
		int n = sc.nextInt();

		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= (n - i); j++) {
				System.out.print("_ ");
			}
			for (int j = 1; j <= (2 * i - 1); j++) {
				if (j % 2 != 0) {
					System.out.print("* ");
				} else {
					System.out.print("A ");
				}
			}
			System.out.println();
		}

	}

}
