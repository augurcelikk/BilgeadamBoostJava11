package com.bilgeadam.week08.lecture005;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;

public class UrunManager {

	List<Urun> urunler = new ArrayList<Urun>();

	static Scanner scanner = new Scanner(System.in);

	public Urun urunYarat() {
		System.out.println("Urun adini giriniz: ");
		String urunAdi = scanner.nextLine();

		System.out.println("Urun fiyatini giriniz: ");
		int fiyat = Integer.parseInt(scanner.nextLine());
		System.out.println("Urun skt giriniz : ");
		int skt = Integer.parseInt(scanner.nextLine());

		if (urunAdi.isBlank() || fiyat <= 0) {
			return null;
		} else {
			return new Urun(urunAdi, fiyat, skt);
		}

	}

	public Optional<Urun> urunOlustur2() {
		System.out.println("Urun adini giriniz: ");
		String urunAdi = scanner.nextLine();

		System.out.println("Urun fiyatini giriniz: ");
		int fiyat = Integer.parseInt(scanner.nextLine());
		System.out.println("Urun skt giriniz : ");
		int skt = Integer.parseInt(scanner.nextLine());

		if (urunAdi.isBlank() || fiyat <= 0) {
			return Optional.empty();

		} else {
//			Optional<Urun> urun = Optional.of(new Urun(urunAdi,fiyat,skt));
			return Optional.of(new Urun(urunAdi, fiyat, skt));
		}
	}

	public void urunEkle(Optional<Urun> urun) {
		if (urun.isPresent()) {
			urunler.add(urun.get());
		}

	}

	public void sonKullanmaTarihiGecmisUrunleriListele(List<Urun> urun) {
		urunler.stream().filter((x) -> x.getSkt() < 2023).forEach(System.out::println);
	}

	public void zamYap(List<Urun> urunler) {
//		urunler.stream().filter((x) -> x.getSkt() > 2023).map((y)->{y.setFiyat(y.getFiyat()*2); return y.getFiyat()});
		urunler.stream().filter((x) -> x.getSkt() > 2023).map((y) -> {
			y.setFiyat(y.getFiyat() * 2);
			return y;
		}).forEach(System.out::println);
		;
	}
}
