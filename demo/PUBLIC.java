package demo;

import java.util.Scanner;

public class PUBLIC {
 public static void main(String[] args) {
	int  a =10 ;
	int  b , c, d ;
	a += 2;
	System.out.println(a);
	a -= 3;
	System.out.println(a);
	a *= 2 ;
	System.out.println(a);
	a /= 2 ;
	System.out.println(a);
	
	Scanner sc = new Scanner(System.in);
	System.out.println("enter a = " +a);
	System.out.println("enter b = ");
	b = sc.nextInt();
	System.out.println("enter c = ");
	c = sc.nextInt();
	
	d = a + b+ c ;
	System.out.println("total is = " +d);
    if(d > 30)	
       {
    	System.out.println("total nub is above 30");
       }
   
    else if (d <= 20)
       {
    	System.out.println("below 20");
       }
    else 
        {
    	System.out.println("below 30");
    	}
    

}
}
