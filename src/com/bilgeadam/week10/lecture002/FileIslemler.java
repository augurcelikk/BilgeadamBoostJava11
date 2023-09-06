package com.bilgeadam.week10.lecture002;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileIslemler {

	/*
	 * 
	 * 0-cikis
	 * 1- dosya yarat
	 * 2- ekle
	 * 3- okuma
	 * 4- harf degistir
	 * 5- dosya silme
	 * Lutfen islem seciniz :
	 * 
	 * 1- fileSabitler sinifinde static bir file yaratalim. bu file'ı butun metotlarimizda kullanacagiz.
	 * 2- dosya yaratmak icin bir metot yazalim. eger dosyamiz dizinde yoksa bu dosyayi yaratsin. eger dizinde varsa
	 * "bu dosya daha once yaratilmistir" gibi bir cikti versin.
	 * 3 - dosyamıza dirasidan aldigimiz bir veriyi ekleyelim. (scanner ile alalım) ve her ekleme yapildiktan sonra bir sonraki ekleme
	 * için alt satira geçis yapilsin.
	 */
	
	public static void main(String[] args) {
		FileIslemler fileIslemler = new FileIslemler();
//		fileIslemler.dosyaYarat();
//		fileIslemler.dosyayaVeriEkle("Merhaba Dunya!");
		fileIslemler.dosyadanVeriOkuma();
		
	}
	
	public void dosyaYarat() {

	try {
		
//		if(FileSabitler.file.createNewFile()) {
		if(!FileSabitler.file.exists()) {
			FileSabitler.file.createNewFile();
			System.out.println(FileSabitler.file.getName() + " basariyla olusturuldu");

			
		}else {
			System.out.println( FileSabitler.file.getAbsolutePath() + " Dosya zaten var...");
		}
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}

	}

	public void dosyayaVeriEkle(String metin) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Metin dosyaya eklenerek mi yazilsin.(E/H) : ");
		boolean kontrol = false;
		if(scanner.nextLine().equalsIgnoreCase("e")) {
			kontrol = true;
		}
		try {
			FileWriter fileWriter = new FileWriter(FileSabitler.file, kontrol);
			BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
			bufferedWriter.write(metin + "\n");
			bufferedWriter.flush();
			
			System.out.println("Veri eklendi -> " + FileSabitler.file.getName());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void dosyadanVeriOkuma() {
		String tumMetin = "";
		try {
			BufferedReader bufferedReader = new BufferedReader(new FileReader(FileSabitler.file));
			String deger = "";
			while((deger = bufferedReader.readLine())!= null) {
				tumMetin += deger + "\n";
			}
				
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println(tumMetin);
		
	}
}



