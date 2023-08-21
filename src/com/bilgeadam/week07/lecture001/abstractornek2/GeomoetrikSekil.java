package com.bilgeadam.week07.lecture001.abstractornek2;

public abstract class GeomoetrikSekil {

	private String renk;

	private final double PI = 3.14;

	public void ciz() {
		System.out.println("Cizilen sekil : " + renk + " renkli " + getClass().getSimpleName());

	}

	public GeomoetrikSekil(String renk) {
		super();
		this.renk = renk;
	}

	public GeomoetrikSekil() {
		super();
	}

	public abstract double alanHesapla();

	public abstract double cevreHesapla();

	public String getRenk() {
		return renk;
	}

	public void setRenk(String renk) {
		this.renk = renk;
	}

	public double getPI() {
		return PI;
	}

}
