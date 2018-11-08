/**
1
2 1
3 2 1
4 3 2 1
5 4 3 2 1
6 5 4 3 2 1
 */
package com.c.pattern;

import java.util.Scanner;

/**
 * @author mukul
 *
 */
public class CisPattern08 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the value of n:");
		int n = sc.nextInt();
		
		for(int i=1; i<=n; i++) {
			for(int j=i; j>=1; j--){
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}

}
