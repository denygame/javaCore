package testEvent;

public class PhimDienAnh implements IThamSo{
	private String ten;

	public String getTen() {
		return ten;
	}

	public void setTen(String ten) {
		this.ten = ten;
	}

	public String getDienVienChinh() {
		return dienVienChinh;
	}

	public void setDienVienChinh(String dienVienChinh) {
		this.dienVienChinh = dienVienChinh;
	}

	public double getGiaVe() {
		return giaVe;
	}

	public void setGiaVe(double giaVe) {
		this.giaVe = giaVe;
	}

	private String dienVienChinh;
	private double giaVe;
	
	private int giamGia;

	public int getGiamGia() {
		return giamGia;
	}

	public void setGiamGia(int giamGia) {
		this.giamGia = giamGia;
	}
}
