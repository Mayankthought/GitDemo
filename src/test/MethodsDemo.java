package test;

public class MethodsDemo {

	public static void main(String[] args) {
		
		
		MethodsDemo d=new MethodsDemo();
		String name= d.getdata();
		System.out.println(name);
		MethodsDemo1 D1 = new MethodsDemo1();
		 D1.getuserdata();
		 getdata2();
        
	}

	public String getdata()
	{
		System.out.println("Mayank");
		return "Hello World";
	}
	
	public String getdata1()
	{
		System.out.println("Mayank");
		return "Hello World1";
	}
	public static String getdata2()
	{
		System.out.println("Mayank");
		return "Hello World2";
	}
}
