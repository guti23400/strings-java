package strings;

import java.util.Scanner;

public class Strings_1 {

	public static void main(String[] args) {

		Scanner keyboard = new Scanner(System.in);

		System.out.println("Introduce una frase");

		int count = 0;
		String str1 = keyboard.next();

		for (int i = 0; i < str1.length(); i++) {
			char ch = str1.charAt(i);
			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == ' ') {
				count++;
			}
		}
		System.out.println("La frase tiene " + count + " vocales");
	}

}
