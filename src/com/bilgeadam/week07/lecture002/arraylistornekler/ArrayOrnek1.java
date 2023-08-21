package com.bilgeadam.week07.lecture002.arraylistornekler;

import java.util.ArrayList;
import java.util.List;

public class ArrayOrnek1 {

	/*
	 * 
	 * Ankara Antalya Bolu Artvin Ankara Antalya Erzurum Karaman Ankara
	 * 
	 * "an"ile baslyan sehirleri listeden cikaralım
	 * 
	 */

	public static void main(String[] args) {

		List<String> sehirler = new ArrayList<String>();
		sehirler.add("Ankara");
		sehirler.add("Antalya");
		sehirler.add("Bolu");
		sehirler.add("Artvin");
		sehirler.add("Ankara");
		sehirler.add("Antalya");
		sehirler.add("Erzurum");
		sehirler.add("Karaman");
		sehirler.add("Ankara");
//cozum1
//		for (int i = 0; i < sehirler.size(); i++) {
//			if (sehirler.get(i).startsWith("An")) {
//				sehirler.remove(i);
//				i--;
//			}
//
//		}
//cozum2
//		for (int i = sehirler.size() - 1; i >= 0; i--) {
//			if (sehirler.get(i).startsWith("An")) {
//				sehirler.remove(i);
//
//			}
//		}
//cozum3
//		for (int i = 0; i < sehirler.size(); i++) {
//			if (sehirler.get(i).startsWith("An")) {
//				sehirler.remove(i);
//				sehirler.add(i, "xxxx");
//			}
//		}
//cozum4	
//		for (int i = 0; i < sehirler.size(); i++) {
//			if (sehirler.get(i).startsWith("An")) {
//				sehirler.set(i, "xxxx");
//			}
//		}
//cozum5
//		for (String sehir : sehirler) {
//			if (sehir.startsWith("An")) {
//				sehirler.set(sehirler.indexOf(sehir), "xxxx");
//			}
//		}

		for (String sehir : sehirler) {
			System.out.println(sehir);
		}
	}
}
