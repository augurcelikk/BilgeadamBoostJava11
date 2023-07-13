package com.bilgeadam.week02.lecture002;

import java.util.Scanner;

public class Question6 {

	/*
	 * Dairenin alanı ve çevresini bulalım. yarı çap dışarıdan input olarak
	 * girilecek pi =3.14
	 */

	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		System.out.print("Lutfen yarıcap degeri giriniz: ");
//		//double yaricap = sc.nextDouble();
//		//double alan = yaricap * yaricap * 3.14;
//		//double cevre = yaricap * 2 * 3.14;
//		System.out.println("Alan: " + alan + "\nCevre: " + cevre);

		Scanner scanner = new Scanner(System.in);
		double pi = 3.14;
		System.out.println("Lutfen yaricapi giriniz:");
		double yaricap = scanner.nextFloat();

		double alan = pi * yaricap * yaricap;
		double cevre = 2 * pi * yaricap;

		System.out.println("Alan = " + alan + "\nCevre" + cevre);
		scanner.close();

	}

}
