package eg1;

import java.util.Scanner;

public class Demo1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Name");
		// String name=sc.next(); //reads only first word before the space
		String name = sc.nextLine(); // reads full line
		
		System.out.println("Enter Age");
		//int age=sc.nextInt();
		int age=Integer.parseInt(sc.nextLine()); //recommended
		System.out.println("Enter salary ");
		//double salary=sc.nextDouble();
		double salary = Double.parseDouble(sc.nextLine());
		System.out.println("Enter contact number");
		long contact=sc.nextLong();
		
		
		System.out.println("Hello " + name);
		System.out.println("Age : "+age);
		System.out.println("Salary : "+salary);
		System.out.println("Contact : "+contact);
	}

}
