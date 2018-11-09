/**
A 
B C 
D E F 
G H I J 
K L M N O
 */
package com.c.pattern;

import java.util.Scanner;

/**
 * @author mukul
 *
 */
public class CisPattern13 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the value of n:");
		int n = sc.nextInt();
		for(int i=0; i<n; i++) {
			for(int j=(65+i); j<(66+2*i); j++) {
				System.out.print((char)j+" ");
			}
			System.out.println();
		}
		

	}

}
