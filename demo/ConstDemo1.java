package demo;
     class laptop 
     {
    	 int ram;
    	 String model;
    	 double price;
    	 laptop()
    	 { 
    		 System.out.println("default");
    	 }
    	 laptop(int ram,String model,double price){
    			this.ram = ram;
    			this.model=model;
    			this.price=price;
    			System.out.println("ram : "+ram+" model : "+model+" price :"+price);
    		}
    	 public void showData()
    	 {
    		 System.out.println("RAM= " +ram+  "model = " +model+  "price" +price  );
    	 }
     }
public class ConstDemo1 {
	public static void main(String[] args) {
		laptop l1=new laptop();
		
		l1.showData();
	}

}
