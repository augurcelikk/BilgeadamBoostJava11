package com.bilgeadam.week06.lecture003.interfaceornek;

public class Test {

	public static void main(String[] args) {
		Araba araba = new Araba();
		araba.ilerle();
		System.out.println("\n###########################\n");

		Bisiklet bisiklet = new Bisiklet();
		bisiklet.bin();
		bisiklet.ilerle();
		System.out.println("\n###########################\n");

		Ucak ucak = new Ucak();
		ucak.ilerle();
		ucak.uc();
	}

}
