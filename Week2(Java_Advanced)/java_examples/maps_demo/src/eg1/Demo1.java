package eg1;

import java.util.Collections;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class Demo1 {

	public static void main(String[] args) {
		
		Map<Integer, String> hm=new HashMap<>();
		hm.put(100, "java"); //put works as both insert and update, if there is a key in the map it will do update else it will do insert
		hm.put(100, "updated");
		hm.put(2232, "java");
		hm.put(2032, "java");
		hm.put(1232, "java");
		hm.put(232, "jee");
		hm.put(32, "jse");
		hm.put(null, null);
		hm.put(7778, null);
		hm.put(2202, null);
		hm.put(22, "spring");
		System.out.println("hm : "+hm);
		
		Map<Integer, String> lhm=new LinkedHashMap<>();
		lhm.put(100, "java"); 
		lhm.put(100, "updated");
		lhm.put(2232, "java");
		lhm.put(2032, "java");
		lhm.put(1232, "java");
		lhm.put(232, "jee");
		lhm.put(32, "jse");
		lhm.put(null, null);
		lhm.put(7778, null);
		lhm.put(2202, null);
		lhm.put(22, "spring");
		System.out.println("lhm : "+lhm);
		
		//Map<Integer, String> tm=new TreeMap<>();//ascending
		Map<Integer, String> tm=new TreeMap<>(Collections.reverseOrder());
		tm.put(100, "java");
		tm.put(100, "updated");
		tm.put(2232, "java");
		tm.put(2032, "java");
		tm.put(1232, "java");
		tm.put(232, "jee");
		tm.put(32, "jse");
		//tm.put(null, null);
		tm.put(7778, null);
		tm.put(2202, null);
		tm.put(22, "spring");
		System.out.println("tm : "+tm);
		
		Map<Integer, String> ht=new Hashtable<>();
		ht.put(100, "java");
		ht.put(100, "updated");
		ht.put(2232, "java");
		ht.put(2032, "java");
		ht.put(1232, "java");
		ht.put(232, "jee");
		ht.put(32, "jse");
	//	ht.put(null, null);
	//	ht.put(7778, null);
		//ht.put(2202, null);
		ht.put(22, "spring");
		System.out.println("ht : "+ht);
		
		System.out.println("ht.size() : "+ht.size()); //will return number of K,V Pairs
		
		System.out.println("ht.get(100) : "+ht.get(100));
		System.out.println("ht.containsKey(1222) : "+ht.containsKey(1222));
		System.out.println("ht.containsKey(32) : "+ht.containsKey(32));
		System.out.println("ht.containsValue(\"java\") : "+ht.containsValue("java"));
		
		ht.remove(32);
		System.out.println("ht : "+ht);
		
		System.out.println("keys : "+ht.keySet());
		System.out.println("values : "+ht.values());
		
		System.out.println("\nIterating using keySet()");
		Set<Integer> set=ht.keySet();
		for(Integer i:set) {
			System.out.println("key is "+i+" value is : "+ht.get(i));
		}
		
		System.out.println("\nIterating using entrySet()(preffered)");
		for(Entry<Integer, String> e:ht.entrySet()) {
			System.out.println("key -> "+e.getKey()+" Value -> "+e.getValue());
		}
		

	}

}
