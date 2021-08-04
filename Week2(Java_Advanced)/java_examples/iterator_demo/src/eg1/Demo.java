package eg1;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class Demo {

	public static void main(String[] args) {
		Map<Integer, String> ht=new HashMap<>();
		ht.put(100, "java");
		ht.put(100, "updated");
		ht.put(2232, "java");
		ht.put(2032, "java");
		ht.put(1232, "java");
		ht.put(232, "jee");
		ht.put(320, "jse");
		ht.put(312, "jse");
		ht.put(342, "jse");
		ht.put(32225, "jse");
		ht.put(322220, "jse");
		ht.put(null, "jse");
		ht.put(39992, null);
		ht.put(432, null);
		ht.put(8888, null);
		//Remove all the K,V pairs where key is null or value is null or key is divisible by 10
	
		System.out.println("Contents of Map before deletion");
		System.out.println(ht);
		
//		for(Entry<Integer, String> e:ht.entrySet()) {
//			if(e.getKey()==null || e.getValue()==null || e.getKey()%10==0) {
//				ht.remove(e.getKey());
//			}
//		}
		Iterator<Entry<Integer, String> > i=ht.entrySet().iterator();
		while(i.hasNext()) {
			Entry<Integer, String> e =i.next(); //read and post increment use it only once in the loop
			if(e.getKey()==null || e.getValue()==null || e.getKey()%10==0) {
				i.remove();
			}
		}
		
		System.out.println("Contents of Map after deletion");
		System.out.println(ht);
	}

}
/* Enumerator -> is same as  for each loop -> which reads from top to bottom
 * Iterator ->Iterator extends Enumerator and it can read as well as remove same time from top to bottom
 * ListIterator -> ListIterator is a child of Iterator but this is only specific to Collection List where it can do add, read, remove and
 * 					also it is bidirectional(top to bottom and bottom to top) 
 * 
 */
 