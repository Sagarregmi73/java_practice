package day3.practice;

import mylibrary.BasicIO;

public class SwitchCase3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char ch;
		BasicIO.printMessage("Enter any character:");
		ch = BasicIO.readChar();

		switch (ch) {
		case 'A':
		case 'a':
		case 'E':
		case 'e':
		case 'I':
		case 'i':
		case 'O':
		case 'o':
		case 'U':
		case 'u':
			System.out.println("Vowel");
			break;
		default:
			System.out.println("consonent");
		}
	}

}
