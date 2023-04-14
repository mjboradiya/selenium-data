package javaassigment;

public class fibonacidemo {
public static void main(String[] args) {
	int n1 = 0, n2 = 1 ,n3 , i , count =10 ;
	System.out.print(n1+" "+n2);
	for(i=2 ; i < count; i++)
	{
		n3 = n2+n1 ;
		System.out.print(" " + n3 );
		n1=n2;
		n2=n3;
	}
}
}
//The Fibonacci sequence is a set of integers
//(the Fibonacci numbers) that starts with a zero, 
//followed by a one, then by another one,
//and then by a series of steadily increasing numbers. The sequence follows the 
//rule that each number is equal to the sum of the preceding two numbers.