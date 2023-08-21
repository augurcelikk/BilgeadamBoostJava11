package com.bilgeadam.week07.lecture001.enumornek;

public class Test {

	public static void main(String[] args) {

		/*
		 * private EBoyut boyut; private EHamurTipi hamurTipi; private ETur pizzaTuru;
		 * private double fiyat;
		 */

//		Pizza pizza = new Pizza();
//		pizza.setBoyut(EBoyut.BUYUK);
//		pizza.setHamurTipi(EHamurTipi.KALIN);
//		pizza.setPizzaTuru(ETur.TAVUKLU);
//		pizza.setFiyat(50);

//		Pizza pizza = new Pizza(EBoyut.KUCUK, EHamurTipi.KALIN, ETur.TAVUKLU, 50);
//
//		System.out.println(pizza.toString());
//
//		String isim = Utility.stringDegerAlma("Lutfen bir kelime giriniz:");
//		int sayi = Utility.intDegerAlma("Lutfen bir sayi giriniz: ");
//		System.out.println(isim);

		// ETur.values();// enum'un degerlerinin hepsine erisir

		PizzaSiparis pizzaSiparis = new PizzaSiparis();
		pizzaSiparis.menu();
//		pizzaSiparis.boyutSec();
//		pizzaSiparis.hamurTipiSec();
//		pizzaSiparis.turSec();

	}

}
