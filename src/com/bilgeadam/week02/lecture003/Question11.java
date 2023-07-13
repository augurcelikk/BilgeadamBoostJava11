package com.bilgeadam.week02.lecture003;

public class Question11 {

	/*
	 * 1 den baslayarak sayilari butun sayilari taoplayalim. toplamimiz 50yi gecene
	 * kadar calissin. en sonda toplami yazdiralim ve bu dongunun kac kere
	 * calistigini yaz
	 * 
	 */
	public static void main(String[] args) {

		int toplam = 0;

		for (int i = 1; toplam <= 50; i++) {
			toplam += i;
			System.out.println("sayilarin toplami " + toplam + " \ndongu " + i + " keretekrar etti");

		}

//		int i = 1;
//		int sayac = 0;
//		while (toplam <= 50) {
//			toplam += i;
//			sayac = i;
//			i++;
//		}
//		System.out.println("Sayilarin toplami= " + toplam + " \nDongu " + sayac + " kere calisti");

	}

}
