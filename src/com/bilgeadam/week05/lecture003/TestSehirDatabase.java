package com.bilgeadam.week05.lecture003;

import java.util.Scanner;

public class TestSehirDatabase {

	/*
	 * 1- Dışarıdan girilen harfle başlayan illeri yazdır. 2- "01-Adana" formatında
	 * illeri plaka kodları ile yazdıran method. 3- Girdiğimiz şehrin ismine göre
	 * plakasını dönen method.
	 */

	public static void main(String[] args) {

		SehirDatabase sehirDatabase = new SehirDatabase();
		String[] iller = sehirDatabase.iller;
//		harfleBaslayanIller(iller);

//		plakaKodlari(iller);
		plakaVerenKod(iller);

//		Scanner sc = new Scanner(System.in);
//		System.out.print("Bir sehrin ilk harfini giriniz: ");
//		String ilkHarf = sc.nextLine();
//
//		for (int i = 0; i < sehirDatabase.iller.length; i++) {
//			if (sehirDatabase.iller[i].startsWith(ilkHarf.toUpperCase())) {
//				System.out.println((i + 1) + " .Sehir : " + sehirDatabase.iller[i]);
//			}
//		}

	}

//	public static void harfleBaslayanIller(String[] iller) {
//		Scanner scanner = new Scanner(System.in);
//		System.out.print("Lütfen bir harf giriniz: ");
//		String harf = scanner.nextLine();
//
//		for (int i = 0; i < iller.length; i++) {
//			if (iller[i].startsWith(harf.toUpperCase().substring(0,1))) {
//				System.out.println(iller[i]);
//			}
//		}
//	}
//	public static void plakaKodlari(String[] iller) {
//		for (int i = 0; i < iller.length; i++) {
//			if (i < 9) {
//				System.out.println("0" + (i + 1) + "- " + iller[i]);
//			} else
//				System.out.println((i + 1) + "- " + iller[i]);
//
//		}
//	}

	public static void plakaVerenKod(String[] iller) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Lütfen Plakasını Öğrenmek istediginiz ilin adını giriniz: ");
		String sehirAdi = scanner.nextLine();
		for (int i = 0; i < iller.length; i++) {
			if (iller[i].equalsIgnoreCase(sehirAdi)) {
				if (i < 9) {
					System.out.println("0" + (i + 1));
				}
			} else {
				System.out.println((i + 1));
			}

		}
	}

}
