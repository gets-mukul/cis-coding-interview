/**
1
2 6
3 7 10
4 8 11 13
5 9 12 14 15
 */
package com.c.pattern;

import java.util.Scanner;

/**
 * @author mukul
 *
 */
public class CisPattern05 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter value of N:");
		int n = sc.nextInt();
		int check = 0;
		int sum = 0;
		for (int i = 1; i <= n; i++) {
			sum = i;
			check = i;
			int temp = n;
			while (check > 0) {
				System.out.print(sum + " ");
				sum = sum + (temp - 1);
				check--;
				temp--;
			}
			System.out.println();
		}
	}

}
