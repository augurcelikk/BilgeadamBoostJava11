package com.bilgeadam.week07.lecture001.abstractornek.entity;

public class Motosiklet extends Tasit {

	@Override
	public void akrobatikHareketYap() {
		System.out.println("Motosiklet ön kaldırıyor ");
	}

	public Motosiklet() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Motosiklet(String marka, String model, int hiz, String vites) {
		super(marka, model, hiz, vites);
		// TODO Auto-generated constructor stub
	}

}
