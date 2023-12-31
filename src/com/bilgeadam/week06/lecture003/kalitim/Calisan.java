package com.bilgeadam.week06.lecture003.kalitim;

public class Calisan {

	private String isim;
	private String soyisim;
	private String unvan;
	private double maas;

	public Calisan(String isim, String soyisim) {

		this.isim = isim;
		this.soyisim = soyisim;
	}

	public Calisan(String isim, String soyisim, double maas) {
		this.isim = isim;
		this.soyisim = soyisim;
		this.maas = maas;

	}

	public String getIsim() {
		return isim;
	}

	public void setIsim(String isim) {
		this.isim = isim;
	}

	public String getSoyisim() {
		return soyisim;
	}

	public void setSoyisim(String soyisim) {
		this.soyisim = soyisim;
	}

	public String getUnvan() {
		return unvan;
	}

	public void setUnvan(String unvan) {
		this.unvan = unvan;
	}

	public void setUnvan(double maas) {
		this.unvan = unvan;
	}

	public double getMaas() {
		return maas;
	}

	public void setMaas(double maas) {
		this.maas = maas;
	}

	public double zamYap(double zamOrani) {
		this.maas += (this.maas * zamOrani / 100);

		return this.maas;
	}

}
