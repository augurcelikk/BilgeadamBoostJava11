package com.bilgeadam.week08.lecture001;

import java.util.Stack;

public class PalindromStack {

	/*
	 * Disaridan bir metin gireceğiz. SOnra bu metni bir stack'e atayacagiz. daha
	 * sonra bu kelimenin palindrom olup olmadigini kontrol eden bir metot
	 * 
	 */

	Stack<Character> stack = new Stack<>();// collectionlarda primitivle calisilmiyor.

	public static void main(String[] args) {
		PalindromStack palindromStack = new PalindromStack();
		String kelime = Utility.stringDegerAlma("Lütfen bir kelime giriniz: ");
		if (palindromStack.isPalindrome(kelime)) {
			System.out.println(kelime + " palindromdur.");
		} else {
			System.out.println(kelime + " palindrom değildir");
		}
	}

	public void stackOlusturma(String kelime) {
		for (int i = 0; i < kelime.length(); i++) {
			stack.push(kelime.charAt(i));
		}
	}

	public boolean isPalindrome(String kelime) {
		stackOlusturma(kelime);
		for (int i = 0; i < kelime.length() / 2; i++) {
			if (stack.pop() != kelime.charAt(i)) {
				return false;
			}
		}
		return true;

	}

}
