package com.bilgeadam.week03.lecture003;

public class Question39 {
	
	// String'i parçalara ayıralım, bir array'e kaydedelim. Sonra aşağıdaki örnek
	// çıktıyı almaya çalışalım;
	// Adananın plaka kodu = 01

	

	public static void main(String[] args) {
		String sehirler = "01-Adana;02-Adıyaman;03-Afyonkarahisar;04-Ağrı;05-Amasya;06-Ankara;"
				+ "07-Antalya;08-Artvin;09-Aydın;10-Balıkesir;42-Konya";
	
		String cities[] = sehirler.split(";") ;
		
		for(int i=0;i<cities.length;i++) {
			int index = cities[i].indexOf('-');
			String city=cities[i].substring(index+1);
			String plakaKodu = cities[i].substring(0,index);
			System.out.println(city+"nın plaka kodu= " +plakaKodu);

		}

	}

}
