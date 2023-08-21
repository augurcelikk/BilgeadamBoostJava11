package com.bilgeadam.week07.lecture001.abstractornek;

import com.bilgeadam.week07.lecture001.abstractornek.entity.Araba;
import com.bilgeadam.week07.lecture001.abstractornek.entity.Motosiklet;

public class Test {

	/**
	 * Tasit superclass'im olacak. Bu sinif abstract bir sinif olacak marka model
	 * maksHiz vites hizlan(); frenYap; vitesDegistir(); ozellikleriGoster();
	 * fieldlari gösterecek akrobatikHareketYap();
	 *
	 * bu tasit sifindan miras alan araba ve motosiklet isimli ikisinif olusturalim
	 */

	public static void main(String[] args) {

		Araba araba = new Araba();
		Araba araba2 = new Araba("BMW", "5.20d", 0, "N");
		Motosiklet motosiklet = new Motosiklet();
		Motosiklet motosiklet2 = new Motosiklet("Kawasaki", "Ninja", 50, "1");

		motosiklet.setMarka("Kawasaki");
		motosiklet.setModel("Ninja");
		motosiklet.setHiz(50);
		motosiklet.setVites("1");

		araba2.ozellikleriGoster();
		System.out.println();
		araba2.vitesDegistir("1");
		araba2.hizlan();
		araba2.hizlan();
		araba2.frenYap();
		araba2.ozellikleriGoster();
		araba2.akrobatikHareketYap();

		System.out.println();
		motosiklet.ozellikleriGoster();
		motosiklet.vitesDegistir("2");
		motosiklet.hizlan();
		motosiklet.hizlan();
		motosiklet.hizlan();
		motosiklet.hizlan();
		motosiklet.akrobatikHareketYap();
		System.out.println();
		motosiklet.ozellikleriGoster();

	}

}
