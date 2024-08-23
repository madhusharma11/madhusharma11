package com.app.interview;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StringClass {
//print occurances of characters.
	public static void occurancesCharacters(String str) {
//		Map<String, Long> map2=Stream.of(str.split("")).
//		collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
//		System.out.println(map2);

		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		for (int i = 0; i < str.length(); i++) {
			if (map.containsKey(str.charAt(i))) {
				int value = map.get(str.charAt(i));
				value++;
				map.put(str.charAt(i), value);
			} else {
				map.put(str.charAt(i), 1);
			}
		}
		System.out.println(map);
	}

	// print highest occurance of character.

	public static void highestOccurance(String str) {

		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		for (int i = 0; i < str.length(); i++) {

			if (map.containsKey(str.charAt(i))) {
				int value = map.get(str.charAt(i));
				value++;
				map.put(str.charAt(i), value);

			} else {
				map.put(str.charAt(i), 1);
			}
		}
//	   Integer highest=map.get(str.charAt(0));
//		for(int i=0;i<str.length();i++)
//		{
//			highest=highest<map.get(str.charAt(i))?map.get(str.charAt(i)):highest;
//			
//			//.getOrDefault(str.charAt(i),str.valueOf(i));
//		}

		char key = Collections.max(map.entrySet(), Map.Entry.comparingByValue()).getKey();
		System.out.println("highest " + key);
		System.out.println(map);
		// Map<String, Long>
		// map2=Stream.of(str.split("")).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
	}

	// palindrome
	public static void palindromeNumber(int num) {
		int q, r;
		for (int i = 0; num > 0; i++) {
			q = num % 10;
			num = num / 10;
			System.out.println("num " + num);
		}
		System.out.println("num " + num);
	}

	// 7)to print first non repeated character from string.
//	Map<String, Long> map2=Stream.of(str.split("")).
//			collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
//			System.out.println(map2);
	public static void nonRepeatedCharacter(String str) {
		Map<String, Long> map = Stream.of(str.split(""))
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		for (int i = 0; i < map.size(); i++) {
			String key = Collections.min(map.entrySet(), Map.Entry.comparingByValue()).getKey();
			System.out.println("min" + key);
		}
		System.out.println(map);

	}

	// fibbonacci series
	public static void fibbonacciSeries() {
		int num1 = 0, num2 = 1, num3;
		System.out.print(num1 + " " + num2 + " ");
		for (int i = 2; i < 10; i++) {
			num3 = num1 + num2;
			System.out.print(num3 + " ");
			num1 = num2;
			num2 = num3;

		}
	}

	// prime
	public static void checkPrime(int num)
	{
		
		for(int i=2;i<num;i++)
		{
			boolean flag=true;
			for(int j=2;j<i;j++)
			{
				if(i%j==0)
				{
					flag=false;
					//System.out.println("not a prime");
					break;
				}
			}
			if(flag)
			System.out.print(i+" ");
			}
			
			
	}
	
	//palindrome String
	public static boolean isPalindrome(String str)
	{
		int start=0;
		int end=str.length()-1;
		while(start<end)
		{
			if(str.charAt(start)!=str.charAt(end))
			{
				return false;
			}
			else
			{
				start++;
				end--;
				
			}
		}
		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		StringClass.occurancesCharacters("ababdfgr");
//		highestOccurance("ababdfgrbb");
//		palindromeNumber(1212);
//		nonRepeatedCharacter("ABCBDB");
		// fibbonacciSeries();

//		checkPrime(100);
		
		String str="my name is madhuhdam aba";
		String[] arr=str.split(" ");
		String longestWord=null; 
		int highestLenght=0;
		for(int i=0;i<arr.length;i++)
		{
			if(isPalindrome(arr[i]))
			{
				if(highestLenght<arr[i].length()) {
					highestLenght = arr[i].length();
					longestWord = arr[i];
				}
			
			}
		}
		
		System.out.println("longest word "+longestWord);
	}

}
