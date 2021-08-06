package synch_eg;

public class SynchMain {

	public static void main(String[] args) {
		
		new Page("page1 from user1", "page2 from user1");
		new Page("page1 from user2", "page2 from user2");
		new Page("page1 from user3", "page2 from user3");
		new Page("page1 from user4", "page2 from user4");
		new Page("page1 from user5", "page2 from user5");
		new Page("page1 from user6", "page2 from user6");

	}

}

//Task - 1) Explore on methods like wait,notify,notifyAll
//       2) Explore on why wait,notify and notifyAll are in Object class not Thread class
//       3) Explore and implement on Producer - Consumer Problem with Threads.