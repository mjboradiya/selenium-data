package demo;
class classdemo
{
	public int run()
	{
		System.out.println("with return and without para ");
		return 0;
	}
	public String run(String string)
	{
		System.out.println(" with return with para");
		return "java";
	}
	public void run(String name,int i,double d, float f, boolean b) {
		System.out.println("without return type with parameter miltple para");
	}
	
	}
public class ConstDemo {
  public static void main(String[] args) {
	  classdemo ob = new classdemo();
	  int i  = ob.run();
	  System.out.println(i);
	  String name=ob.run("phyton");
	  System.out.println(name);
	  ob.run("yatharth",15 ,15.5 ,15.5f , true);
}
 
}
