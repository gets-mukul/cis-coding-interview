/**
6 5 4 3 2 1 2 3 4 5 6
5 4 3 2 1 2 3 4 5
4 3 2 1 2 3 4
3 2 1 2 3
2 1 2
1
 */
package com.c.pattern;

import java.util.Scanner;

/**
 * @author mukul
 *
 */
public class CisPattern10 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of n:");
		int n = sc.nextInt();
		
		for(int i=n; i>=1; i--) {
			for(int j=i; j>=1; j--) {
				System.out.print(j+" ");
			}
			for(int j=2; j<=i; j++) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}

}
