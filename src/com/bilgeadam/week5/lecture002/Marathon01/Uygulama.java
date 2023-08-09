package com.bilgeadam.week5.lecture002.Marathon01;

import java.util.Scanner;

public class Uygulama {

	Scanner scanner = new Scanner(System.in);
	OgrenciOzelListe1 ogrenciOzelListe = new OgrenciOzelListe1();
	boolean[][] hobiListesi;
	MaasOzelListe1 maasOzelListe = new MaasOzelListe1();
	String[][] hobiler;

	public void uygulama() {
		int secim;

		do {
			menu();
			secim = secimYap();
			switch (secim) {
			case 1:
				ogrenciTanimla();
				break;
			case 2:
				hobileriGir();
//				for (int i = 0; i < hobiListesi.length; i++) {
//					for (int j = 0; j < hobiListesi[i].length; j++) {
//						System.out.println(hobiListesi[i][j]);
//					}
//				}
				break;
			case 3:
				maasBeklentileriniGir();
//				maasOzelListe.list();
				break;
			case 4:
				sinifListesi();

				break;

			case 0:
				System.out.println("Cikis Yapildi...");
				break;
			}

		} while (secim != 0);
	}

	private void sinifListesi() {
		System.out.println("No\tAd\tHobileri\t\t\t\t\t\t\t\tMaas Beklentisi");
		for (int i = 0; i < ogrenciOzelListe.boyut; i++) {
			System.out.print((i + 1) + "\t" + ogrenciOzelListe.ogrenciListesi[i] + "\t\t");
			hobileriYazdir(i);
			System.out.println("\t\t\t\t" + maasOzelListe.maasListesi[i]);

		}

	}

	private void hobileriTanimla() {
		hobiler = new String[hobiListesi.length][4];
		for (int i = 0; i < hobiler.length; i++) {
			for (int j = 0; j < hobiListesi[i].length; j++) {
				hobiler[i][j] = "";
			}
		}

		for (int i = 0; i < hobiListesi.length; i++) {
			for (int j = 0; j < hobiListesi[i].length; j++) {
				if (hobiListesi[i][j] == true) {
					if (j == 0) {
						hobiler[i][j] = "Yurumek";
					}
					if (j == 1) {
						hobiler[i][j] = "Kitap Okumak";
					}
					if (j == 2) {
						hobiler[i][j] = "Spor Yapmak";
					}
					if (j == 3) {
						hobiler[i][j] = "Kod Yazmak";
					}
				}
			}
		}

	}

	private void hobileriYazdir(int index) {
		hobileriTanimla();
		for (int j = 0; j < hobiler[index].length; j++) {
			System.out.print(hobiler[index][j]);

			if (j != hobiler[index].length - 1 && !hobiler[index][j].equals("")) {
				System.out.print(",");
			}
		}

	}

	private void maasBeklentileriniGir() {
		double maas;
		for (int i = 0; i < ogrenciOzelListe.boyut; i++) {
			System.out.println((i + 1) + ". Öğrenci" + ogrenciOzelListe.ogrenciListesi[i] + "maas beklentisi: ");
			maas = scanner.nextDouble();
			maasOzelListe.add(maas);
		}
		scanner.nextLine();
	}

	private void ogrenciTanimla() {
		System.out.println("Kac ogrenci tanimlayacaksınız? : ");
		int ogrenciSayisi = scanner.nextInt();
		scanner.nextLine();
		for (int i = 0; i < ogrenciSayisi; i++) {
			System.out.println((i + 1) + ". Öğrencinin adı...: ");
			String ogrenci = scanner.nextLine();
			ogrenciOzelListe.add(ogrenci);
		}

		hobiListesi = new boolean[ogrenciSayisi][4];

	}

	private void hobileriGir() {
		int ogrenciIndex = ogrenciBul();
		if (ogrenciIndex != -1) {
			String secim;
			System.out.print("Yürümekten hoşlanır mısın?(E/H) : ");
			secim = scanner.nextLine();
			if (secim.equalsIgnoreCase("E")) {
				hobiListesi[ogrenciIndex][0] = true;
			}

			System.out.print("Kitap okumaktan hoşlanır mısın?(E/H) : ");
			secim = scanner.nextLine();
			if (secim.equalsIgnoreCase("E")) {
				hobiListesi[ogrenciIndex][1] = true;
			}

			System.out.print("Spor rutinlerin var mı?(E/H) : ");
			secim = scanner.nextLine();
			if (secim.equalsIgnoreCase("E")) {
				hobiListesi[ogrenciIndex][2] = true;
			}

			System.out.print("Kod yazmaktan hoşlanır mısın?(E/H) : ");
			secim = scanner.nextLine();
			if (secim.equalsIgnoreCase("E")) {
				hobiListesi[ogrenciIndex][3] = true;
			}

		} else {
			System.err.println("Boyle bir ogrenci bulunmamaktadır.");
		}
	}

	private int ogrenciBul() {
		ogrenciOzelListe.list();
		System.out.println("Öğrenci Seçiniz...:  ");
		String ogrenci = scanner.nextLine();
		String[] ogrenciler = ogrenciOzelListe.ogrenciListesi;
		for (int i = 0; i < ogrenciler.length; i++) {
			if (ogrenciler[i].equalsIgnoreCase(ogrenci)) {
				System.out.println(i);
				return i;
			}

		}
		System.out.println(-1);
		return -1;
	}

	private void menu() {

		System.out.println("***************************");
		System.out.println("***ÖĞRENCİ BİLGİ SİSTEMİ***");
		System.out.println("***************************");
		System.out.println();
		System.out.println("1- Sinir arkadasi tanimla");
		System.out.println("2- Hobilerini gir");
		System.out.println("3- Maas beklentini gir");
		System.out.println("4- Sinif listesi");
		System.out.println("0- CIKIS");
	}

	private int secimYap() {
		System.out.print("Seciminiz: ");
		int secim = scanner.nextInt();
		scanner.nextLine();
		System.out.println();
		return secim;
	}

}
