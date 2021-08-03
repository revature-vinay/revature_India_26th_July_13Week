package eg1;

import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Demo1 {

	public static void main(String[] args) {
		
		Set<String> hs=new HashSet<>();
		hs.add("hey");
		hs.add("hey");
		hs.add("hello");
		hs.add(null);
		hs.add(null);
		hs.add("hey");
		hs.add("java");
		hs.add("hibernate");
		hs.add("jee");
		hs.add("spring");
		hs.add("vinay");
		System.out.println("hs : "+hs);
		
		
		Set<String> lhs=new LinkedHashSet<>();
		lhs.add("hey");
		lhs.add("hey");
		lhs.add("hello");
		lhs.add(null);
		lhs.add(null);
		lhs.add("hey");
		lhs.add("java");
		lhs.add("hibernate");
		lhs.add("jee");
		lhs.add("spring");
		lhs.add("vinay");
		System.out.println("lhs : "+lhs);
		
	//	Set<String> ts=new TreeSet<>();  //default comparable order
		Set<String> ts=new TreeSet<>(Collections.reverseOrder()); //passing Comparator 
		ts.add("hey");
		ts.add("hey");
		ts.add("hello");
		//ts.add(null);
		//ts.add(null);
		ts.add("hey");
		ts.add("java");
		ts.add("hibernate");
		ts.add("jee");
		ts.add("spring");
		ts.add("vinay");
		System.out.println("ts : "+ts);
		
		System.out.println("ts.size() : "+ts.size());
		for(String s:ts) {
			System.out.println(s);
		}
		
		ts.remove("vinay");
		System.out.println("ts : "+ts);
		System.out.println("ts.contains(\"vinay\") : "+ts.contains("vinay"));
		System.out.println("ts.contains(\"java\") : "+ts.contains("java"));

	}

}
