package com.bilgeadam.week03.lecture001;

public class Question28 {

	public static void main(String[] args) {
		/**
		 * 
		 * =Java,React,Spring
		 * 
		 * split kullanmadan virgülden bölüp
		 * 
		 * bir for döngüsü içinde Java React Spring
		 * 
		 *
		 */

			String deger = "Java,React,Spring";

			
			for(int i=0; i<=deger.length()-1; i++) {
				
				if(deger.charAt(i) == ',') {
					System.out.println();					
				}else
				System.out.print(deger.charAt(i));
				
			}
				System.out.println();
				System.out.println("---------------");
//			System.out.println("Java");
//			System.out.println("React");
//			System.out.println("Spring");
			
			
			int index = 0;
			for(int j =0; j<deger.length(); j++) {
				
				if(deger.charAt(j) == ',' ) {
					System.out.println(deger.substring(index, j));
					index = j+1;
				}
			}
			System.out.println(deger.substring(index));
			
			System.out.println("//////////////////////////////");
			
			for(int k = 0; k<deger.length(); k++) {
				
				if(deger.charAt(k) == ',') {
					System.err.println();
			}else {
				System.out.print(deger.charAt(k));
			}
			
	}
				System.out.println();
				System.out.println("///////////////////");
			
			deger = deger.replace(",", "\n");
			System.out.println(deger);
									
}
}