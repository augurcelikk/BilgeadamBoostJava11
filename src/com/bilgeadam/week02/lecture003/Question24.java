package com.bilgeadam.week02.lecture003;

import java.util.Scanner;

public class Question24 {
	
	/*
	 *  
	 * klavyeden 0 ile 100 arasında (0-100 dahil) 5 adet sayıyı kullanıcıdan alacağım
	 * bu 5 adet sayıdan en büyük ve en kücük olanları yazdıran program
	 */

	public static void main(String[] args) {
		
		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;
		int num;
		int i = 1;
		
		
		Scanner sc = new Scanner(System.in);
		
		while(i <= 5) {
			
		System.out.print("Bir sayı giriniz : ");
		num = sc.nextInt();
		
		if (num >=0  && num <= 100) {
			
			if(num > max) {
				max = num;
			}
			if(num < min) {
				min = num;
			}
			i++;
		}else {
			System.err.println("lütfen 0 ile 100 arasında sayı giriniz");
		}
		
		}
		System.out.println("Max = "+ max);
		System.out.println("Min = "+ min);
	}
}

