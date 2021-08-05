package eg1;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamDemo {
	
	public static void main(String[] args) {
		List<Integer> numbers = new ArrayList<>();
		numbers.add(8);
		numbers.add(7);
		numbers.add(2);
		numbers.add(4);
		numbers.add(5);
		
		System.out.println("Using stream limit()");
		numbers.stream().limit(3).forEach(e -> System.out.println(e));

		System.out.println("\nUsing stream limit() using method reference");
		numbers.stream().limit(3).forEach(System.out::println);
		
		System.out.println("\nCreating a stream of sqaures.");
		numbers.stream().map(e -> e * e).forEach(e -> System.out.println(e));
		
		System.out.println("\nConverting a stream to list.");
		List<Integer> squareNumbers = numbers.stream()
				.map(e -> e * e).collect(Collectors.toList());
		squareNumbers.forEach(System.out::println);
		
		System.out.println("\nFiltering the list.");
		numbers.stream().filter(e -> e > 5).forEach(System.out::println);
		
		System.out.println("\nSort using stream.");
		numbers.stream().sorted().forEach(System.out::println);
	}

}
