/**
1 2 3 4 5 5 4 3 2 1
1 2 3 4 4 3 2 1
1 2 3 3 2 1
1 2 2 1
1 1
 */
package com.c.pattern;

import java.util.Scanner;

/**
 * @author mukul
 *
 */
public class CisPattern12 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the value of n:");
		int n = sc.nextInt();
		
		for(int i=n; i>=1; i--) {
			for(int j=1; j<=i; j++) {
				System.out.print(j+" ");
			}
			for(int j=i; j>=1; j--) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
		
		

	}

}
