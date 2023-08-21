package com.bilgeadam.week07.lecture003.FootballApp2;

import java.util.ArrayList;
import java.util.List;

public class Test {

	public static void main(String[] args) throws InterruptedException {

//		Takim takim = new Takim("Takim 1");
//
//		System.out.println(takim.getKaleci());
//		for (AktifFutbolcu futbolcu : takim.getFutbolcular()) {
//			System.out.println(futbolcu.pasVer());
//
//		}

//		Mac mac = new Mac();
//
//		mac.oyna(mac.takimlar.get(0));
//		System.out.println(mac.takimDegistir(mac.takimlar.get(1)).getAd());

//		long macBitisZamani = System.currentTimeMillis() + 15000;
//
//		while (System.currentTimeMillis() < macBitisZamani) {
//			long bitimeKalanSure = macBitisZamani - System.currentTimeMillis();
//			Thread.sleep(1500);
//			System.out.println("Mac devam ediyor." + bitimeKalanSure);
//
//		}

		Takim takim = new Takim("Fenerbahce");
		Takim takim2 = new Takim("Galatasaray");

		List<Takim> takimlar = new ArrayList<>();
		takimlar.add(takim);
		takimlar.add(takim2);

		Mac mac = new Mac(takimlar);
		mac.mac();
	}

}
