package javaassigment;

public class ReverceArray {
public static void main(String[] args) { 
	
	int[]  arr = new int[] {1,2,3,4,5,6,7,8};
	System.out.println("first array = ");
	for (int i = 0; i < arr.length; i++) {
		System.out.print(arr[i] + " ");
	}
	System.out.println();
	System.out.println(" revers = ");
	for(int i =arr.length-1 ; i >= 0 ; --i )
	{System.out.print(arr[i] + " ");}
}
}
  