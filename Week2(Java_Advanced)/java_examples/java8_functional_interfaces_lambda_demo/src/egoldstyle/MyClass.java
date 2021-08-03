package egoldstyle;

public class MyClass implements MyInterface{

	@Override
	public void hello() {
		// TODO Auto-generated method stub
		System.out.println("Hello from hello() method");
	}

	public static void main(String[] args) {
		
		MyInterface m1=new MyClass();
		m1.hello();
		
		MyInterface m2=new MyInterface() {
			
			@Override
			public void hello() {
				// TODO Auto-generated method stub
				System.out.println("hello from hello() method within anonymous class");
			}
		};
		m2.hello();
		
		MyInterface m3=new MyInterface() {
			
			@Override
			public void hello() {
				// TODO Auto-generated method stub
				System.out.println("hello again from hello() method in anonymous class");
			}
		};
		m3.hello();
	}
	
}
