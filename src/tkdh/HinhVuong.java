package tkdh;

public class HinhVuong extends Hinh {

	private double canh;

	public HinhVuong(double canh) {
		this.canh = canh;
	}

	@Override
	public double chuVi() {
		return canh * 2;
	}

	@Override
	public double dienTich() {
		return canh * canh;
	}

}
