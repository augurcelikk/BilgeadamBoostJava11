package com.bilgeadam.week02.lecture003;

import java.util.Scanner;

public class Question23 {
	
	/*
	 * dısaridan sayı al, mukemmelse mukemmel yaz, degilse degil yaz
	 */

	public static void main(String[] args) {
		
		int sayi;
		int toplam = 0;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Bir sayı giriniz : ");
		sayi = sc.nextInt();
		
		for(int i=1; i<=(sayi/2); i++) {
			
			if(sayi % i == 0) {
				toplam+=i;
			}
		}
		if (toplam == sayi) {
		System.out.println("sayi mükemmel sayıdır");
		} else {
			System.out.println("sayi mükemmel sayi degildir");
		}
	}

}
