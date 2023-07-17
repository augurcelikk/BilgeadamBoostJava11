package com.bilgeadam.week02.lecture003;

import java.util.Scanner;

public class Question27_Odev {
	/*
	 * Dışarıdan bir değer alacağız, bu aldığımız değerin içerisinde 
	 * kaç tane "a" harfi olduğunu bize döndürecek bir program.
	 */
	
	
	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Bir değer giriniz: ");
		String deger = sc.nextLine();
		
		String kucuk = deger.toLowerCase();
		int j = 0;
		for(int i = 0; i<=kucuk.length()-1;i++) {
			
			if(kucuk.charAt(i) == 'a'){
				j++;		
			}else {
			
			}
			
		}
		System.out.println(j);
		
	
	}

}
