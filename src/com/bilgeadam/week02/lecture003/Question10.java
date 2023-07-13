package com.bilgeadam.week02.lecture003;

import java.util.Scanner;

public class Question10 {

	/*
	 * Kullanıcının disaridan girdigi sayiya 1 den baslayarak sayiya kadar olan
	 * (sayi dahil) sayilarin 1 fazlasinin toplamini ekranda yazdiran program
	 */

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Lutfen bir sayi giriniz");
		int sayi = sc.nextInt();
		int toplam = 0;
		int i = 1;

		while (i <= sayi) {
			toplam += i + 1;
			i++;
		}

//		for (int i = 1; i <= sayi; i++) {
//			toplam += (i + 1);

//		}
		System.out.println(toplam);
	}

}