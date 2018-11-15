/**
 * 
 */
package com.c.pattern;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

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
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();						//input of string
		str = str.toLowerCase();						// convert string to lowercase
		
		HashMap<Character, Integer> frequency_hash = new HashMap<Character, Integer>();
		
		for(int i=0; i<str.length(); i++) {
			if(str.charAt(i)!=' ') {
				if(frequency_hash.containsKey(str.charAt(i))) {									//check for current character exist, if exist add value by one
					frequency_hash.put(str.charAt(i), frequency_hash.get(str.charAt(i))+1);
				}
				else {																			// else put the key and initialise value by 1
					frequency_hash.put(str.charAt(i), 1);
				}
			}
		}
		
		for (Map.Entry entry : frequency_hash.entrySet()) { 
            System.out.println(entry.getKey() + " " + entry.getValue()); 
        } 
		

	}

}
