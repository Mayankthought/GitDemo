package test;

import java.util.ArrayList;

public class Corejavabrushup2 {

	public static void main(String[] args) {
		
		
		int[] Arr= {1,2,3,4,5,6,7};
		
		for(int i=0; i<Arr.length; i++ )
		{
			if(Arr[i] %2==0)
			{
				
			System.out.println(Arr[0]);
			
			}
			else {
				
				System.out.println(Arr[i]+ "Num is not divisible of 2");
			}
			
		}

	ArrayList<String> a= new ArrayList<String> ();
	
	a.add("Mayank");
	a.add("Meeta");
	a.add("Himanshu");
	a.add("Test");
	
	System.out.println(a.get(2));
	
	
	for(int i=0; i<a.size(); i++)
	{
		System.out.println(a.get(i));
	}
		
	System.out.println("************");
	
	
	for(String val:a)
	{
		System.out.println(val);
		
	}
	
	System.out.println(a.contains("Himanshu"));
	
	
	}
	

}
