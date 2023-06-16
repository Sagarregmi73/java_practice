package day6.practice;

import java.util.Scanner;

public class CalcFunction {

	public static void printMessage(String message) {
		System.out.println(message);
	}

	public static String readString() {
		return (new Scanner(System.in).nextLine());
	}

	public static char readChar() {
		return (new Scanner(System.in).nextLine().charAt(0));
	}

	public static double readDouble() {
		return (Integer.parseInt(readString()));
	}

	public static void printResult(String message, double first, char operator, double second, double result) {
		System.out.println(message+" " +first+" " + operator+" " + second+" " + result);
	}
	
	public static void newLine() {
		System.out.println();
	}

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		System.out.print("Enter two numbers: ");
		newLine();
// nextDouble() reads the next double from the keyboard
		double first = readDouble();
		double second = readDouble();
		printMessage("Enter an operator (+, -, *, /): ");

		char operator = readChar();
		double result;
//switch case for each of the operations
		switch (operator) {
		case '+':
			result = first + second;
			break;
		case '-':
			result = first - second;
			break;
		case '*':
			result = first * second;
			break;
		case '/':
			result = first / second;
			break;
// operator doesn't match any case constant (+, -, *, /)

		default:

			printMessage("Error! operator is not correct");
			return;
		}
//printing the result of the operations

		printResult("%.1f %c %.1f = %.1f", first, operator, second, result);
	}

}
