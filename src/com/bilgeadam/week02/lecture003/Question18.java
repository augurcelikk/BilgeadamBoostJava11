package com.bilgeadam.week02.lecture003;

import java.util.Scanner;

public class Question18 {

	/*
	 * telefon kodu ve e mail kodu tanımlayacagız
	 * 
	 * kullanıcıdan e mail ve telefon kodu girmesini isteyeceğiz
	 * 
	 * hem sms e mail hatalıysa bir çıktı sms doğru e mail hatalıysa bir cktı e mail
	 * doğru sms yanlıssa bir ikisi dde doğruysa bir cıktı
	 * 
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

		if (smsCode != smsInput && emailCode != emailInput) {
			System.out.println("Sms kodunuz ve e-mail kodunuz yanlış ");
		} else if (smsCode != smsInput && emailCode == emailInput) {
			System.out.println("Email kodunuz doğru, Sms yanlıs ");
		} else if (smsCode == smsInput && emailCode != emailInput) {
			System.out.println("sms kodunuz doğru, email yanlıs");
		} else {
			System.out.println("Basariyla giris yaptınız");
		}
		sc.close();

	}

}
