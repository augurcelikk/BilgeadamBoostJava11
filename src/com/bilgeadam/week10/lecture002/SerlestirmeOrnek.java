package com.bilgeadam.week10.lecture002;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOError;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerlestirmeOrnek {

	public static void main(String[] args) {
		
		Ogrenci ogrenci = new Ogrenci("Alperen", 27);
		Ogrenci ogrenci3 = new Ogrenci("Muhammet", 50);
		
		ObjectOutputStream oos = null;
		
		//serialization islemi
		try {
			FileOutputStream fos = new FileOutputStream("C:\\Users\\augur\\OneDrive\\Masaüstü\\BoostJava11\\Eclips Workspace\\000_BilgeadamBoostJava11\\seri.txt");
			oos = new ObjectOutputStream(fos);
			oos.writeObject(ogrenci);
			oos.writeObject(ogrenci3);
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		//DeSerialization islemi
		try {
			FileInputStream fis = new FileInputStream("C:\\Users\\augur\\OneDrive\\Masaüstü\\BoostJava11\\Eclips Workspace\\000_BilgeadamBoostJava11\\seri.txt");
			ObjectInputStream ois = new ObjectInputStream(fis);
			try {
				Ogrenci ogrenci2 = (Ogrenci) ois.readObject();
				Ogrenci ogrenci4 = (Ogrenci) ois.readObject();
				System.out.println(ogrenci2);
				System.out.println(ogrenci4);
			} catch (Exception e) {
				e.printStackTrace();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
