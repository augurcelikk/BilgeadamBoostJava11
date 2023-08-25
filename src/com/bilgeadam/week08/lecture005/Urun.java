package com.bilgeadam.week08.lecture005;

public class Urun {

	/*
	 * urun sinifi -> isim, fiyat ve int son kullanma tarihgi, 2023,2024 gibi
	 * 
	 * UrunManager isimli bir sinif olusturalim, bu sinifta urunYarat isimli bir
	 * metot olsun bu metot uızerinden test sinifinda bir urun olusturalim
	 */

	private String isim;
	private int fiyat;
	private int skt;

	public Urun(String isim, int fiyat, int skt) {
		super();
		this.isim = isim;
		this.fiyat = fiyat;
		this.skt = skt;
	}

	public String getIsim() {
		return isim;
	}

	public void setIsim(String isim) {
		this.isim = isim;
	}

	public int getFiyat() {
		return fiyat;
	}

	public void setFiyat(int fiyat) {
		this.fiyat = fiyat;
	}

	public int getSkt() {
		return skt;
	}

	public void setSkt(int skt) {
		this.skt = skt;
	}

	@Override
	public String toString() {
		return "Urun [isim=" + isim + ", fiyat=" + fiyat + ", skt=" + skt + "]";
	}

}
