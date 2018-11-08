/**
1
2 3 2
3 4 5 4 3
4 5 6 7 6 5 4
5 6 7 8 9 8 7 6 5
 */
package com.c.pattern;

import java.util.Scanner;

/**
 * @author mukul
 *
 */
public class CisPattern11 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the value of n:");
		int n = sc.nextInt();
		
		for(int i=1; i<=n; i++) {
			for(int j=i; j<=(2*i-1); j++) {
				System.out.print(j+" ");
			}
			if((2*i-1)!=1) {
				for(int j=(2*i-2); j>=i; j--) {
					System.out.print(j+" ");
				}
			}
			System.out.println();
		}

	}

}
