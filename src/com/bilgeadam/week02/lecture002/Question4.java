package com.bilgeadam.week02.lecture002;

public class Question4 {

	/*
	 * İki tane string değişken oluşturalım. İsim ve soyisim olsun. Sonra bu
	 * değişkenleri bir şekilde ekrana yazdıralım
	 * 
	 * a ve b karakterlerinin değerini yazdırın. sonra da karakter değer toplamını
	 * yazdıralım
	 * 
	 */
	public static void main(String[] args) {

		String isim = "Alperen";
		String soyisim = "İkinci";
		String isimSoyisim = "İsim; " + isim + ", soyisim: " + soyisim;

		System.out.println(isimSoyisim);

		// System.out.println("isim: " + isim);
		// System.out.println("soyisim: " + soyisim);
		System.out.println("#######");
		System.out.println("isim: " + isim + "\nsoyisim: " + soyisim);

		int i = 5;
		int j = 7;
		int toplam = i + j;
		int carpim = i * j;

		System.out.println("Toplam: " + toplam + "\n" + carpim);

		System.out.println("###Tab girdisi###");
		System.out.println("isim:\t" + isim + "soyisim:\t" + soyisim);

		// ctrl + shift + 7
		char a = 'a';
		char b = 'b';
		System.out.println("ASCII a: " + (int) a + "\nASCII b: " + (int) b);
		System.out.println(a + b);
		System.out.println('a');
		System.out.println('a' + 'b');

	}

}
