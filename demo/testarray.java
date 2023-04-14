package demo;

import java.util.Scanner;

public class testarray {
         public static void main(String[] args)
         {
        	 
//        	int i[] = { 1, 2, 3, 4, 5 };
//        	for(int a=0 ; a<i.length ; a++)
//        	{
//        		System.out.println(i[a]);
//        	}
//        		
//	int rollno[]= {1,2,3,4,5,6,7,8};
//	for(int no=0; no<rollno.length ; no++) {
//		System.out.println(rollno[no]);
//	}
//	System.out.println("rollno : "+rollno[5]);

	Scanner sc = new Scanner(System.in);
	System.out.println("enter size of array : ");
	int size = sc.nextInt();
	int arr1[] = new int[size];
	for(int index=0;index<arr1.length;index++)
	{
		System.out.print("enter value at arr["+index+"] : ");
		arr1[index] =  sc.nextInt();
	
	}
	
	

}
}
