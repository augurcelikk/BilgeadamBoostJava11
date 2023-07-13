package com.bilgeadam.week02.lecture003;

public class Question16 {

	/*
	 * 1 den 100 e kadar olan cift sayıların toplamının tek sayılara oranı
	 */
	public static void main(String[] args) {

		double ciftToplam = 0;
		double tekToplam = 0;
		int i = 1;

		for (i = 1; i <= 100; i++) {

			if (i % 2 == 0) {
				ciftToplam += i;
			} else {
				tekToplam += i;
			}

		}
		double oran = ciftToplam / tekToplam;
		System.out.println(oran);
	}

}
