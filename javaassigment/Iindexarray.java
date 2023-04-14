package javaassigment;

public class Iindexarray {
 public static int index (int array[] , int t , int start )
 {
	 if(start == array.length)
		 return -1 ;
	 
	 if(array[start]== t ) 
		 return start;
	     return index(array , t , start+1) ;
 }
 public static int findindex(int array[], int t)
 {
	 return index(array, t , 0);
 }
 public static void main(String[] args) {
	int [] myarray = {1,2,3,4,5,6,7};
	System.out.println("index position of 3 is : ");
	System.out.println( findindex(myarray , 3) );
	System.out.println("index position of 4 is : ");
	System.out.println(findindex(myarray , 4 ));
}
 
 
}
