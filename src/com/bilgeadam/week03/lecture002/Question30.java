package com.bilgeadam.week03.lecture002;

import java.util.Scanner;

public class Question30 {
	
	/*
	 * Dışarıdan bir ıban değeri girelim TR 1001005001 ,TR 1001005002 veya OTH
	 * 2002002000 gibi daha sonra bu değerleri kontrol edelim eğer Tr ile başlıyorsa
	 * yurt içi işlemler yazsın ve Eğer 5001 ile Bitiyorsa Ziraat 5002 ile bitiyorsa
	 * Garanti 5003 ile bitiyorsa İş bankası yazdırsın eğer OTH ise Yurt dışı
	 * işlemler yazdıralım 2000 ile bitiyorsa kıta içi işelmeler ve OTH yerine 
	 * Ki 200200… değilse kıta dışı işlemler yazsın ve OTH yerine Kd 200201…
	 *  
	 */
	public static void main(String[] args) {
	
		String iban;
		System.out.println("Bir iban değeri giriniz: ");
		Scanner sc = new Scanner(System.in);
		iban = sc.nextLine();
		iban = iban.toUpperCase();
		
		if(iban.startsWith("TR")) {
			System.out.println("Yurtici islemler");
			 {
				
			}
			
		}else if(iban.startsWith("OTH")){
			System.out.println("Yurtdısı islemler");
			
			
		}
		
	}

}
