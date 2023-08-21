package com.bilgeadam.week05.lecture004.copy;

import java.util.Scanner;

public class Uygulama {
	/*
	 * kullanici kayit sistemi Menu; 1- kayıt ol 2-giriş yap 3- kullanıcıları göster
	 * 4-Çıkış
	 * 
	 * 
	 * 1-menuyu olustur 2-menuden secim yap 3-yapılan secime göre aksiyon
	 * alınambilecek bir tema olustur
	 * 
	 * case 1 kayıtOl() metodunun içini yaz. kullaniciEkle() case1.1
	 * 
	 * Database sınıfında listeBoyutunuArtir(); -> liste.length-2 kadar veri
	 * barindirdiği zaman listeinin boyutunu 5 artirsin
	 * 
	 */
	Scanner scanner = new Scanner(System.in);

	public void application() {
		int secim;
		do {

			menu();
			secim = secimYap();

			switch (secim) {
			case 1:
				kayitOl();
				// TODO kayitOl metodunda verilerin giriş parametreleri belirlenecek(sifre min 8
				// karakter)
				break;
			case 2:
				girisYap();
				break;
			case 3:
				kullanicilariGoster();
				break;
			case 4:
				System.out.println("Uygulamadan Cikis Yapildi");
			default:
				System.out.println("Lütfen geçerli bir secim yapiniz: ");
			}
		} while (secim != 4);
	}

	private void kullanicilariGoster() {
		System.out.println("İsim\tE-mail\tID");
		for (int i = 0; i < Database.kullaniciListesi.length; i++) {
			if (Database.kullaniciListesi[i] != null) {
				System.out.println(Database.kullaniciListesi[i].isim + "\t" + Database.kullaniciListesi[i].email + "\t"
						+ Database.kullaniciListesi[i].id);
			}
		}
	}

	public String[] girisYap() {
		System.out.print("Lütfen email giriniz: ");
		String email = scanner.nextLine();
		System.out.print("Lütfen şifre giriniz: ");
		String sifre = scanner.nextLine();
		String[] emailSifre = new String[2];
		emailSifre[0] = email;
		emailSifre[1] = sifre;

		Database.kullaniciVarMi(emailSifre);
		return emailSifre;

	}

	private void kayitOl() {
		Kullanici kullanici = new Kullanici();
		System.out.print("Kullanicinin adini giriniz: ");
		kullanici.isim = scanner.nextLine();
		System.out.print("Kullanicinin emailini giriniz: ");
		kullanici.email = scanner.nextLine();
		System.out.print("Kullanicini sifresini giriniz: ");
		kullanici.sifre = scanner.nextLine();
		kullanici.id = Database.uzunluk + 1;
		Database.kullaniciEkle(kullanici);

	}

	public void menu() {
		System.out.println();
		System.out.println("*******************************");
		System.out.println("*** KULLANICI KAYIT SISTEMI ***");
		System.out.println("*******************************");
		System.out.println("1- Kayıt ol");
		System.out.println("2- Giris yap");
		System.out.println("3- Kullanicilari goster");
		System.out.println("4- Cikis Yap");
		System.out.println();

	}

	public int secimYap() {

		System.out.println("Lütfen bir seçim yapiniz.");
		int secim = scanner.nextInt();
		scanner.nextLine();
		return secim;

	}

	public int switchCase(int secim) {
		return 0;
	}

}
