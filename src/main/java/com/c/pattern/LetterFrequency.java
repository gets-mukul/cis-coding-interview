/**
 * 
 */
package com.c.pattern;

import java.lang.reflect.Array;
import java.util.*;

/**
 * @author mukul
 *
 */
public class LetterFrequency {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 5,3,7,6,8,1,9,4,0,2};
		
		Arrays.sort(arr, 0, 4);

		
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]);
		}

	}

}
