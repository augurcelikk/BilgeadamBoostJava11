package com.bilgeadam.week05.lecture003.copy2;

public class StudentTest {

	public static void main(String[] args) {

		Student student1 = new Student();
		student1.isim = "Alperen";
		student1.kayit();
		Student student2 = new Student();
		student2.isim = "Ugur";
		student2.kayit();
		Student student3 = new Student();
		student3.isim = "Sedat";
		student3.kayit();

	}

}
