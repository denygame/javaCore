package tkdh;

public class ChuNhat extends Hinh {

	private double dai, rong;

	public ChuNhat(double dai, double rong, String ten) {
		this.ten = ten;
		this.dai = dai;
		this.rong = rong;
	}

	@Override
	public double chuVi() {
		return (this.dai + this.rong) * 2;
	}

	@Override
	public double dienTich() {
		return (this.dai * this.rong);
	}

	public static void main(String args[]){
		ChuNhat a = new ChuNhat(5,3,"chu nhat a");
		System.out.println(a.chuVi());
		System.out.println(a.ten);
	}
}
