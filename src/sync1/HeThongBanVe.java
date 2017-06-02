package sync1;

public class HeThongBanVe implements Runnable {

	private int soGheTrong = 2;

	public int getSoGheTrong() {
		return soGheTrong;
	}

	@Override
	public void run() {
		Khach k = (Khach) Thread.currentThread();
		boolean datDuoc = this.banVe(k.getSoGheDat(), k.getName());
		if (datDuoc) {
			System.out.println("Chuc mung " + k.getName() + ", " + k.getSoGheDat() + " da duoc dat");
		} else {
			System.out.println("Xin loi " + k.getName() + " khong du so ghe yeu cau");
		}
	}

	private boolean banVe(int soGheDat, String name) {
		synchronized (this) {
			System.out.println("Chao mung " + name + " so ghe trong la: " + this.getSoGheTrong());
			if (soGheDat > this.getSoGheTrong()) {
				return false;
			} else {
				this.soGheTrong = this.soGheTrong - soGheDat;
				return true;
			}
		}
	}

	public static void main(String args[]) {
		HeThongBanVe bus = new HeThongBanVe();
		Khach nam = new Khach(2, bus, "Nam");
		Khach binh = new Khach(2, bus, "Binh");
		nam.start();
		binh.start();
	}
}
