package javaassigment;

public class CopyArray {

	public static void main(String[] args) {
		
		int[] a = {1, 2, 3 , 4 } ;
		int[] b = a ;
		
		b[0] ++ ;
		
		System.out.print("Array a = ");
		printArray(a); 
		 System.out.print("Array b = ");
	      printArray(b);
		
		
	}

	private static void printArray(int[] a) {
		// TODO Auto-generated method stub
		System.out.print(" [ ");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
		System.out.println(" ] ");
	}
}
