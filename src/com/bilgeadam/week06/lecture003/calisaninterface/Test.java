package com.bilgeadam.week06.lecture003.calisaninterface;

/**
 * 
 * 
 * 
 * -- Mühendislerimiz olacak
 * 
 * isim soyiisim iş unvani maaşı enz az iki constructr istiyorum (isim soy isim)
 * (isim soyisim maaş)
 * 
 * maaşş zammı metodu olacak
 * 
 * maaş default en az 10000 10000 12000 arası unvan muhendis eger maaşı
 * 12000-17000 arasında ise kıdemlı muhendis 17000den yuksek ise uzman muhendis
 * eğer maaaşı 10000 kucuk ise stajyer ve
 * 
 * zam oranına ek olarak 250tl bonus alacaklar
 * 
 * 
 *
 * -- ofis çalışanları olacak
 * 
 * isim soyiisim iş unvani maaşı
 * 
 * en düşük çalışan maaşı 8000 8000 1200 arası çalışan 12000 den sonraı kidemli
 * calıasan 8000den az ise stajyer
 * 
 * 
 *
 */
public class Test {

	public static void main(String[] args) {

		OfisCalisani ofisCalisani = new OfisCalisani("Alperen", "Ikinci");
		System.out.println(ofisCalisani.getMaas());
		System.out.println(ofisCalisani.getUnvan());
		// 2parametreli constructor, setunvan metodunu calistirmadigi icin nuull
		// döndürüyor.

		OfisCalisani ofisCalisani2 = new OfisCalisani("Muhammet", "Kaya", 10000);
		System.out.println(ofisCalisani2.getMaas());
		System.out.println(ofisCalisani2.getUnvan());
		// 3 parametreli constructor setUnvan metodunu calistirdigi için maas aralıgına
		// gore
		// bir unvan dönduruyor.

		Muhendis muhendis = new Muhendis("Alperen", "Ikinci");
		System.out.println(muhendis.getUnvan());
		System.out.println(muhendis.getMaas());

		Muhendis muhendis2 = new Muhendis("Muhammet", "Kaya", 10000);
		System.out.println(muhendis2.getUnvan());
		System.out.println(muhendis2.getMaas());

		// calisan.getClass().getSimpleName()
		System.out.println(muhendis2.getClass().getSimpleName());

		InsanKaynaklari insanKaynaklari = new InsanKaynaklari("Serli", "Cakir");
		insanKaynaklari.zamYap(muhendis2, 20);
		System.out.println(muhendis2.getMaas());
		insanKaynaklari.zamYap(ofisCalisani2, 10);
		System.out.println(ofisCalisani2.getMaas());

	}
}
