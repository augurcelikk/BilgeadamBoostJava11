package com.bilgeadam.week04.lecture001;

import java.util.Scanner;

public class Uygulama {
	static Scanner scanner = new Scanner(System.in);

	public static void uygulama() {

		boolean status = true;
		while (status) {

			menu();
			switch (islemSec()) {

			case 1:
				System.out.println(toplama());

				break;
			case 2:
				System.out.println(cikarma());
				break;
			case 3:
				System.out.println(carpma());
				break;
			case 4:
				System.out.println(bolme());
				break;

			case 0:
				System.err.println("Programdan Çıkış Yaptınız");
				status = false;
				break;
			default:
				System.err.println("Lütfen geçerli bir değer giriniz: ");

			}
		}
	}

	public static void menu() {
		System.out.println("###HESAP MAKİNESİ###");
		System.out.println("1- TOPLAMA");
		System.out.println("2- ÇIKARMA");
		System.out.println("3- ÇARPMA");
		System.out.println("4- BÖLME");
		System.out.println("5- EBOB EKOK");
		System.out.println("0- ÇIKIŞ");
	}

	public static int islemSec() {
		System.out.print("Lütfen bir işlem seçiniz: ");
		int secim = scanner.nextInt();
		scanner.nextLine();
		return secim;
	}

	public static int toplama() {
		System.out.println("\n###Toplama İşlemi###");
		int islemSonucu = 0;
		String sayi = "";
		while (!sayi.equals("=")) {
			System.out.println("Lütfen bir sayı giriniz: ");
			sayi = scanner.nextLine();
			if (sayi.equals("=")) {
				return islemSonucu;
			} else {
				islemSonucu += Integer.parseInt(sayi);
			}

		}
		return islemSonucu;
	}

	public static int cikarma() {
		System.out.println("\n###Çıkarma İşlemi###");
		int islemSonucu = 0;
		int count = 0;
		String sayi = "";
		while (!sayi.equals("=")) {
			System.out.println("Lütfen bir sayı giriniz: ");
			sayi = scanner.nextLine();
			if (!sayi.equals("=") && count == 0) {
				islemSonucu = Integer.parseInt(sayi);
				count++;

			} else if (sayi.equals("=")) {
				islemSonucu -= Integer.parseInt(sayi);
				return islemSonucu;
			} else {
				islemSonucu -= Integer.parseInt(sayi);
			}
		}
		return islemSonucu;
	}

	public static int carpma() {
		System.out.println("\n###Carpma İşlemi###");
		int islemSonucu = 1;
		String sayi = "";
		while (!sayi.equals("=")) {
			System.out.println("Lütfen bir sayı giriniz: ");
			sayi = scanner.nextLine();
			if (sayi.equals("=")) {
				return islemSonucu;
			} else {
				islemSonucu *= Integer.parseInt(sayi);
			}

		}
		return islemSonucu;
	}

	public static double bolme() {

		System.out.println("\n###Bölme İşlemi###");
		double islemSonucu = 0;
		int count = 0;
		String sayi = "";
		while (!sayi.equals("=")) {
			System.out.println("Lütfen bir sayı giriniz: ");
			sayi = scanner.nextLine();
			if (!sayi.equals("=") && count == 0) {
				islemSonucu = Double.parseDouble(sayi);
				count++;
			} else if (sayi.equals("=")) {
				return islemSonucu;
			} else {
				islemSonucu /= Double.parseDouble(sayi);
			}
		}
		return islemSonucu;
	}

}
