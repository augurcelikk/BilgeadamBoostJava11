package com.bilgeadam.week02.lecture003;

import java.util.Scanner;

public class Question13 {

	/*
	 * Disaridan taban degeri ve us isimli 2 tane degisken alınacak. (2 uzeri 5
	 * gibi) tabanin kuvvetini hesaplamak istiyorum.
	 * 
	 * kullaniciya ismi sorulacak. Aldigim isim degiskeniyle birlikte sonuccu
	 * yazdiracagim
	 */
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Taban degeri giriniz: ");
		int tabanDegeri = sc.nextInt();
		System.out.println("Ustel degeri giriniz: ");
		int us = sc.nextInt();
		sc.nextLine();

		int i = 1;
		int sonuc = 1;

		while (i <= us) {
			sonuc *= tabanDegeri;
			i++;

		}
		System.out.print("Lutfen isminizi giriniz:  ");
		String isim = sc.nextLine();

		System.out.println(isim + " Girdigin taban: " + tabanDegeri + "Girdigin us: " + us + " sonuc= " + sonuc);

	}

}
