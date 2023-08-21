package com.bilgeadam.week05.lecture003.copy2;

public class Database {

	static Kullanici[] kullaniciListesi = new Kullanici[5];
	static int uzunluk = 1;

	public void kullanicilariOlustur() {

		Kullanici kullanici = new Kullanici();
		kullanici.isim = "Zeynep";
		kullanici.email = "zeynep@hotmail.com";
		kullanici.sifre = "123";
		kullaniciListesi[0] = kullanici;
		kullanici.id = uzunluk;
		uzunluk++;

		Kullanici kullanici2 = new Kullanici();
		kullanici2.isim = "Alperen";
		kullanici2.email = "alperen@hotmail.com";
		kullanici2.sifre = "123";
		kullaniciListesi[1] = kullanici2;
		kullanici2.id = uzunluk;
		uzunluk++;

		Kullanici kullanici3 = new Kullanici();
		kullanici3.isim = "Ugur";
		kullanici3.email = "ugur@hotmail.com";
		kullanici3.sifre = "123";
		kullaniciListesi[2] = kullanici3;
		kullanici3.id = uzunluk;
		uzunluk++;

	}

}
