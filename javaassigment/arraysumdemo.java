package javaassigment;

public class arraysumdemo {
public static void main(String[] args) {
	int [] array = new int[] {1, 2, 3,4 ,5,6,7,8 ,8};
	int sum = 0; 
	for (int i=0 ; i < array.length ; i++)
	{
		sum = sum + array[i];
	}
	System.out.println("sum of element in array  : " +sum);
}
}
