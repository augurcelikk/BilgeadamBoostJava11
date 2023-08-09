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
		boolean z= true;
		int secim;
		
		do {
			System.out.println("*Menü*");
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
				System.out.print("Lütfen bir kelime giriniz: ");
				kelime = sc.nextLine();
				kelime = kelime.toLowerCase();
				System.out.print("Degistirmek istediginiz harfi giriniz: ");
				String ilkHarf = sc.nextLine();
				System.out.println("Yerine koymak istediginiz harfi giriniz: ");
				String sonHarf=sc.nextLine();
				kelime = kelime.replace(ilkHarf, sonHarf);
				System.out.println(kelime);
				break;
			case 3:
				System.out.print("Ters girilcek ismi giriniz: ");
				String isim = sc.nextLine();
//				boolean isPalindrome = true;
				String tersisim = "";
				for (int i = isim.length() - 1; i >= 0; i--) {
					tersisim += isim.toLowerCase().charAt(i);
				}
				if (isim.toLowerCase().equals(tersisim)) {
					System.out.println("Bu kelime bir polindromdur." + tersisim + " <- tersten yazılış şekli");
				} else {
					System.out.println("Bu kelime bir polindrom değildir." + tersisim + " <- tersten yazılış şekli");
				}
				break;
//				while (left < right) {
//					if (kelime.charAt(left) != kelime.charAt(right)) {
//						isPalindrome = false;
//					}
//					left++;
//					right--;
//				}
//				if (isPalindrome) {
//					System.out.println("Palindromdur!");
//				} else {
//					System.out.println("Palindrom değildir!");
//				}
				
			case 4:
				int a=0,b=0,c=0,d=0, toplam = 0;
				System.out.println("\nSayfa açma");
				System.out.println("Lütfen 5 adet gelime giriniz: ");
				for(int i = 0; i<5;i++) {
					System.out.println((i+1) + ". kelimeyi giriniz: ");
					kelime=sc.nextLine();
					
					if(kelime.charAt(0)=='a') {
						a=1;
					}else if(kelime.charAt(0)== 'b') {
						b = 1;
					}else if(kelime.charAt(0)=='c') {
						c=1;
					}else {
						d+=1;
					}
					toplam = a+b+c+d;
					System.out.println("Toplam dosya sayısı: "+ toplam);
				}
				
				
				
			case 0:
				z=false;
				default:
					System.out.println("UYGULAMA KAPATILDI");
					break;
				
					
				}	
		}while(z);
		
	}

}
