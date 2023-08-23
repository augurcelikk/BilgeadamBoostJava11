package com.bilgeadam.week07.lecture002.arraylist;

import java.util.ArrayList;
import java.util.List;

public class ArrayListMetotlari {

	public static void main(String[] args) {

		List<String> sehirler = new ArrayList<String>();
		ArrayList<String> sehirler2 = new ArrayList<String>();

		// listeye eleman ekleme
		sehirler.add("Ankara");
		sehirler.add("Adana");
		sehirler.add("Antalya");
		sehirler.add("İzmir");
		sehirler.add("çanakkale");
		sehirler.add("Balıkesir");
		sehirler.add("Hatay");
		sehirler.add("Eskişehir");

		// listeyi gezme
		for (String sehir : sehirler) {
			System.out.println(sehir);
		}
		System.out.println("----------------------------------------");

		// listeden eleman çıkarma
		sehirler.remove(0);// indexe göre
		sehirler.remove("Adana");// index değerine göre
		for (String sehir : sehirler) {
			System.out.println(sehir);
		}
		System.out.println("----------------------------------------");

		// belirli bir indexe eleman ekleme
		sehirler.add(5, "Adana");
		for (String sehir : sehirler) {
			System.out.println(sehir);
		}
		System.out.println("----------------------------------------");

//		//bütün listeyi temizleme
//		sehirler.clear();
//		for (String sehir : sehirler) {
//			System.out.println(sehir);
//		}

		// listenin elemanlarına erişim
		sehirler.get(0);
		System.out.println("Seçtiğiniz şehir: " + sehirler.get(4));
		System.out.println("----------------------------------------");

		sehirler.set(6, "Iskenderun");
		for (String sehir : sehirler) {
			System.out.println(sehir);
		}
		System.out.println("----------------------------------------");

		// listenin boyutuna erişme
		System.out.println(sehirler.size());

		// liste içerisinde kontrol ve arama yapma
		sehirler.contains("Ankara");
		System.out.println(sehirler.contains("Ankara"));
		sehirler.indexOf("Adana");
		System.out.println(sehirler.indexOf("Adana")); // eğer girilen eleman listede yoksa "-1" döner.
		System.out.println(sehirler.lastIndexOf("Ankara")); // ankaranın bulunduğu son indexi getirir.

		// sublist
		sehirler.subList(3, 7); // listedeki belirli bir aralığın getirilmesini sağlar
		// baslangic index değerini getirir, bitis index değerini getirmez
		// 3,4,5,6 indexin verilerini görüntüler

		// dönüştürmeler
		String[] arraySehirler2 = sehirler.toArray(new String[sehirler.size()]); // arraylist to array
		System.out.println("----------------------------------------");

		sehirler2.add("Trabzon");
		sehirler2.add("Rize");

		sehirler.addAll(sehirler2);

		for (String sehir : sehirler) {
			System.out.println(sehir);
		}
	}
}
