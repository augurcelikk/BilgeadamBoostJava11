package com.bilgeadam.week06.lecture003.interfaceornek;

public class Ucak extends Tasit implements IUcabilir {

	@Override
	public void uc() {
		System.out.println("Ucak ucuyor. ");

	}

	@Override
	public void ilerle() {
		System.out.println("Ucak ilerlemeye basladi.");

	}

}
