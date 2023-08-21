package com.bilgeadam.week05.lecture005.encapsullation;

public class ArabaTest {

	public static void main(String[] args) {

		Araba araba = new Araba();
//		araba.marka = "BMW";
//		araba.model = "x5";
//		araba.km = 0;
//		araba.bijonSayisi = 5;
//		araba.camSil = "a";

		araba.setMarka("bmw");
		araba.setModel("x5");
//		araba.setBijonSayisi(5);
		araba.setCamSil("a");

		araba.ozellikleriYazdir();
		araba.arabayiSur();
		System.out.println();

		// ##########################
		Araba araba2 = new Araba("bmw", "x5", -150, 5, "a");

		araba.ozellikleriYazdir();
		araba.arabayiSur();

		System.out.println();

		// ##########################
		Araba araba3 = new Araba(150, "b");

		araba.ozellikleriYazdir();
		araba.arabayiSur();
		System.out.println();

		Araba araba4 = new Araba("Camsil");

		araba.ozellikleriYazdir();
		araba.arabayiSur();
	}

}
