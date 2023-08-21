package com.bilgeadam.week05.lecture003.copy;

public class StaticOrnek {

	int number = 0;// nesne degiskeni
	static int number2 = 0; // sınıf degiskeni

	public static void main(String[] args) {

		StaticOrnek staticOrnek = new StaticOrnek();
		staticOrnek.numaraVer();
		staticOrnek.numaraVer();
		staticOrnek = new StaticOrnek();
		staticOrnek.numaraVer();
		StaticOrnek staticOrnek2 = new StaticOrnek();
		System.out.println(staticOrnek2.number + "  " + staticOrnek2.number2);
	}

	public void numaraVer() {
		number += 1;
		number2 += 1;

		System.out.println("num1 " + number);
		System.out.println("num2 " + number2);
	}

}
