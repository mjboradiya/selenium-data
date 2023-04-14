package demo;

public class NEWTRYCATCH {
   public static void main(String[] args) {
	   try {
		   int[]  mynub = {1, 2,3 } ;
		   System.out.println(mynub[10]);
	   } 
	   catch (Exception e )
	   {
		   System.out.println("something went wrong");
	   }
	   finally
	   {
		  System.out.println("catch and try complate");
	   }
	
}
}
