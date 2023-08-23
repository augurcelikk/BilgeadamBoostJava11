package com.bilgeadam.week08.lecture003;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class MapOrnek2 {

	Map<String, Integer> sinif = new HashMap<String, Integer>();
	String[] ogrenci = { "Ayşe", "Ece", "Mahmut" };
	int[] notlar = { 60, 70, 80 };
	Map<String, List<Integer>> ogrencilerVeNotlari = new HashMap<String, List<Integer>>();
	int[][] notlar2 = { { 50, 60, 60 }, { 60, 40, 80 }, { 80, 90, 100 } };// mapolustur2 metodu ve yine mapi yazdiralim

	public static void main(String[] args) {

		/*
		 * Ogrenci ve notlardan olusan bir map olusturalım
		 * 
		 * ogrenciyi cagirdigimda bana notlari dönsün mapi yazdiralim
		 * 
		 */

//		Map<String, Integer> map = new HashMap<>();
//		map.put("Ayse", 60);
//		map.put("Ece", 70);
//		map.put("Mahmut", 80);
//		for (Entry<String, Integer> ogrenciler : map.entrySet()) {
//			System.out.println(ogrenciler.getKey());
//			System.out.println(ogrenciler.getValue());
//		}

		MapOrnek2 mapOrnek2 = new MapOrnek2();

		mapOrnek2.mapOlustur1();
		mapOrnek2.mapYazdir2();
		mapOrnek2.mapOlustur2();
		mapOrnek2.mapYazdir2();
	}

	public void mapOlustur1() {
		for (int i = 0; i < ogrenci.length; i++) {
			sinif.put(ogrenci[i], notlar[i]);
		}
	}

	public void mapOlustur2() {
		for (int i = 0; i < ogrenci.length; i++) {
			List<Integer> liste = new ArrayList<Integer>();
			for (int j = 0; j < notlar2[i].length; j++) {
				liste.add(notlar2[i][j]);
			}
			ogrencilerVeNotlari.put(ogrenci[i], liste);
		}
	}

	public void mapYazdir1() {
		for (Entry<String, Integer> ogrencilerVeNotlari : sinif.entrySet()) {
			System.out.println(ogrencilerVeNotlari.getKey() + " =>> " + ogrencilerVeNotlari.getValue());
		}
	}

	public void mapYazdir2() {
		for (Entry<String, List<Integer>> ogrencilerVeNotlar : ogrencilerVeNotlari.entrySet()) {
			System.out.println(ogrencilerVeNotlar.getKey() + " =>> " + ogrencilerVeNotlar.getValue());
		}
	}

}
