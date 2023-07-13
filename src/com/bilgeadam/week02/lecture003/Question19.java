package com.bilgeadam.week02.lecture003;

import java.util.Scanner;

public class Question19 {

	/*
	 * Girilen sayının asal olup olmadıgını ekranda goster
	 */

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Bir sayi giriniz");
		int sayi = sc.nextInt();
		int i;
		if (sayi == 2) {
			System.out.println("Asaldır.");
		} else if (sayi % 2 == 0 || sayi == 1) {
			System.out.println("Asal degildir.");
		} else {
			for (i = 3; i <= sayi; i += 2) {

				if (sayi == i) {
					System.out.println("Asaldır");
				} else if (sayi % i == 0) {
					System.err.println("asal degildir");
				}
			}
		}
	}
}