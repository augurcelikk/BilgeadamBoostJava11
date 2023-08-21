package com.bilgeadam.week07.lecture003.FootballApp;

public class Test {

	public static void main(String[] args) {

		Takim takim = new Takim("Fenerbahce");

		System.out.println(takim.getKaleci());
		for (Futbolcu futbolcu : takim.getFutbolcular()) {
			System.out.println(futbolcu);
		}

	}

}
