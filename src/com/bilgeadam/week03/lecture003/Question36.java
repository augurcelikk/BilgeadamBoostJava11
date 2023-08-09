package com.bilgeadam.week03.lecture003;

public class Question36 {
	
	// dizideki bütün sayıların toplamını yazdıralım.
		// dizinin her bir elemanı için;
			//çift ise çifttir, tek ise tektir yazdıralım.

	//0, 120, 5, 85, -256, 16, 1258, 81, 14

	public static void main(String[] args) {
		
		
		int toplam = 0;
		int[] sayilar = {0, 120, 5, 85, -256, 16, 1258, 81, 14};
		
		for(int i=0;i<sayilar.length;i++) {
			
			if (sayilar[i] % 2 == 0) {
				System.out.println((i+1) + ". eleman çifttir.");
			}else {
				System.out.println((i+1) + ". eleman tektir.");	
			}
			toplam += sayilar[i];
		}
		System.out.println("Sayıların toplam değeri: " + toplam);
		
	}

}
