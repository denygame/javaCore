package event;

import java.util.*;

public class RapPhim implements IGenerator {
	
	private List<INghe> ds = new ArrayList<INghe>();

	@Override
	public void them(INghe nghe) {
		if(!this.ds.contains(nghe)){
			this.ds.add(nghe);
		}
	}

	@Override
	public void xoa(INghe nghe) {
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

	public double getGiamGia() {
		return giamGia;
	}

	public void setGiamGia(double giamGia) {
		this.giamGia = giamGia;
	}

	private Phim phimMoi;

	public void setPhimMoi(Phim phimMoi) {
		this.phimMoi = phimMoi;
	}

	private double giamGia;

	
	public RapPhim(String ten, String dc){
		this.ten = ten;
		this.diaChi = dc;
	}
	
	
	
	
	// phát
	public void onCoPhimMoi(){
		for(int i=0;i<this.ds.size();i++){
			this.ds.get(i).phanUngOnPhimMoi(this,this.phimMoi);
		}
	}
	
	
	
	
	
	
	
	public static void main(String args[]){
		Phim p = new Phim();
		p.setTen("Sieu Nhan Sip Trang");
		p.setDienVienChinh("Ten Nhat Ban");
		
		p.setGiaVe(100);
		
		RapPhim rap = new RapPhim("Galaxy","HongKong");
		SinhVien s1 = new SinhVien();	rap.them(s1);
		SinhVien s2 = new SinhVien();	rap.them(s2);
		SinhVien s3 = new SinhVien();	rap.them(s3);
		
		rap.setPhimMoi(p);
		rap.onCoPhimMoi();

	}
}
