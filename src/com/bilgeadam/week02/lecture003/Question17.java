package com.bilgeadam.week02.lecture003;

import java.util.Scanner;

public class Question17 {

	/*
	 * telefon kodu ve e mail kodu tanımlayacagız
	 * 
	 * kullanıcıdan e mail ve telefon kodu girmesini isteyeceğiz
	 * 
	 * girilen e mail hatalıysa "girdiginiz e mail hatalıdır girilen sms hatalıysa
	 * "girdiginiz sms hatalıdır.
	 * 
	 */

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int smsCode = 444;
		int smsInput;
		int emailCode = 555;
		int emailInput;

		System.out.println("Lutfen sms kodunuzu giriniz: ");
		smsInput = sc.nextInt();
		System.out.println("Lutfen email kodunuzu giriniz: ");
		emailInput = sc.nextInt();

		if (smsCode != smsInput) {
			System.out.println("Sms kodunuz yanlış ");
		}
		if (emailCode != emailInput) {
			System.out.println("Email kodunuz yanlış ");
		}
		if (smsCode == smsInput && emailCode == emailInput) {
			System.out.println("Basariyla giris yaptiniz");
		}
		sc.close();
	}
}