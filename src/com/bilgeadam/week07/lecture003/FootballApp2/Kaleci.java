package com.bilgeadam.week07.lecture003.FootballApp2;

import java.util.Random;

public class Kaleci extends Futbolcu {

	private int kurtaris;

	public Kaleci(String adSoyad, int formaNumarasi) {
		super(adSoyad, formaNumarasi);
		this.kurtaris = rastgeleYetenekPuani();

	}

	@Override
	public int rastgeleYetenekPuani() {
		Random random = new Random();
		return random.nextInt(65, 101);
	}

	public int getKurtaris() {
		return kurtaris;
	}

	public void setKurtaris(int kurtaris) {
		this.kurtaris = kurtaris;
	}

	@Override
	public String toString() {
		return "Kaleci [kurtaris=" + kurtaris + ", getAdSoyad()=" + getAdSoyad() + ", getFormaNumarasi()="
				+ getFormaNumarasi() + ", getDayaniklilik()=" + getDayaniklilik() + ", getHiz()=" + getHiz()
				+ ", getPas()=" + getPas() + ", getSut()=" + getSut() + ", getYetenek()=" + getYetenek()
				+ ", getKararlilik()=" + getKararlilik() + ", getDogalForm()=" + getDogalForm() + ", getSans()="
				+ getSans() + "]";
	}

	public int kurtarisSkoru() {
		Random random = new Random();
		int bonus = (int) (random.nextInt(1, 6) * getDogalForm() * 0.025);
		return (int) (getKurtaris() * 0.2 + getKararlilik() * 0.1 + bonus);

	}

}
