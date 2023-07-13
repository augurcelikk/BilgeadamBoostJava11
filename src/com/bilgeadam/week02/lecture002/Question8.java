package com.bilgeadam.week02.lecture002;

import java.util.Scanner;

public class Question8 {

	/*
	 * 
	 * Dışarıdan girilen bir sayının faktöriyelini hesaplayalım.
	 */

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Lutfen faktoriyelini almak istediginiz sayiyi giriniz");

		int sayi1 = sc.nextInt();
		sc.nextLine();
		int faktoriyel = 1;

		for (int i = 1; i <= sayi1; i++) {
			faktoriyel *= i;

		}
		System.out.println(faktoriyel + "\nisminizi giriniz");

		String isim = sc.nextLine();

		System.out.println("merhaba " + isim);

	}

}
