package eg1;

import java.util.Arrays;

public class ArraysClassDemo {

	public static void main(String[] args) {
		int ar1[]= {12,33,11,23,4,11,12,11,12,11};
		
		System.out.println(ar1);
		
		System.out.println(Arrays.toString(ar1));
		
		
		Arrays.sort(ar1);
		System.out.println(Arrays.toString(ar1));
		
		
		System.out.println(Arrays.binarySearch(ar1, 100)); //if present it will return positive value(>=0) if not present then it will return -ve value(<0)
		System.out.println(Arrays.binarySearch(ar1, 12));
		System.out.println(Arrays.binarySearch(ar1, 11));
		System.out.println(Arrays.binarySearch(ar1, 4));
		
		int ar2[]=Arrays.copyOf(ar1, ar1.length+5);
		System.out.println(Arrays.toString(ar2));
		
		int ar3[]=Arrays.copyOfRange(ar1, 2, 4);
		System.out.println(Arrays.toString(ar3));
		
		Arrays.fill(ar3, -10);
		System.out.println(Arrays.toString(ar3));
		
		Arrays.fill(ar3, 0, 1, -90000);
		System.out.println(Arrays.toString(ar3));
	}

}
/*
 * Tasks 
 * 1)Find Nth  max in array, remember it will have duplicates
 * 2)Take an array and remove all duplicates in it
 * 3)Find all the palindrome numbers in array
 * 4)Find all prime numbers in array
 * 5)Take array as input remove the digits where the first value and last value is same
 * eg [101,22,344,699]-> in this 101 and 22 should be removed because the first digit and last is same
 * so output will be [344,699]
 */
