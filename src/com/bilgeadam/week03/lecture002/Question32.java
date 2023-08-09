package com.bilgeadam.week03.lecture002;

import java.util.Scanner;

public class Question32 {
	
	/**
	 * Dısaridan girilen ülke ismi bizim array'imizde bulunuyor mu?Kontrol edelim.
	 * 
	 * Türkiye, Japonya, Moğolistan, Amerika, Rusya, Çin
	 */
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String[] ulkeler  = {"Türkiye", "Japonya", "Moğolistan", "Amerika", "Rusya", "Çin"};
		System.out.print("Ülke adını giriniz: ");
		String ulke = sc.nextLine();
		for(int i=0; i<ulkeler.length;i++) {
			if(ulkeler[i].equalsIgnoreCase(ulke)) {
				System.out.println("Girdiğiniz ülke dizimizde bulunuyor.");
				break;
			}else if(i == ulkeler.length-1){
				System.err.println("Bulunmuyor");
			}
		}
		sc.close();
	}

}
