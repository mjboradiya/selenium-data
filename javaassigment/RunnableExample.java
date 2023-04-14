package javaassigment;

public class RunnableExample implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
	}

		public static void main(String[] args) {
			
		        System.out.println("Inside : " + Thread.currentThread().getName());

		        System.out.println("Creating Runnable...");
		        Runnable runnable = new RunnableExample();
		        

		        System.out.println("Creating Thread...");
		        Thread thread = new Thread(runnable);

		        System.out.println("Starting Thread...");
		        thread.start();
		    
	}

}
