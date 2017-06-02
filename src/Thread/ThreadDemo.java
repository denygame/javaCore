package Thread;

public class ThreadDemo extends Thread {
	@Override
	public void run() {
		System.out.println("Thread: "+Thread.currentThread().getName());
	}
	
	
	public static void main(String args[]){
		ThreadDemo t = new ThreadDemo();
		t.start();
		
		ThreadDemo t1 = new ThreadDemo();
		t1.start();
	}
}
