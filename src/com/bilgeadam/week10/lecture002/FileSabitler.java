package com.bilgeadam.week10.lecture002;

import java.io.File;
import java.nio.file.Path;

public class FileSabitler {


//		public static String path = "C:\\Users\\augur\\OneDrive\\Masaüstü\\BoostJava11\\Eclips Workspace\\000_BilgeadamBoostJava11\\fileislemler.txt";
		public static Path path = Path.of("C:\\Users\\augur\\OneDrive\\Masaüstü\\BoostJava11\\Eclips Workspace\\000_BilgeadamBoostJava11\\fileislemler.txt");
		public static File file = new File(path.toString());

}
