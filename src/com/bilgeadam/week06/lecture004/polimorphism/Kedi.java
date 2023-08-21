package com.bilgeadam.week06.lecture004.polimorphism;

public class Kedi extends Hayvan implements IMiyavlayabilir {

	@Override
	public void sesCikar() {
		System.out.println("Miyavvvv");

	}

	@Override
	public void miyavla() {
		System.out.println("Miyavvv");
	}

	@Override
	public void temizlen() {
		System.out.println("Kedi temizlendi.");

	}

}
