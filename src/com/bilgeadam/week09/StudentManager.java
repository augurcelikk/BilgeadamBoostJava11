package com.bilgeadam.week09;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * 
 * 1-Not ortalaması hesaplayan stream yapisini kuralim Her ogrenci icin ayri
 * hesaplayıp ortalamaNotlar isimli bir double liste saklayabilriiz bir de sinif
 * ortalamamız olsun
 * 
 * 2-/ODEV: ogrencileri bolumlerine gore mapleyen bir metot yazalim. ciktisini
 * da metot icerisine alalim. void donse de olur.
 */

public class StudentManager {

	public StudentManager() {
		baslangicVerisiOlustur();
	}

	List<Student> ogrenciler;

	public void baslangicVerisiOlustur() {

//		ogrenciler = List.of(
//				new Student(1,"Alperen","MF"),
//				new Student(2,"Mahmut","TM"));

		ogrenciler = new ArrayList<Student>();
		Student student = new Student(1, "Alperen", "MF");
		student.getNotlar().add(90.0);
		student.getNotlar().add(95D);
		student.getNotlar().add(100.0);

		Student student2 = new Student(2, "Mahmut", "TM");
		student2.getNotlar().add(50.0);
		student2.getNotlar().add(65.0);
		student2.getNotlar().add(90.0);

		Student student3 = new Student(3, "Fatma", "MF");
		student3.getNotlar().add(75.0);
		student3.getNotlar().add(50.0);
		student3.getNotlar().add(83.0);

		Student student4 = new Student(4, "Ali", "MF");
		student4.getNotlar().add(85.0);
		student4.getNotlar().add(85.0);
		student4.getNotlar().add(100.0);

		Student student5 = new Student(5, "Ayse", "TM");
		student5.getNotlar().add(45.0);
		student5.getNotlar().add(40.0);
		student5.getNotlar().add(40.0);

		Student student6 = new Student(6, "Alican", "TM");
		student6.getNotlar().add(90.0);
		student6.getNotlar().add(90.0);
		student6.getNotlar().add(100.0);

		// Ogrencileri ogrenci listesine ekleme yontem 1;
//		ogrenciler.add(student);
//		ogrenciler.add(student2);
//		ogrenciler.add(student3);
//		ogrenciler.add(student4);
//		ogrenciler.add(student5);
//		ogrenciler.add(student6);

		// Ogrencileri ogrenci listesine ekleme yontem 2;
		ogrenciler = List.of(student, student2, student3, student4, student5, student6);

	}

	public void ortalamaHesaplama() {

		List<Double> notlar = new ArrayList<Double>();
//		notlar = ogrenciler.stream()
//				.map((ogrenci) -> ogrenci.getNotlar().stream().collect(Collectors.averagingDouble(z -> z)))// /= gibi
//																											// dusun
//																											// z->z
//																											// olayını
//				.collect(Collectors.toList());
//
//		notlar.forEach(System.out::println);

//		ogrenciler.stream().forEach((ogrenci) -> {
//			System.out.println(ogrenci.getNotlar().stream().collect(Collectors.averagingDouble((z) -> z)));
//		});
//		
//		ogrenciler.stream().forEach((ogrenci) -> {
//			notlar.add(ogrenci.getNotlar().stream().collect(Collectors.averagingDouble((z) -> z)));//(Double::doubleValue) diyebilirdik. tek tek ne döneceğini belirtmek lazım
//		});
//
//		notlar.forEach(System.out::println);
//3.yontem
//		ogrenciler.stream().forEach((ogrenci) -> System.out.println(ogrenci.notOrtHesapla()));
//		notlar = ogrenciler.stream().map((ogrenci) -> ogrenci.notOrtHesapla()).collect(Collectors.toList());
//		notlar.forEach(System.out::println);

		Double ort = ogrenciler.stream().map((ogrenci) -> ogrenci.notOrtHesapla()).collect(Collectors.toList()).stream()
				.mapToDouble(Double::doubleValue).average().orElse(0.0);

//		for(int i=0;i<3;i++) {
//			//notlar icin 3 dedik,burda islemler olcak 
//			
//			for(int j=0;j<6;j++) {					Aslinda boyle bişey yaptıgımız seyler
//				//bu da 6 ogrenciden her birini dondugumuz yer
//			}
//		}
		System.out.println("Ortalama1 : " + ort);

		Double ort2 = ogrenciler.stream().map((ogrenci) -> ogrenci.notOrtHesapla())
				.collect(Collectors.averagingDouble(Double::doubleValue));
		System.out.println("ortalama2 : " + ort2);

		Double ort3 = ogrenciler.stream().collect(Collectors.averagingDouble(
				(z) -> z.getNotlar().stream().collect(Collectors.averagingDouble(Double::doubleValue))));
		System.out.println("Ortalama3: " + ort3);
	}
}
