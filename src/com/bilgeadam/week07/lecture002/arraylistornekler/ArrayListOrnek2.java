package com.bilgeadam.week07.lecture002.arraylistornekler;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ArrayListOrnek2 {
	public static void main(String[] args) {

		/*
		 * 
		 * 1tane tek sayilar 1 tane çift sayılar için bir liste olusturalim
		 * 
		 * sonra 35 tane random sayiyi çift ise çiftlere tek ise teklere atalim
		 * 
		 * en sonunda tekler ve çiftler listesini yazdiralim
		 * 
		 */

		List<Integer> tekler = new ArrayList<>();
		List<Integer> ciftler = new ArrayList<>();

		Random random = new Random();

		for (int i = 0; i < 35; i++) {
			int sayi = random.nextInt(0, 100);
			if (sayi % 2 == 1) {
				tekler.add(sayi);
			} else {
				ciftler.add(sayi);
			}
		}

		System.out.println("Tek Sayılar: " + tekler);
		System.out.println("Çift Sayılar: " + ciftler);

	}

}
