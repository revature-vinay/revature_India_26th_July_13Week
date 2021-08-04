package eg2;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class BusMain {

	public static void main(String[] args) {

		Set<Bus> busList = new HashSet<>();
		busList.add(new Bus(100, "Abc Travels", 1200.22, 2.3f));
		busList.add(new Bus(101, "Abc Travels", 1100.22, 2.4f));
		busList.add(new Bus(190, "Xyz Travels", 1100.22, 2.3f));
		busList.add(new Bus(200, "Jee Travels", 1000.22, 4.3f));
		busList.add(new Bus(104, "Java Travels", 900.22, 4.3f));
		busList.add(new Bus(111, "Xyz Travels", 1400.22, 4.3f));
		busList.add(new Bus(111, "Xyz Travels", 1400.22, 4.3f));
		busList.add(new Bus(200, "Jee Travels", 1000.22, 4.3f));
		busList.add(new Bus(101, "Abc Travels", 1100.22, 2.4f));
		busList.add(new Bus(100, "Abc Travels", 1200.22, 2.3f));
		busList.add(new Bus(100, "Abc Travels", 1200.22, 2.3f));
		busList.add(new Bus(155, "Abc Travels", 1000.22, 5.3f));
		
		printBusList(busList);
		
	
	}

	public static void printBusList(Set<Bus> busList) {
//		for (Bus b : busList) {
//			System.out.println(b);
//		}
		
		Iterator<Bus> i=busList.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
	}

}
