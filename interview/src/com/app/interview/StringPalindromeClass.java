package com.app.interview;

import java.util.Arrays;
import java.util.stream.Stream;

public class StringPalindromeClass {
	// palindrome String
	public static boolean isPalindrome(String str) {
		int start = 0;
		int end = str.length() - 1;
		while (start < end) {
			if (str.charAt(start) != str.charAt(end)) {
				return false;
			} else {
				start++;
				end--;
			}
		}
		return true;
	}

	public static void checkLongestPalindromeWord(String str) {
		String[] arr = str.split(" ");
		String longestWord = null;
		int highestLenght = 0;
		for (int i = 0; i < arr.length; i++) {
			if (isPalindrome(arr[i])) {
				if (highestLenght < arr[i].length()) {
					highestLenght = arr[i].length();
					longestWord = arr[i];
				}
			}
		}
		System.out.println("longest word " + longestWord);
	}

	// Ex- input:- my name is Diwakar Sharma
	// output:-Sharma Diwakar is name my
	// Reverse String
	public static void reverseString(String str) {
		String[] strarr = str.split(" ");
		System.out.println("hello");
		String reversedString = "";
		int start = 0;
		int end = strarr.length - 1;
		while (start < end) {
			String temp = strarr[start];
			strarr[start] = strarr[end];
			strarr[end] = temp;
			start++;
			end--;
		}
		for (int i = 0; i < strarr.length; i++) {
			reversedString += strarr[i] + " ";
		}
		System.out.println("reversedString =" + reversedString);
	}

	//to finf nth smallest and nth highest no. in array.

	//5,10,15,20,20,36,54,55,63
	public static void findSmallest(int[] arr,int num)
	{
		Arrays.sort(arr);
	Object[] arr2=Stream.of(arr).distinct().toArray();
			System.out.println("third hghest= "+arr[arr.length-num]+" ");
			System.out.println("third lowest= "+arr[num-1]+" ");
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		String str = "my name is madhuhdam aba";
//		checkLongestPalindromeWord(str);

		String str2 = "my name is madhu";
		reverseString(str2);
		
		int[] arr=new int[] {20,10,54,63,20,15,36,25,55};
		findSmallest(arr,3);
	}

}
