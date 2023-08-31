package com.bilgeadam.week09.lecture004;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
public class DogumGunu {

	/**
	 * Dışarıdan String olarak doğum günü alalım. Daha sonra doğduğunuz günden bu güne kadar;
		Kaç yıl
		Kaç ay
		Kaç hafta
		Kaç gün
		geçtiğini hesaplayip yazdıralım.
		Bir sonraki doğum gününüze kaç gün kaldığını hesaplayın.
	 *
	 */
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Doğum gününüzü YYYY-AA-GG formatında girin: ");
        String dogumGunuStr = scanner.next();
    
        
        LocalDate dgunu = LocalDate.parse(dogumGunuStr);
        System.out.println(dgunu);
        
        
        
        
    }

}
