package com.bilgeadam.week02.lecture002;

import java.util.Scanner;

public class Question5 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		// int integerSayi = scanner.nextInt();
		// double doubleSayi = scanner.nextDouble ();
		// float, long,

		System.out.print("Lütfen bir sayi giriniz: ");
		double doubleSayi = scanner.nextDouble();// "\n"
		/*
		 * scanner ile sayısal bir değer okuduktan sonra String bir değer okumak
		 * istiyorsan mutlaka tane boş scanner.nextLine(); kullanmamız gerekiyor ki
		 * yukarıda gömülü gelen \n değeri ile nötrlensin ve aşağıda yazacağımız string
		 * değerini okutabilelim. Stringin icinde de gömülü \n var ama yazılan string
		 * değeri ile birlikte okundugundan zaten stringin kendisini okurken \n i de
		 * okuyor ve ekstra nötrlemeye gerek kalmıyor.
		 *
		 * Özetle; scanner ile sayısal bir değer okuduktan sonra String bir değer okumak
		 * isitiyorsak mutlaka 1 tane boş scanner.nextLine(); kullanmamız lazım.
		 */

		doubleSayi = scanner.nextDouble();
		doubleSayi = scanner.nextDouble();

		double ikinciSayi = 5;

//		String ikinciSayiString = "5";
//		String ucuncuSayiString = "10";

		System.out.println(doubleSayi + ikinciSayi);

		System.out.print("Lütfen adınızı giriniz: ");
		String isim = scanner.nextLine();

//		System.out.println("Merhaba : " + isim + 15);
//		System.out.println(ikinciSayiString + ucuncuSayiString);

	}

}
