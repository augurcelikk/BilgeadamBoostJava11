package com.bilgeadam.week09.lecture004;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class DogumGunu {

	/*
	 * 
	 * Dışarıdan String olarak doğum günü alalım. Daha sonra doğduğunuz günden bu
	 * güne kadar; Kaç yıl Kaç ay Kaç hafta Kaç gün geçtiğini hesaplayip yazdıralım.
	 * Bir sonraki doğum gününüze kaç gün kaldığını hesaplayın. Ödev teslimi için ;
	 * DogumGunu sınıfını GitHub a pushlayın. Sonrasında DogumGunu sınıfına ait olan
	 * GitHub linkini ödev teslim olarak yollayın.
	 */
	public static void main(String[] args) {
		LocalDate now = LocalDate.now();
		Scanner scanner = new Scanner(System.in);
		System.out.print("Yil girin : ");
		String yil = scanner.nextLine();
		System.out.print("Ay girin : ");
		String ay = scanner.nextLine();
		System.out.print("Gun girin : ");
		String gun = scanner.nextLine();
		int sayisalAy = Integer.parseInt(ay);
		String tarih;
		if (sayisalAy < 10) {
			tarih = yil + "-" + "0" + ay + "-" + gun;
		} else {
			tarih = yil + "-" + ay + "-" + gun;
		}
		LocalDate dogumGunu = LocalDate.parse(tarih);
		System.out.println("Doğum tarihiniz: " + dogumGunu);

		long yeniGun = dogumGunu.until(now, ChronoUnit.DAYS);
		System.out.println("Doğum gününüzden şimdiye kadar " + yeniGun + " gün geçmiş.");
		long yeniHafta = dogumGunu.until(now, ChronoUnit.WEEKS);
		System.out.println("Doğum gününüzden şimdiye kadar " + yeniHafta + " hafta geçmiş.");
		long yeniAy = dogumGunu.until(now, ChronoUnit.MONTHS);
		System.out.println("Doğum gününüzden şimdiye kadar " + yeniAy + " ay geçmiş.");
		long yeniYil = dogumGunu.until(now, ChronoUnit.YEARS);
		System.out.println("Doğum gününüzden şimdiye kadar " + yeniYil + " yıl geçmiş.");

		long yilfarki = dogumGunu.until(now, ChronoUnit.YEARS);
		LocalDate gelecekDogumGunu = dogumGunu.plusYears(1 + yilfarki);
		System.out.println("Gelecek doğum günü tarihiniz: " + gelecekDogumGunu);
		long gunfarki = now.until(gelecekDogumGunu, ChronoUnit.DAYS);
		System.out.println("Gelecek doğum gününüze " + gunfarki + " gün kaldı.");

	}

}
