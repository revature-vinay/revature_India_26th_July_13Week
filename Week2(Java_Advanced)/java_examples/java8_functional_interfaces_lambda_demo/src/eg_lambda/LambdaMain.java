package eg_lambda;

public class LambdaMain {

	public static void main(String[] args) {
		
		MyFunctional m1=()->System.out.println("Hello lambda");
		m1.hello();
		
		MyFunctional m2=()->{
			System.out.println("Hello lambda Again");
			System.out.println("Hello lambda again and again");
		};
		
		m2.hello();
		m2.iAmDefault();
		MyFunctional.iamStatic();
		
		
		Addition a1=(x,y)->{
			return x+y;
		};
		
		System.out.println("res : "+a1.sum(1000, 222));

	}

}
