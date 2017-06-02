package tkdh;

public abstract class Hinh {
	protected String ten;

	public String getTen() {
		return ten;
	}

	public void setTen(String ten) {
		this.ten = ten;
	}
	
	abstract public double chuVi();
	
	public abstract double dienTich();
}
