package com.bilgeadam.week04.lecture002;

public class Question47 {
	/**
	 * Dışarıdan 10 sayısı girilecek. metotlara parametre olarak 10 sayısını
	 * vererek;
	 * 
	 * 
	 * 
	 * 1- 10+50
	 * 
	 * 2- (10+50) *30
	 * 
	 * 3- ((10+50)*30)-40
	 * 
	 * 4- (((10+50)*30)-40)/20 işlemlerini yaptıracağız.
	 * 
	 * 
	 * 
	 * Bunu tek bir satırda metotların içerisine metotlar geçirerek yapacağız.
	 * 
	 * 
	 * 
	 **/
	public static void main(String[] args) {

		double sonuc = yirmiIlebol(kirkCikar(otuzIleCarp(elliEkle(10))));
		System.out.println(sonuc);

	}

	public static int elliEkle(int sayi) {

		return sayi + 50;
	}

	public static int otuzIleCarp(int sayi) {
		return sayi * 30;
	}

	public static int kirkCikar(int sayi) {
		return sayi - 40;
	}

	public static double yirmiIlebol(int sayi) {
		return sayi / 20.0;
	}

}
