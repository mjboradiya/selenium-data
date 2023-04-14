package demo;

import java.util.Scanner;

class A {
   public void run() {
	   System.out.println(" hello run how r u ?");
   } 
   public void fun() {
	   System.out.println(" hello fun how r u ? ");
   }
 
}
public class userinput {
	public static void main(String[] args) {
	//	int a=1, b=2 , c ;
	//	c= a+b ;
	//	c= a-b ;
	//	System.out.println(" addition of a and b = " +c);
	//	System.out.println(" sub of a and b = " +(-c) );
		
	//	A gopi = new A();
	//	gopi.run();
		System.out.println();
	//	gopi.fun();
		System.out.println();
		
		Scanner gopi = new Scanner(System.in);
		int a,b,c;
		System.out.println("ENTER VALUE OF a = ");
		a = gopi.nextInt();
		System.out.println("ENTER VALUE OF b = ");
		b = gopi.nextInt();
		c = a+b ;
		System.out.println("addition of a and b = " +c );
	}
}