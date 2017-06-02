package event;

public class SinhVien implements INghe {

	@Override
	public void phanUngOnPhimMoi(IGenerator sender, IThamSoSK e) {
		if (sender instanceof RapPhim && e instanceof Phim)
			if (((RapPhim) sender).getDiaChi().contains("HongKong")
					&& ((Phim)e).getGiaVe() < 100) {
				System.out.println("Di xem phim moi");
			} else {
				System.out.println("Di hoc");
			}
	}

}
