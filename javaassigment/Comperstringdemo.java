package javaassigment;

public class Comperstringdemo {
   public static void comparestring(String s1 , String s2)
    {
	int len1 = s1.length();
	int len2 = s2.length();
	
	}
   public static void main(String args[]) {
	    
	    String s1 = new String("java");
	    String s2 = new String("testing");
	    String s3 = new String("java1");
	    String s4 = new String("testing1");
	   
	    int result = s1.compareTo(s2);
	    System.out.println(s1 + " and " + s2 + "= " + result);
	  
	     result = s1.compareTo(s4);
	    System.out.println(s1 + " and " + s4 + "= " + result);
	   
	    result = s1.compareTo(s3);
	    System.out.println(s1 + " and " + s3 + "= " + result);
	   
	    result = s3.compareTo(s1);
	    System.out.println(s3 + " and " + s1 + "= " + result);
	   
	  
	  }
	
}
