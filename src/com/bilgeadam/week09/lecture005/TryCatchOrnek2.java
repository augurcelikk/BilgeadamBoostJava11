package com.bilgeadam.week09.lecture005;

import java.time.LocalDate;
import java.util.InputMismatchException;
import java.util.Scanner;

public class TryCatchOrnek2 {

	/**
	 * 
	 * 1- Bir metot ile disraidan bir index degeri alalim.
	 * Sonra o indexteki değeri yazdiralim. Hata var ise bu hatayi da try-catch ile yakalayalim.
	 * 
	 * 2- Array içinde gezelim, sayisal degerleri integer'a cevirip bir toplama islemi yapalim
	 * toplam degerim array içerisindeki butun int degelerin toplami olsun
	 *  Bir de alacagim hatalarin sayisini yazdirmak istiyorum.
	 * @throws Exception 
	 */
	public static void main(String[] args){
		String[] array = {"a","10","bc",null,"20"};
//		indexAl(array);
//		toplam(array);
//		LocalDate date  = Utility.stringTarihAlma();
//		System.out.println(date);
		String nullDeger = null;
		String deger = "a";
//		nullCheck(nullDeger);
//		System.out.println(nullCheck(deger));
//		System.out.println(nullCheck2(deger));
//		nullCheck2(nullDeger);
		System.out.println(nullCheck3(deger));
		nullCheck3(nullDeger);
	
		
	}
	
	public static void indexAl(String[] array) {
		
		try {
			Scanner sc = new Scanner(System.in);
			System.out.print("Lutfen index numarasi giriniz : ");
			int index = sc.nextInt();
			String deger = array[index];
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Lutfen girdiginiz index degeri 0-4 arasinda olsun.");
			System.out.println(e.toString());
			
		}catch (InputMismatchException e) {
			System.out.println("Lutfen sadece bir tamsayi degeri giriniz");
			System.out.println(e.toString());
		}
		
	}
	
	public static  void toplam(String[] array) {
		int toplam =0;
		int sayac = 0;
		for(String string : array) {
			try {
				int deger = Integer.parseInt(string);
				toplam +=deger;
			} catch (NumberFormatException e) {
				System.out.println(e.toString());
				sayac++;
			}finally {
				System.out.println("Finally : " + string);
			}
			
		}
		System.out.println("Toplam = " + toplam);
		System.out.println("Hata sayisi = " + sayac);
				
	}
	
	
	
	
	//unchecked exception
	private static String nullCheck(String deger) {
		if(deger==null) {
			throw new NullPointerException("Null deger olamaz");
		}
		return deger;
	}
	//checked exception
	private static String nullCheck2(String deger)throws Exception{
		if(deger==null) {
			throw new Exception("Null deger olamaz");
	}
		return deger;
	}
	
	//unchecked exception
	private static String nullCheck3(String deger)throws NullPointerException{
		if(deger==null) {
			throw new NullPointerException("Null deger olamaz");
	}
		return deger;
	}
}
