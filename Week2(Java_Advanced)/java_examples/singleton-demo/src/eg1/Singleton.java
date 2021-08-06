package eg1;

public class Singleton {
	
	private static Singleton singleton = null;
	
	private Singleton() {
	}
	
	public static Singleton getInstance() {
		if (singleton == null) {
			singleton = new Singleton();
		}
		return singleton;
	}

}
