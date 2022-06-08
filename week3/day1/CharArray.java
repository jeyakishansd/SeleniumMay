package week3.day1;

import org.bouncycastle.util.Arrays;

public class CharArray {

public static void main(String[] args) {
	int[] arr = {2,3,4,5,6,7,8,0,0};
	arr[4]=34;
	Arrays.reverse(arr);
	int length = arr.length;
//	System.out.println(length);
	//System.out.println(arr[1]);
	//System.out.println(arr[length-2]);
	for (int i =length-1; i>=0; i--) {
		System.out.print(arr[i]+",");
		
	}
}
}
