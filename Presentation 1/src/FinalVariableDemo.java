
public class FinalVariableDemo {
	public static void main(String[] args) {
		Bike1 bike  = new Bike1();
		bike.run();
		
		
		
	}
}

class Bike1{
	final int speed = 90; //Final variable
	void run() {
		speed = 100;
	}
}






