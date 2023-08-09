package com.bilgeadam.week03.lecture003;

public class Question40 {
	/*
	 * Bir başlangıç ve bitiş değeri arasında ki sıralı sayılardan eğer sayı 3'ün katı ise
	 * ise bilge, 5 in katı ise adam hem 3'ün ve hem de 5'in katı ise bilgeadam yazdıralım. int start=2; int
	 * end=22;
	 * 
	 * 
	 */

	public static void main(String[] args) {

		int start = 2;
		int end = 22;
		
//	    for (int i = start; i <= end; i++) {
//	    	String output = "";
//
//	            if (i % 3 == 0 && i % 5 == 0) {
//	                output += "bilgeadam";
//	            }
//	            else if (i % 3 == 0) {
//	                output += "bilge";
//	            }else if (i % 5 == 0) {
//	                output += "adam";
//	            } else {
//	                System.out.println(i);
//	            }
//	            System.out.println("\t"+"\t"+output);
//	        }
		
		String[] array = new String[end-start+1];
		
		for (int i=0; i<array.length;i++) {
			int sayi = i + start;
			
			if(sayi % 15 == 0) {
				array[i] = "BilgeAdam";
			}else if(sayi % 5 == 0) {
				array[i] = "Adam";
				
			}else if(sayi % 3 == 0) {
				array[i] = "Bilge";
			}else {
			array[i] = "" + sayi;
			}
			for(int j=0;j<array.length;j++) {
				if(j==array.length-1) {
					System.out.println(array[j]);
				}else {
					System.out.println(array[j]+",");
				}
			}
		}

	}
}
