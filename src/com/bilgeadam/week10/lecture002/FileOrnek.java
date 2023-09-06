package com.bilgeadam.week10.lecture002;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOrnek {

	public static void main(String[] args) {
		//C:\Users\augur\OneDrive\Masaüstü\BoostJava11\Eclips Workspace

		//Output ->> Yazma islemi
		//Input ->> Okuma islemi
		
		try {
			FileOutputStream fos = new FileOutputStream("C:\\Users\\augur\\OneDrive\\Masaüstü\\BoostJava11\\Eclips Workspace\\000_BilgeadamBoostJava11\\deneme2.txt");
			FileInputStream fis = new FileInputStream("C:\\Users\\augur\\\\OneDrive\\Masaüstü\\BoostJava11\\Eclips Workspace\\000_BilgeadamBoostJava11\\deneme2.txt");
			byte[] array = {101, 80, 88};
			String kelime = "Merhaba Dunya!";
			
			try {
//				fos.write(65);
//				fos.write(array);
				fos.write(kelime.getBytes());
//				System.out.println((char)fis.read());
//				System.out.println((char)fis.read());
//				System.out.println((char)fis.read());
//				System.out.println((char)fis.read());
//				System.out.println((char)fis.read());
//				System.out.println((char)fis.read());
//				System.out.println((char)fis.read());
//				System.out.println((char)fis.read());
//				System.out.println((char)fis.read());
//				System.out.println((char)fis.read());
//				System.out.println((char)fis.read());
//				System.out.println((char)fis.read());
//				System.out.println((char)fis.read());
//				System.out.println((char)fis.read());

				int deger;
				while((deger = fis.read()) != -1){
					System.out.println((char) deger);
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
