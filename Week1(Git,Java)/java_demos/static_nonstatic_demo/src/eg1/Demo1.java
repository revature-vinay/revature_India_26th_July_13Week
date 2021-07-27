package eg1;

public class Demo1 {

	public Demo1() {
		System.out.println("Hello I am Constructor I will be executed for every object creation");
	}

	public static void main(String[] args) {

		System.out.println("Hello from main");
		iAmStatic();
		Demo1 d = new Demo1();
		d.iAmNonStatic();
		
		Demo1 d1=new Demo1();
		
		Calci.iAmStatic();
		
		Calci c =new Calci();
		c.iAmNonStatic();
	}

	public static void iAmStatic() {
		System.out.println("Hello I am a static method");
	}

	public void iAmNonStatic() {
		System.out.println("Hello I am NON static method");
	}

	static {
		System.out.println("I am anonymous static block I will be executed only once and even before main");
	}

	{
		System.out.println("I am anonymous block I will be executed everytime you create a object,even before the constructor");
	}

}
