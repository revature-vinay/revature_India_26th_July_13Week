package extending_thread_demo;

public class MyThread extends Thread {

	@Override
	public void run() {
		//System.out.println("Hello from Thread : "+Thread.currentThread()+" id is "+Thread.currentThread().getId());
		
		for (int i = 0; i < 5; i++) {
			System.out.println("Printing from thread : "+Thread.currentThread().getName()+" value of i : "+i);
			
			try {
				Thread.sleep(1500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
