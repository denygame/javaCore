package testEvent;

public class Khach implements IListen {

	@Override
	public void phanUngOnPhimMoi(IPhat sender, IThamSo e) {
		if (sender instanceof RapChieuPhim && e instanceof PhimDienAnh) {
			if (((RapChieuPhim) sender).getDiaChi().contains("hcm") && ((PhimDienAnh) e).getGiaVe() < 200) {
				System.out.println("Di xem phim: " + ((PhimDienAnh) e).getTen());
			} else {
				System.out.println("Di hoc");
			}
		}
	}


	@Override
	public void phanUngOnGiamGia(IPhat sender, double phanTram) {
		if (sender instanceof RapChieuPhim) {
			if (((RapChieuPhim) sender).getDiaChi().contains("hcm") && phanTram < 100 && phanTram != 0) {
				System.out.println("Di xem phim, rap giam gia");
			} else {
				System.out.println("Di hoc, rap k giam");
			}
		}
	}
}
