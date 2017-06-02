package sync1;

public class Khach extends Thread {
	private int soGheDat;
	public int getSoGheDat() {
		return soGheDat;
	}
	public Khach(int ghe, Runnable daiLy, String hoTen){
		super(daiLy,hoTen);
		this.soGheDat = ghe;
	}

}
