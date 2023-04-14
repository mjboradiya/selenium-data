package javaassigment;

public class factorial {
	public static void main(String[] args) {
//		int nub = 10 ;
//		 long Factorial = 1;
//		 {
//					 
//		 for(int i =1 ; i <=nub ; ++i)
//		 {
//			 Factorial *= 1 ;
//		 }
//		     System.out.printf("Factorial of %d = %d" , nub ,Factorial);
//		}
		int nub = 5, i = 1;
        long Factorial = 1;
        while(i <= nub)
        {
           Factorial *= i;
            ++i;
        }
        System.out.printf("Factorial of %d = %d", nub, Factorial);
	}
 
	
}
