package eg1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Demo1 {

	public static void main(String[] args) {

		List li = new ArrayList();
		li.add("hey");
		li.add(13444);
		li.add(22.11d);
		li.add(new Object());
		li.add('c');
		li.add(1111111111111111111L);
		li.add(true);

		System.out.println("li : " + li);

		List<Integer> li2 = new ArrayList<>();
		li2.add(1222);
		li2.add(100);
		li2.add(1222);
		li2.add(1222);
		li2.add(null);
		li2.add(null);
		li2.add(122);
		li2.add(100);
		li2.add(1229);
		li2.add(2222);
		li2.add(100);
		li2.add(1222); // insert at last
		System.out.println("li2 : " + li2);
		li2.add(1, 9000);// insert at specific index
		System.out.println("li2 : " + li2);
		li2.set(1, 9999);// update
		System.out.println("li2 : " + li2);
		System.out.println("li2.size() : " + li2.size());
		System.out.println("li2.get(5) : " + li2.get(5));

		System.out.println("Iterating using for loop");
		for (int i = 0; i < li2.size(); i++) {
			System.out.println("li2.get(" + i + ") : " + li2.get(i));
		}

		System.out.println("Iterating using for each loop");
		for (Integer i : li2) {
			System.out.println(i);
		}

		li2.remove(1);// index
		System.out.println("li2 : " + li2);
		Integer i = 100;
		li2.remove(i); // removes first occurance of object 100
		System.out.println("li2 : " + li2);

		while (li2.remove(i)) {
		} // removes all occurance of 100

		System.out.println("li2 : " + li2);

		System.out.println("li2.contains(100) : " + li2.contains(100));
		System.out.println("li2.contains(1222) : " + li2.contains(1222));

		System.out.println("li2.indexOf(1222) : " + li2.indexOf(1222));
		System.out.println("li2.lastIndexOf(1222) : " + li2.lastIndexOf(1222));

		Collections.reverse(li2);

		System.out.println("li2 : " + li2);

		Collections.replaceAll(li2, null, -1);
		System.out.println("li2 : " + li2);
		Collections.sort(li2); //ascending
		System.out.println("li2 : " + li2);
		System.out.println("Collections.binarySearch(li2, 100) : "+Collections.binarySearch(li2, 100));
		System.out.println("Collections.binarySearch(li2, 1222) : "+Collections.binarySearch(li2, 1222));
		Collections.shuffle(li2);
		System.out.println("li2 : " + li2);
		
		Collections.sort(li2, Collections.reverseOrder()); //descending
		System.out.println("li2 : " + li2);
		System.out.println("Collections.frequency(li2, 1222) : "+Collections.frequency(li2, 1222));
		
		
		List<Integer> li3=new LinkedList<>(li2); //copies content of li2 in li3
		System.out.println("li3 : " + li3);
		li3.addAll(li2);//union all
		System.out.println("li3 : " + li3);
		
		li2.add(7777);
		li2.add(8999);
		li2.add(898889);
		
		System.out.println("li2 : " + li2);
		
		//li2.retainAll(li3);//(intersection)common between li2 and li3 is picked up and results are stored in li2
		li2.removeAll(li3);// minus (A-B)contents of li2 which are not in li3
		System.out.println("li2 : " + li2);
		
		
		
	}

}
