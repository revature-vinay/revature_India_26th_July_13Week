package eg1;

public class Demo1 {
	//Demo1(){}

	public static void main(String[] args) {
		
		Calculator c=new Calculator("JAVA");
		
		System.out.println("add = "+c.add());
		
		c=new Calculator(10, 22);
		System.out.println("add = "+c.add());
		System.out.println("sub = "+c.sub());
		System.out.println("multiply = "+c.multiply());
	}

}
