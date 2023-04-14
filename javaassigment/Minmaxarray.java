package javaassigment;

import java.util.Arrays;

public class Minmaxarray {
 static int max;
 static int min; 
 
  public static void max_min(int array[])
  {
	  max = array[0];
	  min = array[0];
	  int len = array.length;
	  for (int i = 1; i < len - 1; i = i + 2)
	  {
		  if(i +1 < len)
		  {
			  if(array[i]> max ) max = array[i];
			  if(array[i] < min ) min = array [i];
			  
		  }
		  if(array[i]>array[i + 1])
		  {
			  if(array[i]> max)max = array[i];
			  if(array[i + 1] < min ) min = array[i+1];
		  }
		  if(array[i]< array[i+1])
		  {
			  if(array[i] < min ) min =array[i ];
			  if(array[i + 1]> max ) max = array[ i+1 ] ; 
			  
		  }
	  }
	  
  }
  public static void main(String[] args) {
	int [] array = {1,2,3,4,5,6,7,8,9,10 } ;
	max_min(array) ; 
	System.out.println("array : " +Arrays.toString(array));
	System.out.println("maximum : " +max);
	System.out.println("minimum : " + min);
	
  }
}





 
