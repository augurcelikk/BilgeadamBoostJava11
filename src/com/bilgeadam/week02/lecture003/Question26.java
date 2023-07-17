package com.bilgeadam.week02.lecture003;

import java.util.Scanner;

public class Question26 {
	/*
	 * 
	 * 
	 * Dısaşıran bir String girdisi olsun
	 * 
	 * bu stringin her bi charını bulundugu index ile birlikte
	 * yazdıralım. alt alta olsun
	 */
	public static void main(String[] args) {
		
		
		
		Scanner sc = new Scanner(System.in);
		String  isim;
		
		System.out.print("Bir kelime giriniz: ");
		isim = sc.nextLine();
		
		for(int i=0; i<isim.length(); i++) {
			
			System.out.println(i + " "+ isim.charAt(i)); 
		}
		
	
		
		
		
		

	}

}
