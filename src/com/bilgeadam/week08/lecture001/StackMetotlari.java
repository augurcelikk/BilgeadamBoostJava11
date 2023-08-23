package com.bilgeadam.week08.lecture001;

import java.util.Stack;

public class StackMetotlari {

	public static void main(String[] args) {
		// Stack -> LIFO ->> Last in first out

		Stack<Integer> stack = new Stack<Integer>();
		stack.add(1); // 1 sayisini stack'e ekler.
		stack.push(2); // 2 sayisini stack'e ekler. Genellikle ekleme islemi icin push kullanilir.
		// Stack oldugu belli olsun diye add yerine push kullanilabilir.
		stack.peek();// en üstteki elemanı istiften çıkartmadan bize gösteriyor.
		System.out.println(stack);
		System.out.println(stack.peek());
		System.out.println(stack);
		System.out.println();

		stack.pop(); // Stack'e en son eklenen degeri getirir ve stack'ten cikarir.
		System.out.println(stack.pop());
		System.out.println(stack);

//		stack.pop(); Stackte eleman kalmamışken, bu metot tekrar calistirilirsa EmptyStackExeption aliriz.

		stack.isEmpty();
		System.out.println(stack.isEmpty());// Stackte eleman olup olmadigini kontrol eder.eger hiç eleman yoksa true, varsa false doner.
		
	}
}
