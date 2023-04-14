package javaassigment;

class ExtendthredDemo extends Thread {
	 
	
		public void run(){  
			
		System.out.println("thread is running");  
	
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		}  
		
		
		public static void main(String args[]){  
			
			ExtendthredDemo m1 = new ExtendthredDemo();  
			m1.start();
	     	 

			
		 }  
		

}
