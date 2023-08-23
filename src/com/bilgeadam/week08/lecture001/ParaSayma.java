package com.bilgeadam.week08.lecture001;

import java.util.Stack;

public class ParaSayma {

	/*
	 * bir stack olusturalim. bu stacke 5-6 adet değer ekleyelim. 100tlden yüksek
	 * olanları toplam değerine ekleyelim. kücük olanları ise baska bir stacke
	 * ekleyelim en sonunda toplamı ve yeni olusturdugumuz stacki yazdiralim
	 */

	public static void main(String[] args) {
		Stack<Integer> paralar = new Stack<Integer>();

		int toplam = 0;
		Stack<Integer> yuzTldenKucukParalar = new Stack<Integer>();

		paralar.push(120);
		paralar.push(50);
		paralar.push(170);
		paralar.push(15);
		paralar.push(80);
		paralar.push(200);

		while (!paralar.isEmpty()) {
			if (paralar.peek() > 100) {
				toplam += paralar.pop();
			} else {
				yuzTldenKucukParalar.push(paralar.pop());
			}

		}
		System.out.println("toplam = " + toplam);

		System.out.println(yuzTldenKucukParalar);
		System.out.println();
		for (Integer para : yuzTldenKucukParalar) {

			System.out.println(para);
		}
		System.out.println();
		yuzTldenKucukParalar.forEach(System.out::println);
	}
}
