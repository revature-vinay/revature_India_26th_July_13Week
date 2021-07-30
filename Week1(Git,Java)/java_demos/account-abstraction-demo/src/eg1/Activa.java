package eg1;

public class Activa implements GearlessScooter, AutoStartable {
	
	private int speed = 0;
	private boolean started = false;

	public void accelerate() {
		speed += 5;
	}
	
	public void applyBrake() {
		speed -= 5;
	}
	
	public void pressStartButton() {
		speed = 0;
		started = true;
	}
	
	public void displaySpeed() {
		System.out.println("Current speed is: " + speed);
	}
	
	public static void main(String args[]) {
		Activa activa = new Activa();
		activa.accelerate();
		activa.accelerate();
		activa.accelerate();
		activa.applyBrake();
		activa.applyBrake();
		activa.displaySpeed();
	}
	
}
