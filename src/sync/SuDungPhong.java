package sync;

public class SuDungPhong extends Thread {
	private static Phong phong;
	static {
		phong = new Phong();
		phong.setTrong(true);
	}

	@Override
	public void run() {
		synchronized (phong) {
			while (!phong.isTrong()) {
				System.out.println(Thread.currentThread().getName() + "cho phong!");

				try {
					phong.wait();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
			System.out.println(Thread.currentThread().getName() + " su dung phong trong 1s");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			phong.setTrong(true);
			phong.notifyAll();

		}
	}

	public static void main(String args[]) {
		for (int i = 1; i <= 10; i++) {
			SuDungPhong lop = new SuDungPhong();
			lop.setName("Lop " + i);
			lop.start();
		}
	}

}
