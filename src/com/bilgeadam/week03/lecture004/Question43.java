package com.bilgeadam.week03.lecture004;

public class Question43 {
	//Bir metot yazalım ve bu metot dizi içindeki tek elemanları alıp,
	//başka bir diziye atsın ve o diziyi yazdırsın. 
	//int[][] matris = { { 56, 23, 678, 231, 5 }, 
	//{ 234, 21, 78, 26, 6 }, { 654, 33, 32, 67, 2 }, { 189, 35, 56, 89, 8 } };
	
	public static void main(String[] args) {
		
		int[][] matris = { { 56, 23, 678, 231, 5 }, 
							{ 234, 21, 78, 26, 6 }, 
							{ 654, 33, 32, 67, 2 }, 
							{ 189, 35, 56, 89, 8 } };//4x5 lik bir matris bu.
			
//		tekSayilariAta(matris);
			int[] array = tekSayilariAta2(matris);
			yazdir(array);
//			yazdir(tekSayilariAta2(matris));
	}
	public static void tekSayilariAta(int[][] ikiBoyutluArray){
		int [] array = new int[ikiBoyutluArray.length*ikiBoyutluArray[0].length]; 
		int sayac = 0;
		for(int i=0; i<ikiBoyutluArray.length;i++) {
			for(int j=0; j<ikiBoyutluArray[i].length;j++) {
				if(ikiBoyutluArray[i][j] % 2 != 0) {
					
					array[sayac]=ikiBoyutluArray[i][j];
					sayac++;
					
				}
			}
		}
		for(int i=0;i<sayac;i++) {
			System.out.print(array[i]+ " - ");
		}
		

	}
	
	public static int[] tekSayilariAta2(int[][] ikiBoyutluArray) {

			int [] array = new int[ikiBoyutluArray.length*ikiBoyutluArray[0].length]; 
			int sayac = 0;
			for(int i=0; i<ikiBoyutluArray.length;i++) {
				for(int j=0; j<ikiBoyutluArray[i].length;j++) {
					if(ikiBoyutluArray[i][j] % 2 != 0) {
						
						array[sayac]=ikiBoyutluArray[i][j];
						sayac++;

	}
				}
			}
			return array;
		}
	public static void yazdir(int[] patates) {
		for(int i=0;i<patates.length;i++) {
			System.out.print(patates[i]+ " - ");
		}
	}
	
	
	
	/**
	 * 
	 * 4 adet access modifier vardır. Bunlar;
	 * public, private, default, protected.
	 * 
	 * Return type'lar;
	 * void ---boş döner
	 * int ---integer döner
	 * String ---String döner
	 * int[] ---int array döner
	 * 
	 * şu ana kadar calıstıgımız bütün veri tipleri birer return
	 * type olarak kullanılabilir.
	 */

}
