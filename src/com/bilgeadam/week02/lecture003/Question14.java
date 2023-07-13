package com.bilgeadam.week02.lecture003;

public class Question14 {

	/*
	 * a dan z ye alfabeyi yazdıralım.
	 */
	public static void main(String[] args) {

//		for (int i = 97; i <= 122; i++) {
//			System.out.println((char) i);

//		for (char i = 'a'; i <= 'z'; i++) {
//			System.out.print(i + " ");
//		}

		char degisken = 'a';

		do {

			System.out.print(degisken + " ");
			degisken++;

		} while (degisken <= 'z');

	}

}
