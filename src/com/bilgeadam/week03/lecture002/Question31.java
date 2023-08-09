package com.bilgeadam.week03.lecture002;

public class Question31 {

	public static void main(String[] args) {
		/*
		 * Arraylerin boyutu sabit
		 * outOfBounds
		 * NullPointerException
		 */
		
		String[] stringArray = new String[4];
		System.out.println(stringArray.length);
		String[] stringArray2 = {"Kelime","Kelime2"};
		System.out.println(stringArray2.length);
		System.out.println(stringArray2[0]);
//		String stringArray3[] = new String[3];
		boolean[] booleanArray = new boolean[3];//true,false,false ->> 1<10,2>5,...
		booleanArray[booleanArray.length-1] = 1<10;
		System.out.println(booleanArray[booleanArray.length-1]);
		
		boolean[] booleanArray2 = {1<=10,'a' == 'b',false};
		System.out.println(booleanArray2[1]);
		
		System.out.println(booleanArray2.length);
		//System.out.println(booleanArray2[3]); //java.lang.ArrayIndexOutOfBoundsException:Index 3 out of bounds for length 3
		
		int[] integerPrimitiveArray = new int[3];
		integerPrimitiveArray[1]=3;
		System.out.println(integerPrimitiveArray[0]);
		Integer[] integerWrapperArray = new Integer[2];
		//wrapper classlar ile primitive türler arasındaki ilişki ve farklar...arastir.
		
		
	}

}
