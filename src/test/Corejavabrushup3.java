package test;

public class Corejavabrushup3 {

	public static void main(String[] args) {
		
		
		String s1= new String("Welcome");
		String s2= new String("Welcome");
		
		String s= "Mayank Meeta Himanshu";
		
		String[] Splittedstring=s.split("Meeta");
		System.out.println(Splittedstring[0]);
		System.out.println(Splittedstring[1]);
		System.out.println(Splittedstring[1].trim());
		
		//for(int i=0; i<s.length(); i++)
		//{
		//	System.out.println(s.charAt(i));
		//}

		for(int i=s.length()-1; i>0; i--)
		{
			
			System.out.println(s.charAt(i));
		}
	}

}
