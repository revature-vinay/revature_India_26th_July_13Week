package eg1;

public class Calculator {

	//Calculator(){}
	
	private int x;
	private int y;
	
	public Calculator(String name) {
		System.out.println("Hello Calculator(String) name is "+name);
	}
	
	public Calculator(int x,int y) {
		this.x=x;  //Variable shadowing
		this.y=y;
		
	}
	
	public int add() {
		return x+y;
	}
	
	public int sub() {
		return x-y;
	}
	
	public int multiply() {
		return x*y;
	}
}
