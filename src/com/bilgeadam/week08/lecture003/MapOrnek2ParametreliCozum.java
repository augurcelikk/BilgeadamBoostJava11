package com.bilgeadam.week08.lecture003;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class MapOrnek2ParametreliCozum {

	/*
	 * Ogrenci ve notlardan olusan bir map olusturalım
	 * 
	 * ogrenciyi cagirdigimda bana notlari dönsün mapi yazdiralim
	 * 
	 */
	public static void main(String[] args) {

		String[] ogrenci = { "Ayşe", "Ece", "Mahmut" };
		int[] notlar = { 60, 70, 80 };

		mapOlustur(ogrenci, notlar);
		mapYazdir(mapOlustur(ogrenci, notlar));
	}

	public static Map<String, Integer> mapOlustur(String[] ogrenci, int[] notlar) {
		Map<String, Integer> map = new HashMap<String, Integer>();

		for (int i = 0; i < ogrenci.length; i++) {
			map.put(ogrenci[i], notlar[i]);
		}
		return map;
	}

	public static void mapYazdir(Map<String, Integer> map) {
		for (Entry<String, Integer> ogrencilerVeNotlari : map.entrySet()) {
			System.out.println(ogrencilerVeNotlari.getKey() + " =>> " + ogrencilerVeNotlari.getValue());
		}
	}

}
