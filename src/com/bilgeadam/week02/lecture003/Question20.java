package com.bilgeadam.week02.lecture003;

import java.util.Scanner;

public class Question20 {
	/*
	 * Girilen sayının 5'in kuvveti olup olmadıgını bulan progarm
	 * 
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Bir sayi giriniz");
		int sayi = sc.nextInt();
		boolean kontrol = true;

		if (sayi == 1) {
			System.out.println("sayi 5'in kuvvetidir.");
			kontrol = false;
		} else if (sayi < 0) {
			System.out.println("Lutfen pozitif bir sayi giriniz");
			kontrol = false;
		}

		while (kontrol) {

			if (sayi % 5 == 0) {
				sayi /= 5;
				if (sayi == 1) {
					System.out.println("Sayi 5'in kuvvetidir.");
					kontrol = false;
				}
			} else {
				System.out.println("sayi 5'in kuvveti degildir.");
				kontrol = false;

			}

		}

	}

}// main

// class
