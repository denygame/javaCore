package testEvent;

import java.util.*;

public class RapChieuPhim implements IPhat {

	private List<IListen> ds = new ArrayList<IListen>();
	
	@Override
	public void them(IListen nghe) {
		if(!this.ds.contains(nghe)){
			this.ds.add(nghe);
		}
	}

	@Override
	public void xoa(IListen nghe) {
		if(this.ds.contains(nghe)){
			this.ds.remove(nghe);
		}
	}
	
	private String ten, diaChi;

	public String getTen() {
		return ten;
	}

	public void setTen(String ten) {
		this.ten = ten;
	}

	public String getDiaChi() {
		return diaChi;
	}

	public void setDiaChi(String diaChi) {
		this.diaChi = diaChi;
	}

	public PhimDienAnh getPhimMoi() {
		return phimMoi;
	}

	public void setPhimMoi(PhimDienAnh phimMoi) {
		this.phimMoi = phimMoi;
	}

	public int getGiamGia() {
		return giamGia;
	}

	public void setGiamGia(int giamGia) {
		this.giamGia = giamGia;
	}

	private PhimDienAnh phimMoi;
	private int giamGia;
	
	public RapChieuPhim(String ten, String diaChi){
		this.ten = ten;
		this.diaChi = diaChi;
	}
	
	//phát
	public void onCoPhimMoi(){
		for(int i = 0; i<this.ds.size();i++){
			this.ds.get(i).phanUngOnPhimMoi(this, this.phimMoi);
		}
	}
	
	//phát
		public void onGiamGia(){
			for(int i = 0; i<this.ds.size();i++){
				this.ds.get(i).phanUngOnGiamGia(this, this.getGiamGia());
			}
		}
	
	
	
	
	
	
	
	public static void main(String args[]){
		PhimDienAnh phim = new PhimDienAnh();
		phim.setTen("MA CA TUNG");
		phim.setDienVienChinh("Lam Chan Anh");
		phim.setGiamGia(50);
		
		RapChieuPhim rap = new RapChieuPhim("CGV", "hcm");
		Khach k1 = new Khach();
		rap.them(k1);
		Khach k2 = new Khach();
		rap.them(k2);
		Khach k3 = new Khach();
		rap.them(k3);
		
		/*rap.phimMoi = phim;
		rap.onCoPhimMoi();*/
		
		rap.setGiamGia(30);
		
		System.out.println(rap.getGiamGia());
		
		rap.onGiamGia();
	}
}
