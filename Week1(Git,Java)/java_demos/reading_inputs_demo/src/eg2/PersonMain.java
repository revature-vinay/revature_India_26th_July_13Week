package eg2;

import java.util.Scanner;

public class PersonMain {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Person Id");
		int id = Integer.parseInt(sc.nextLine());

		System.out.println("Enter Person Name");
		String name = sc.nextLine();

		System.out.println("Enter Person Age");
		int age = Integer.parseInt(sc.nextLine());

		Person p1 = new Person(id, name, age);
		System.out.println("Printing p1");
		personPrinter(p1);

		System.out.println("Enter Person Id");
		Person p2 = new Person();
		p2.setId(Integer.parseInt(sc.nextLine()));

		System.out.println("Enter Person Name");
		p2.setName(sc.nextLine());

		System.out.println("Enter Person Age");
		p2.setAge(Integer.parseInt(sc.nextLine()));
		System.out.println("\nPrinting p2");
		personPrinter(p2);

	}

	public static void personPrinter(Person person) {
		System.out.println("Person Id : " + person.getId());
		System.out.println("Person Name : " + person.getName());
		System.out.println("Person Age : " + person.getAge());
	}

}
