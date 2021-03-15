package ibm.com.thread;

public class Application {
	public static void main(String[] args) {
		//Method 1 to make a thread
		//implementing Thread class 
		Thread t1 = new Worker();
		t1.start();
		//t1.run();
		//Method 2 to make a thread
		//extending the Runnable class
//		Thread t2 = new Thread(new AnotherWorker());
//		t2.start();
		System.out.println("in main thread...");
		
	}

}
