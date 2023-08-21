package com.bilgeadam.week05.lecture002.Marathon01.copy;

public class MaasOzelListe1 {

	double[] maasListesi;
	int boyut = 0;

	public void add(double ogrenci) {
		double[] tmp;
		if (maasListesi == null) {
			maasListesi = new double[1];
			maasListesi[0] = ogrenci;
		} else {
			tmp = new double[boyut + 1];
			for (int i = 0; i < boyut; i++)
				tmp[i] = maasListesi[i];
			tmp[boyut] = ogrenci;
			maasListesi = tmp;
		}
		boyut++;
	}

	public void list() {
		System.out.print("[");
		for (int i = 0; i < boyut; i++) {
			System.out.print(maasListesi[i]);
			if (i != boyut - 1)
				System.out.print(",");
		}
		System.out.println("]");
	}

//	public String[] getList() {
//		return maasListesi;
//	}
//
//	public String getIndexOf(int i) {
//		return maasListesi[i];
//	}

}
