package com.bilgeadam.week10.lecture002;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
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
	 * 4- Dosyadan veri okumak için bir metot yazalim
	 * 5- Harfdegistir metodunu yazailim. bu metot bir string parametre alsin,
	 * içerisindeki harfi istenilen harf ile değiştirip dosyaya kaydetsin.
	 * 6- Dosya silmek için bir metot yazalim
	 */
	
	public static void main(String[] args) {
		FileIslemler fileIslemler = new FileIslemler();
		fileIslemler.dosyaYarat();
//		fileIslemler.dosyayaVeriEkle("Merhaba Dunya!");
//		String tumMetin = fileIslemler.dosyadanVeriOkuma();
//		fileIslemler.harfDegistir(tumMetin);
//		fileIslemler.dosyadanVeriOkuma();
		fileIslemler.dosyaSil(FileSabitler.file);
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
	
	public String dosyadanVeriOkuma() {
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
		return tumMetin;
		
	}

	public void harfDegistir(String metin) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Lutfen degistirmek istediginiz harfi giriniz : ");
		char eskiHarf = scanner.nextLine().charAt(0);
		System.out.print("Lutfen yeni harfi giriniz : ");
		char yeniHarf = scanner.nextLine().charAt(0);
		metin = metin.replace(eskiHarf, yeniHarf);
		dosyayaVeriEkle(metin);
		
	}
	
	public void dosyaSil(File file) {
		if(file.exists()) {
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
				e.printStackTrace();
			} 			
			file.delete();
				System.out.println(file.getName() + " adli dosya silindi...");
			}else {
				System.out.println("silinecek dosya bulunamadı");
			}
		
		}
	
	}




