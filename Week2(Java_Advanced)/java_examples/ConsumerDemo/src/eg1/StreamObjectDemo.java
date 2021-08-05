package eg1;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamObjectDemo {

	public static void main(String[] args) {
		List<Bus> busList = new ArrayList<>();
		busList.add(new Bus(100, "Abc Travels", 1200.22, 2.3f));
		busList.add(new Bus(101, "Abc Travels", 1100.22, 2.4f));
		busList.add(new Bus(190, "Xyz Travels", 1100.22, 2.3f));
		busList.add(new Bus(200, "Jee Travels", 1000.22, 4.3f));
		busList.add(new Bus(104, "Java Travels", 900.22, 4.3f));
		busList.add(new Bus(111, "Xyz Travels", 1400.22, 4.3f));
		
		List<Bus> busWithHighRating = new ArrayList<>();
		for (Bus bus : busList) {
			if (bus.getRating() > 4) {
				busWithHighRating.add(bus);
			}
		}
		
		for (Bus bus : busWithHighRating) {
			System.out.println(bus);
		}
		
		System.out.println("\n Using stream.");
		busList.stream()
			.filter(e -> e.getRating() > 4)
			.collect(Collectors.toList())
			.forEach(System.out::println);
		
		float total = busList.stream()
				.map(e -> e.getRating())
				.reduce(0.0f, (sum, element) -> sum + element);
		System.out.println("\nAverage Rating: " + total / busList.size());
		
		float totalAbcTravels = busList.stream()
				.filter(e -> e.getProviderName().equals("Abc Travels"))
				.map(e -> e.getRating())
				.reduce(0.0f, (sum, element) -> sum + element);
		float totalAbcTravelsCount = busList.stream()
				.filter(e -> e.getProviderName().equals("Abc Travels"))
				.count();
		System.out.println("\nAverage Rating for Abc Travels: " 
				+ totalAbcTravels / totalAbcTravelsCount);
		
		System.out.println("\nOriginal list");
		busList.forEach(System.out::println);
		
	}
	
	// Task 1 - Find the minimum price in 'Xyz Travels'
	// Task 2 - Calculate total and print bill.
	//          Item Name          Price    Qty.    Line Total
	//          Line Total = Price * Qty.
	//          Bill Total = Total of Line Total + 5% tax;
	//          Items needs to be sorted based on Item Name.
	// Task 3 - allMatch(), anyMatch(), distinct()
	// Task 4 - Convert the Stream to Map.
}
