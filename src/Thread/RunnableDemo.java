package Thread;

public class RunnableDemo implements Runnable {

	@Override
	public void run() {
		System.out.println("Runnable run");
	}
	public static void main(String args[]){
		new Thread(new RunnableDemo()).start();
	}
}
