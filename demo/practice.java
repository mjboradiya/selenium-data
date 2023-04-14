package demo;

import java.util.Scanner;

public class practice {
	public static void main(String[] args) {
		int a , b ,c;
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("enter value for a = ");
			a = sc.nextInt();
			System.out.println("enter value for b = ");
			b =sc.nextInt();
		}
        c = a+ b; 
        System.out.println("addition of a and b is = " +c);
        if (a+b <= 10) {
        	System.out.println("less than 10");
        }
        else if(c <= 15)
        {
        	System.out.println("greater than 10 less than 15");
        }
        else 
        
        {
        	System.out.println("greater than 15");
     	}
        
        
	}
}

