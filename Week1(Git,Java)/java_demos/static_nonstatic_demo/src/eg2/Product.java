package eg2;

public class Product {

	private int pid;
	private String name;
	private double price; // instance level
	private static float discount = 2.5f; // class level
	private static final float ADDITIONAL_DISCOUNT=2.3f;  //non modifiable due to final. and static final are written in uppercase in JAVA

	public static void main(String[] args) {

		Product p1 = new Product();
		p1.pid = 100;
		p1.name = "TV";
		p1.price=999.99;
		System.out.println("Printing p1");
		p1.printProduct();
		
		discount=7.9f;
		
		Product p2 = new Product();
		p2.pid = 101;
//		p2.name = "TV";
//		p2.price=999.99;
		System.out.println("\nPrinting p2");
		p2.printProduct();
		
		System.out.println("\nPrinting p1 again");
		p1.printProduct();
	}

	public void printProduct() {
		System.out.println("Product id : " + pid);
		System.out.println("Product Name : " + name);
		System.out.println("Product Price : " + price);
		System.out.println("Product Discount : " + discount);
	}
}
