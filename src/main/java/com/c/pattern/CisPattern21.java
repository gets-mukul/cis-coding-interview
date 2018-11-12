/**
Write a program to find Transpose of the given Matrix:
1 2 9
0 4 7
7 3 2
(output expected)
1 0 7
2 4 3
9 7 2
 */
package com.c.pattern;

/**
 * @author mukul
 *
 */
public class CisPattern21 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		System.out.println("Array before tranpose :");
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}

		System.out.println("Array after tranpose:");

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print(arr[j][i] + " ");
			}
			System.out.println();
		}

	}

}
