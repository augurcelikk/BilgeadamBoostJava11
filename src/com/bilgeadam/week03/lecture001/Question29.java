package com.bilgeadam.week03.lecture001;

import java.util.Scanner;

public class Question29 {
	
	/*
	 * Menu 1-Dışarıdan bir kelime ve bir harf girilsin  eğer kelimemizin için de o 
	 *   harf varsa kaç tane olduğunu ve index numaralarını yazdırın.
	 *   eğer harfi içermiyorsa bir çıktı aradağınız harf yok gibi
	 * 
	 * 
	 * 2-Dışarıdan bir kelime giriniz daha sonra değiştirmek istediğiniz harfi
	 * giriniz daha sonra hangi harfle değiştireceğinizi giriniz Eğer kelimemiz
	 * içerisinde o harf varsa değiştirsin
	 * 
	 *
	 * 3-Dışarıdan Girilen bir kelimeyi ters çevirip yazdıralım.Polindrom olup
	 * olmadığını bulunuz(kek,iki,kabak)
	 * 
	 * 
	 * 4- Dışarıdan 5 adet kelime girelim her kelimede a, b veya c ile başlayıp
	 * başlamadığımızı kontrol etsin (a, b,c ile başlayanlar için ayrı ayrı sayfa
	 * açıldığını düşünün elimizde)  a lar için bir sayfaya b ler  bir sayfaya  cler bir
	 * sayfaya yazılacak gibi düşünelim diğer harfle başlayanlar için ise ayrı bir
	 * sayfa düşünelim girilen 5 adet kelimeyi kontrol ettikten sonra elimizde kaç
	 * sayfa oluğunu ekrana yazdıralım
	 * *
	 */

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		boolean a= true;
		int secim;
		
		do {
			System.out.println("**************************");
			System.out.println("**************************");
			System.out.println("*Yapmak İstediginiz İslem*");
			System.out.println("**************************");
			System.out.println("**************************");
			System.out.println("1- Kac Harf Oldugunu Bul, ");
			System.out.println("2- Harf Degistirme islemi");
			System.out.println("3- Ters Cevirme");
			System.out.println("4- a,b,c olup olmadıgına bak");
			System.out.println("0- CIKIS");
			System.out.println();
			System.out.println("Lütfen seçiminizi yapınız: ");
			secim = sc.nextInt();
			sc.nextLine();
			
			switch(secim) {
			case 1:
				String kelime;
				System.out.println("Bir kelime giriniriz: ");
				kelime = sc.nextLine(); 
				String harf;
				System.out.println("Bir harf giriniz");
				harf=sc.nextLine();
				
				int j=0;
				for(int i=0; i<kelime.length(); i++) {
					if(kelime.charAt(i) == harf.charAt(0)) {
						j++;
						 
					}else {
						
					}
				}
				System.out.println("Eşit olduğu index: " + "toplamda " + j +" eşleşme bulundu.");
				break;
				
			case 2:
				System.out.print("Lütfen bir kelime giriniz");
				kelime = sc.nextLine();
				System.out.print("Degistirmek istediginiz harfi giriniz: ");
				String ilkHarf = sc.nextLine();
				System.out.println("Yerine koymak istediginiz harfi giriniz: ");
				String sonHarf=sc.nextLine();
				kelime = kelime.replace(ilkHarf, sonHarf);
				System.out.println(kelime);
			case 3:
				System.out.print("Lütfen bir kelime giriniz");
				kelime = sc.nextLine();
				String yeniKelime;
				int k,l;
				for(k=0; k<kelime.length(); k++) {
				l = kelime.length()-1;
				yeniKelime =; 
						l--;		
				}
				System.out.println(yeniKelime);
				if(yeniKelime == kelime) {
					System.out.println("Bu kelime bir polindromdur.");
				}else {
					System.out.println("kelimeniz polindrom degildir.");
				}
			}	
				
			
		}while(a);
		
	}

}
