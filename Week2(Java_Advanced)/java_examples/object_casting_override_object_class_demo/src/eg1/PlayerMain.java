package eg1;

public class PlayerMain {

	public static void main(String[] args) {
		
		Player p1=new Player(100, "Sachin");
		
		System.out.println("p1-> "+p1);
		//System.out.println(p1.toString());
		
		
		Player p2=new Player(100, "Sachin222");
		
		System.out.println("p2-> "+p2);
		
		if(p1.equals(p2)) {
			System.out.println("p1 is same as p2");
		}else {
			System.out.println("p1 and p2 are different");
		}

	}

}
