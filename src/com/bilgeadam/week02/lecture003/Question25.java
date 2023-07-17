package com.bilgeadam.week02.lecture003;

public class Question25 {

	public static void main(String[] args) {
	
		String value = " Merhaba Dünya ";
		String value2 = "Merhaba Dünya";
		String value3 = "Merhaba Dünya";
		
		int sayi1= 1;
		int sayi2= 1;
		
		System.out.println(value.charAt(2));
		System.out.println(value.trim());
		System.out.println(value.length());
		System.out.println(value.indexOf("a"));
		System.out.println(value.lastIndexOf("a"));
		System.out.println(value.substring(5));
		System.out.println(value.substring(0, 5));
		System.out.println(value.equals(value2));// value, value 2 ye esit midir sorusu
		System.out.println(value == " Merhaba Dünya ");
		System.out.println(value.trim() == value2);// ramdeki yerleri aynı mı diye bakıyo ondan false oluyor.
		System.out.println(value2.equals(value3));
		System.out.println(sayi1 == sayi2);// ilkel veri tipi, zaten ramdeki referans değeri aynı. o yuzden oluyo.
		//  " == " referans değerine bakarak karşılaştırıyor. primitivde sorun yok ama diğerlerinde sorun.
		System.out.println("^^^^#############^^^^");
		System.out.println(value.trim().equals(value2));
		System.out.println(value2 == value3);
		
		
	}	

}
