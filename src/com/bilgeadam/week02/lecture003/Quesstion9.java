package com.bilgeadam.week02.lecture003;

import java.util.Scanner;

public class Quesstion9 {

	public static void main(String[] args) {
		/**
		 * Kullanıcıdan girilen 1 ile 10 arasındaki sayının çarpım tablosunu yazdıralım.
		 * 
		 */

		Scanner sc = new Scanner(System.in);
		System.out.println("Lutfen 1 ile 10 arasinda bir sayi giriniz");
		int sayi = sc.nextInt();
		for (int i = 1; i <= 10; i++) {

			int carpim = sayi * i;

			System.out.println(sayi + "x" + i + "=" + carpim);

		}

	}

}
