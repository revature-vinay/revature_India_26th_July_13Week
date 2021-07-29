package eg1;

public class PlayerMain {

	public static void main(String[] args) {
		
		Player p=new Player();
	//	p.firstName="Heyy";
		p.setFirstName("Saurav");
		p.setLastName("Ganguly");
		
		System.out.println(p.getFullName());
		
	//	System.out.println(p.firstName+" "+p.lastName);
		
		Player p1=new Player(100, "Sachin", "Tendulkar");
		System.out.println(p1.getFullName());

	}

}
