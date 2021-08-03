package eg2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BusMain {

	public static void main(String[] args) {

		List<Bus> busList = new ArrayList<>();
		busList.add(new Bus(100, "Abc Travels", 1200.22, 2.3f));
		busList.add(new Bus(101, "Abc Travels", 1100.22, 2.4f));
		busList.add(new Bus(190, "Xyz Travels", 1100.22, 2.3f));
		busList.add(new Bus(200, "Jee Travels", 1000.22, 4.3f));
		busList.add(new Bus(104, "Java Travels", 900.22, 4.3f));
		busList.add(new Bus(111, "Xyz Travels", 1400.22, 4.3f));

		printBusList(busList);

		Collections.sort(busList);

		System.out.println("\nPrinting Buses sorted based on id");
		printBusList(busList);

		Collections.sort(busList, new BusNameComparator());
		System.out.println("\nPrinting Buses sorted based on provider name(Z-A)");
		printBusList(busList);

		Collections.sort(busList, (Bus b1, Bus b2) -> {
			Double d1 = b1.getCost();
			Double d2 = b2.getCost();
			return d1.compareTo(d2);
		});
		System.out.println("\nPrinting Buses sorted based on cost");
		printBusList(busList);
		
		Collections.sort(busList, (Bus b1, Bus b2) -> {
			Float f1=b1.getRating();
			Float f2=b2.getRating();
			int x=f2.compareTo(f1);
			if(x==0) {
				Double d1 = b1.getCost();
				Double d2 = b2.getCost();
				x=d1.compareTo(d2);
			}
			return x;
		});
		
		System.out.println("\nPrinting Buses sorted based on highest rating and if 2 or more have same rating then by lowest cost");
		printBusList(busList);
	}

	public static void printBusList(List<Bus> busList) {
		for (Bus b : busList) {
			System.out.println(b);
		}
	}

}
