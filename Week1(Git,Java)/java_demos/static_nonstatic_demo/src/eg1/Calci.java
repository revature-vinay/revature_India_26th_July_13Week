package eg1;

public class Calci {

	public Calci() {
		
		System.out.println("Hello calci constructor");
		
	}
	
	public static void iAmStatic() {
		System.out.println("Hello I am a static method from Calci class");
	}

	public void iAmNonStatic() {
		System.out.println("Hello I am NON static method from Calci class");
	}
	
	static {
		System.out.println("Hello anonymous static from Calci");
	}
	
	{
		System.out.println("Hello anonymous non-static from Calci");
	}
}
