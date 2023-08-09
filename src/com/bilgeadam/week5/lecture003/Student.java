package com.bilgeadam.week5.lecture003;

public class Student {
	/*
	 * 
	 * Öğrencilerin isim ve numaraları olacak.
	 * 
	 * her yeni öğrenci kaydedildiğinde öğrenci numarası 1 artacak.
	 * 
	 * değişkenleri ve methodları olusturun ve test sınfında cağırıp deneyeceğiz
	 * 
	 * 
	 */

	String isim; // nesne değişkeni
	static int numara; // sınıf değişkeni

	public void kayit() {
		numara += 1;
		System.out.println(isim + " adlı öğrenci " + numara + " no'su ile kaydolmuştur.");

	}

}
