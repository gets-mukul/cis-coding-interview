/**
1 _ _ _ _ _ _ _ 1
3 3 _ _ _ _ _ 3 3
5 5 5 _ _ _ 5 5 5
7 7 7 7 _ 7 7 7 7
 */
package com.c.pattern;

import java.util.Scanner;

/**
 * @author mukul
 *
 */
public class CisPattern16 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the value of n:");
		int n = sc.nextInt();
		int k=1;;
		for(int i=1; i<n; i++) {
			if(i%2!=0) {
				for(int j=1; j<=k; j++) {
					System.out.print(i+" ");
				}
				for(int j=1; j<=n-2*k; j++) {
					System.out.print("_ ");
				}
				for(int j=1; j<=k; j++) {
					System.out.print(i+" ");
				}
				k++;
				System.out.println();
			}
				
		}

	}

}
