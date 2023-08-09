package com.bilgeadam.week04.lecture002;

public class Question48 {
	// Dizideki elemanlar arasındaki farkın en kücük oldugu deger nedir?
	public static void main(String[] args) {

		int[] array = { 1, 5, -4, 3 };
//
//		int fark;
//		int min = Integer.MAX_VALUE;
//
//		for (int i = 0; i < array.length; i++) {
//
//			for (int j = i + 1; j < array.length; j++) {
//
//				fark = Math.abs(array[i] - array[j]);
//
////				fark = Math.abs(fark);
//
//				if (fark < min) {
//					min = fark;
//				}
//			}
//
//		}
//		System.out.println(min);

		System.out.println(enKucukFark(array));
	}

	private static int enKucukFark(int[] intArray) {
		int fark;
		int min = Integer.MAX_VALUE;

		for (int i = 0; i < intArray.length; i++) {

			for (int j = i + 1; j < intArray.length; j++) {

				fark = Math.abs(intArray[i] - intArray[j]);

				if (fark < min) {
					min = fark;
				}
			}

		}
		return min;

	}
}
