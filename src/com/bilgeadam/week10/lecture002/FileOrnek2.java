package com.bilgeadam.week10.lecture002;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;

import javax.print.DocFlavor.READER;

public class FileOrnek2 {

	public static void main(String[] args){

		//Buffer, Buffering...

		String path = "C:\\Users\\augur\\OneDrive\\Masaüstü\\BoostJava11\\Eclips Workspace\\000_BilgeadamBoostJava11\\deneme3.txt";

		File file = new File(path);
		try {
//			file.createNewFile();
//			FileWriter fileWriter = new FileWriter(file);
			BufferedWriter writer = new BufferedWriter(new FileWriter(file));
			BufferedReader reader = new BufferedReader(new FileReader(file));
			writer.write("satir1\n");
			writer.write("satir2");
			
			
			writer.flush();
//			String deger1 = reader.readLine();
//			System.out.println(deger1);
//			String deger2 = reader.readLine();
//			System.out.println(deger2);
//			String deger3 = reader.readLine();
//			System.out.println(deger3);
			
			String deger;
			while((deger = reader.readLine())  != null) {
				System.out.println(deger);
			}
		} catch (IOException e) {	
			e.printStackTrace();
		}
	}

}
