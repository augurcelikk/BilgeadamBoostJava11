package com.bilgeadam.week07.lecture001.enumornek;

import java.util.Scanner;

public class Utility {
	static Scanner scanner = new Scanner(System.in);

	public static String stringDegerAlma(String sorgu) {
		System.out.println(sorgu);
		return scanner.nextLine();

	}

	public static int intDegerAlma(String sorgu) {
		System.out.println(sorgu);
		return Integer.parseInt(scanner.nextLine());
	}

}
