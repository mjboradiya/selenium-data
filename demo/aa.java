package demo;

import java.util.Scanner;

public class aa {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A, B, C, D ;
		System.out.println("ENTER 1ST VALUE");
		A = sc.nextInt();
		System.out.println("ENTER 2ND VALUE");
		B = sc.nextInt();
		System.out.println("ENTER 3RD VALUE");
		C = sc.nextInt();
		D= A+B+C ;
		System.out.println("TOTAL OF 3 NUMBER IS = " +D );
		System.out.println("The largest number of the two numbers is " + Math.max(A,B));
						
	}
}
