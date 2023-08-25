package com.bilgeadam.week08.lecture004;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeSet;

public class SansliNumaralar {

	/*
	 * 1 ile 100 arasinda rastgele 10.000 adet sayı üretecegiz.
	 * 
	 * 1- sayiOlustur metodu ile rastgele olusturdugumuz sayileri bir mape
	 * aktaracağiz sayinin kac kere tekrar ettigini tutacağiz. key = sayi, value =
	 * tekrar sayisi
	 * 
	 * 2- mapte gezinirken listeye ekleme yapacağiz. her elememan ne kadar tekrar
	 * ediyor ise o kadar kez listeye eklenecek
	 * 
	 * 3- En son olusturdugumuz listeden rastgele 10 adet deger alacagiz ve bu
	 * aldigimiz degerleri bir sete ekleyecegiz. Bu isleme gecmeden once listemizi
	 * karistiralim. Collections.shuffle(); sansliNumaralariBul();
	 * 
	 */

	static final int maxSayi = 100;
	static final int uretilenSayiMiktari = 10_000;
	Map<Integer, Integer> sayilarMap = new HashMap<Integer, Integer>();
	List<Integer> sayilarListesi = new ArrayList<Integer>();
	Set<Integer> sansliNumaralar = new TreeSet<Integer>();

	private int sayiOlustur() {
		return Utility.randomSayiUret(1, maxSayi + 1);
	}

	public void mapOlustur() {
		for (int i = 0; i < uretilenSayiMiktari; i++) {
			int sayi = sayiOlustur();
			if (sayilarMap.containsKey(sayi)) {
				sayilarMap.put(sayi, sayilarMap.get(sayi) + 1);
			} else {
				sayilarMap.put(sayi, 1);
			}
		}
	}

	public void listeOlustur() {

		for (Entry<Integer, Integer> sayi : sayilarMap.entrySet()) {

			for (int i = 0; i < sayi.getValue(); i++) {
				sayilarListesi.add(sayi.getKey());
			}
		}

	}

	public void listeKaristir(List<Integer> liste) {
		Collections.shuffle(liste);
	}

	public void degerAlma(int deger) {

		for (int i = 0; i < deger; i++) {
			sansliNumaralar.add(sayilarListesi.get(Utility.randomSayiUret(0, uretilenSayiMiktari + 1)));
		}
	}

	public void sansliNumaralariBul() {
		Collections.shuffle(sayilarListesi);

		while (sansliNumaralar.size() < 10) {
			int index = Utility.randomSayiUret(0, sayilarListesi.size());
			sansliNumaralar.add(sayilarListesi.get(index));
			sayilarListesi.remove(index);
		}
	}

}
