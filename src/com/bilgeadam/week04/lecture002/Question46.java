package com.bilgeadam.week04.lecture002;

import java.util.Scanner;

public class Question46 {
	// Kullanıcıya kaç sayı alacağımızı soralım. (2 ya da 3 sayı)

	// 2 gelirse topla() metodu içinde iki değerimizi alıp toplayalım.

	// eğer 3 gelirse de aynı metodu overload şeklinde yazalım. Aldığımız 3 değeri
	// metoda geçelim.

	// main'de dışarıdan kaç sayı alacağımızı belirliyoruz,
	// o sayılara göre koşullarımızı belirleyip o koşullarda yazdığımız 2 metottan
	// birisini çağıracağız.

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.err.println("Kaç adet sayı gireceksiniz: ");
		int sayiAdedi = scanner.nextInt();

		switch (sayiAdedi) {

		case 2:
			System.out.println("Toplam = " + topla());
			break;
		case 3:
			System.out.print("Lütfen 1. sayiyi giriniz: ");
			int sayi1 = scanner.nextInt();
			System.out.print("Lütfen 1. sayiyi giriniz: ");
			int sayi2 = scanner.nextInt();
			System.out.print("Lütfen 1. sayiyi giriniz: ");
			int sayi3 = scanner.nextInt();
			System.out.println("Toplam = " + topla(sayi1, sayi2, sayi3));
			break;
		default:
			System.out.println("Çıkış yaptınız");
		}

	}

	private static int topla() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Lütfen 1. sayiyi girin: ");
		int sayi1 = scanner.nextInt();
		System.out.print("Lütfen 2. sayiyi girin: ");
		int sayi2 = scanner.nextInt();
		scanner.close();
		return sayi1 + sayi2;
	}

	public static int topla3(int sayi1, int sayi2, int sayi3) {
		return sayi1 + sayi2 + sayi3;
	}

	private static int topla(int sayi1, int sayi2, int sayi3) {
		return sayi1 + sayi2 + sayi3;

	}
}
