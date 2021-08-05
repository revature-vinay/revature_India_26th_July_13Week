package eg1;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerDemo {
	
	public static void main(String[] args) {
		List<Integer> numbers = new ArrayList<>();
		numbers.add(8);
		numbers.add(7);
		numbers.add(2);
		numbers.add(4);
		numbers.add(5);
		
		for (Integer number : numbers) {
			System.out.println(number);
		}
		
		System.out.println("\nPrinting using forEach()");
		numbers.forEach(e -> System.out.println(e));

		System.out.println("\nPrinting using Method Reference");
		numbers.forEach(System.out::println);
	}

}
