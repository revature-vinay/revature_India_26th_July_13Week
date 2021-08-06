package eg1;

public class Main {

	public static void main(String[] args) {
		//Singleton singleton = new Singleton();
		Singleton singleton = Singleton.getInstance();
		Singleton singleton1 = Singleton.getInstance();
	}

}
