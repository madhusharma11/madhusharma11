package com.app.interview;

public class ArrayClass {

	public static void findNthelement(int[] arr)
	{
		//10,50,40,60,80,4
		int highest=arr[0],second_highest=0;
		for(int i =1; i<arr.length-1; i++)
		{
				if(highest<arr[i])
					{
					second_highest=highest;
					highest=arr[i];
			        }
		}
		System.out.println("highest "+highest+"  second highest "+second_highest);
	}
}
