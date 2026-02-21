package test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.testng.Assert;
import org.testng.annotations.Test;

public class test1 {

	//Count the number of names starting with alphabet A in the List
	//@Test
	public void regular()
	{
	ArrayList<String> names= new ArrayList();
	names.add("Amit");
	names.add("Dinesh");
	names.add("Abhijeet");
	names.add("Aniket");
	names.add("Anu");
	
	int count=0;
	
	for(int i=0; i<names.size(); i++)
	{
		String actual= names.get(i);
		if(actual.startsWith("A"))
		{
			
			count++;
		}
		
	}
	System.out.println(count);
}
	//@Test
	public void streamFilter()
	{
		ArrayList<String> names= new ArrayList();
		names.add("Amit");
		names.add("Dinesh");
		names.add("Abhijeet");
		names.add("Aniket");
		names.add("Anu");
		
		Long c=names.stream().filter(p->p.startsWith("A")).count();
		System.out.println(c);
		
		Long d=Stream.of("Amit","Dinesh","Abhijeet","vij").filter(p->
		{
			return p.startsWith("A");
			
		}).count();
		System.out.println(d);
		
		//Print all names of ArrayList
		//names.stream().filter(s->s.length()>4).forEach(s->System.out.println(s));
		names.stream().filter(s->s.length()>4).limit(2).forEach(s->System.out.println(s));
		
		
		
	}
	
	@Test
	public void streamMap()
	{
		ArrayList<String> names= new ArrayList();
		names.add("Don");
		names.add("Neha");
		names.add("Shiv");
		
		//Print names which have last letter "a" and convert tp uppercase
		
		//Stream.of("Meeta","Mayank","seema").filter(s->s.endsWith("a")).map(s->s.toUpperCase()).forEach(s->System.out.println(s));
		
		
		//Print names which have first letter as A with upper case and sorted.
		List<String>names1=Arrays.asList("Amit","Dinesh","Abhijeet","vij");
		names.stream().filter(m->m.startsWith("A")).sorted().map(m->m.toUpperCase()).forEach(m->System.out.println(m));
		
		//merging 2 different list
		Stream<String> newStream=Stream.concat(names.stream(), names1.stream());
		
		//newStream.sorted().forEach(s->System.out.println(s));
		//Print any 1 string in list
		boolean flag=newStream.anyMatch(s->s.equalsIgnoreCase("Amit"));
		Assert.assertTrue(flag);
	}
	
	
	@Test
	public void streamcollect() {
		
		
		List<String> names3=Stream.of("Amit","Dinesh","Abhijeet","vij").filter(s->s.endsWith("t")).sorted()
				.map(s->s.toUpperCase()).collect(Collectors.toList());
		System.out.println(names3.get(1));
		
		List<Integer>values=Arrays.asList(1,2,2,1,3,7,5,5,6,2,8);
		//Print unique numbers and sort the Array
	//	values.stream().distinct().forEach(s->System.out.println(s));
		List li=values.stream().distinct().sorted().collect(Collectors.toList());
		System.out.println(li.get(5));
	}
}