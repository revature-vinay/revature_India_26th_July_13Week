package eg_lambda;

@FunctionalInterface
public interface MyFunctional {

	void hello();
	
	default void iAmDefault() {
		System.out.println("Hello default methods in Java8 interfaces, you should used default keyword");
	}
	
	public static void iamStatic() {
		System.out.println("Hello from static method in interface from Java8");
	}
}
