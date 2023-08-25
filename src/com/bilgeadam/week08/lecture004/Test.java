package com.bilgeadam.week08.lecture004;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Test {

	public static void main(String[] args) {
		SansliNumaralar sansliNumaralar = new SansliNumaralar();
		sansliNumaralar.mapOlustur();
		sansliNumaralar.listeOlustur();

		sansliNumaralar.sayilarListesi.forEach(System.out::println);
//		sansliNumaralar.sayilarMap.forEach((k, v) -> System.out.println(k + " " + v));

//		sansliNumaralar.sansliNumaralar.forEach(System.out::println); 

		sansliNumaralar.sansliNumaralariBul();
		int i = 1;
		for (Integer sansliNumara : sansliNumaralar.sansliNumaralar) {
			System.out.println(i + " . sansli numaramiz : " + sansliNumara);
			i++;
		}
		System.out.println("50 den büyük olan sansli numaralar : ");// stream ile getirin
		sansliNumaralar.sansliNumaralar.stream().filter((number) -> number > 50).forEach(System.out::println);
		System.out.println("50 den buyuk olan sayilarin yeni bir listede toplanmasi");
		List<Integer> list = sansliNumaralar.sansliNumaralar.stream().filter((number) -> number > 50)
				.collect(Collectors.toList());

		System.out.println("Sansli sayilarin toplami : "); // Stream ile getirin.

		System.out.println(sansliNumaralar.sansliNumaralar.stream().reduce((x, y) -> x + y));

		Optional<Integer> toplam = sansliNumaralar.sansliNumaralar.stream().reduce((x, y) -> x + y);

		System.out.println("50 den büyük sayilarin toplamini bir toplam2 degiskenine esitleyip yazdiralim");

		Optional<Integer> toplam2 = sansliNumaralar.sansliNumaralar.stream().filter((x) -> x > 50)
				.reduce((x, y) -> x + y);
		System.out.println(toplam2);// toplam.get() diyerek optionaldan kurtulmak mümkün

		sansliNumaralar.sansliNumaralar.stream().filter((x) -> x > 50).reduce((x, y) -> x + y)
				.ifPresent(System.out::println);

//		toplam2.ifPresent(System.out::println);

		// Optional metotlari

		Integer toplam3 = toplam2.get();
		Optional<String> kelime = Optional.empty();
//		String kelime2 = kelime.get(); //NoSuchElementException
		Optional<String> kelime3 = kelime;
		System.out.println(kelime3);

		Optional<String> kelime4 = Optional.ofNullable(null);
		System.out.println(kelime4);

		Optional<String> kelime5 = Optional.of("Merhaba Dunya");
		System.out.println(kelime5.get());

		System.out.println(kelime4.isEmpty());// isEmpty isPresent
		System.out.println(kelime4.isPresent());// cok kullanilir

	}

}
