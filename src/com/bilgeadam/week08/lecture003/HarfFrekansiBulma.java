package com.bilgeadam.week08.lecture003;

import java.util.LinkedHashMap;
import java.util.Map;

public class HarfFrekansiBulma {

	/*
	 * 
	 * Utility sınfını kullanarak disaridan bir string deger alalim bu kelimeyi bir
	 * map içerisinde işleyeceğiz.(Sirali bir sekilde)
	 * 
	 * String kelime = "merhaba";
	 * 
	 * m=1; e=1; r=1; h=1; a=2; b=1;
	 * 
	 * ciktimiz bu sekilde olmali...
	 */

	public static void main(String[] args) {

		String kelime = Utility.stringDegerAlma("Lütfen bir kelime giriniz: ");

		Map<Character, Integer> map = new LinkedHashMap<Character, Integer>();
		for (char c : kelime.toCharArray()) {
			if (map.containsKey(c)) {
				map.replace(c, map.get(c) + 1);
			} else {
				map.put(c, 1);
			}
		}

//		for (Entry<Character, Integer> karakter : map.entrySet()) {
//			System.out.println(karakter.getKey() + " = " + karakter.getValue());
//		}

		map.forEach((x, y) -> System.out.println(x + " " + y));
	}

}
