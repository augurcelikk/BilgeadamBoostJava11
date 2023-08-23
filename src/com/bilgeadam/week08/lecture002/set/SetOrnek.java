package com.bilgeadam.week08.lecture002.set;

import java.util.HashSet;
import java.util.Set;

public class SetOrnek {

	/*
	 * 
	 * Film kategorileri.
	 * 
	 * Bir tane string setimiz olsun. daha sonra dişaridan bir kategori istediğimiz
	 * metot olsun ve bu kategorileri setimize ekleyelim.
	 * 
	 * Eğer daha once eklemişsek bize bu kategori daha once eknemiş gibi bir çıktı
	 * versin Eğer daha once eklenmediyse de kategori başarıyla eklendi gibi bir
	 * çıktı versin
	 * 
	 * setimizi yazdiralim
	 */

	public static void main(String[] args) {

//		Set<Integer> integerSet = new HashSet<Integer>();
//		integerSet.add(10);
//		integerSet.add(20);
//		integerSet.add(20);
//
//		integerSet.forEach(System.out::println);

		Set<String> set = new HashSet<String>();
		kategoriEkle("Aksiyon", set);
		kategoriEkle("Romantik", set);
		kategoriEkle("Dram", set);
		kategoriEkle("Aksiyon", set);

		for (String kategori : set) {
			System.out.println(kategori);
		}

	}

	public static void kategoriEkle(String kategori, Set<String> set) {
		if (set.contains(kategori)) {
			System.out.println(kategori + " Kategorisi daha once eklenmistir.");

		} else {
			System.out.println(kategori + " basarili bir sekilde eklenmistir.");
			set.add(kategori);
		}

	}

}
