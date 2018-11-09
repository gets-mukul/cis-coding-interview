/**
2
2 4
2 4 6
2 4 6 8
2 4 6 8 10
2 4 6 8 10 12
 */
package com.c.pattern;

import java.util.Scanner;

/**
 * @author mukul
 *
 */
public class CisPattern14 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the value of n:");
		int n = sc.nextInt();
		
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print(j*2+" ");
			}
			System.out.println();
		}
	}

}
