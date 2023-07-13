package com.bilgeadam.week02.lecture003;

import java.util.Scanner;

public class Question21 {
	/*
	 * Kullanıcı 1 ile 7 arasında bir sayı girsin (1 ve 7 dahil) bu sayıya denk
	 * gelen haftanın gününü yazdıralım
	 * 
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Haftanın gününü seciniz");
		int sayi = sc.nextInt();

		switch (sayi) {
		case 1:
			System.out.println(sayi + " . gün pazartesidir.");
			break;
		case 2:
			System.out.println(sayi + " . gün salıdır.");
			break;
		case 3:
			System.out.println(sayi + " . gün çarşambadır.");
			break;
		case 4:
			System.out.println(sayi + " . gün perşembedir.");
			break;
		case 5:
			System.out.println(sayi + " . gün cumadır.");
			break;
		case 6:
			System.out.println(sayi + " . gün cumartesidir.");
			break;
		case 7:
			System.out.println(sayi + " . gün pazardır.");
		default:
			System.out.println("Lütfen 1 ile 7 arasında bir secim yapınız");
		}
		sc.close();

	}

}
