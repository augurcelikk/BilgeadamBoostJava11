package com.bilgeadam.week06.lecture004.polimorphism;

public class HayvanTest {

	public static void main(String[] args) {

		Kedi kedi = new Kedi();
		Kopek kopek = new Kopek();

		kedi.setName("Serafettin");
		System.out.println(kedi.getName());
		kedi.sesCikar();
		kedi.temizlen();

		kopek.setName("Oddie");
		System.out.println(kopek.getName());
		kopek.sesCikar();

	}

}
