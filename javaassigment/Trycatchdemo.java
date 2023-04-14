package javaassigment;

public class Trycatchdemo {
	public static void main(String[] args) {
		int[] number = {1,2,3,4,5} ;
		try {
			System.out.println(number[10]);
			
		} catch (Exception e) {
			System.out.println("something went wrong");
		}
	}

}
