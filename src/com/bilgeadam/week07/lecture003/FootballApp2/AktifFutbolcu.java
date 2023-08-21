package com.bilgeadam.week07.lecture003.FootballApp2;

public abstract class AktifFutbolcu extends Futbolcu {

	public AktifFutbolcu(String adSoyad, int formaNumarasi) {
		super(adSoyad, formaNumarasi);

	}

	// pas skorunu hesaplayacak bir metot ve pas verdiğim zaman bunun basarılı
	// olup olmadıgını true /false dondurecek bir metot

	public abstract int pasSkor();

	public abstract int golSkoru(int kurtaris);

	public boolean pasVer() {
		int pasSkoru = pasSkor();
		if (pasSkoru > 68) {
			System.out.println("Pas basarili!");

			return true;
		} else {
			System.out.println("Pas basarisiz...");

			return false;
		}
	}

	public boolean sutCek(int kurtaris) {
		int sutSkoru = golSkoru(kurtaris);
		if (sutSkoru > 68) {

			return true;
		} else {

			return false;
		}

	}

}
