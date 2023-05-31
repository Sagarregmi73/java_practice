package day3.practice;

import mylibrary.BasicIO;

public class SwitchCase4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//declare variable choice, add, sub, mult, div, mod, firstNumber, secondNumber, calculate
		int choice, add, sub, mult, div, mod, firstNumber, secondNumber, result;
		BasicIO.printMessage("Enter any (0-4)number:");// print message
		BasicIO.printMessage("Enter 0  for addition:");// print message
		BasicIO.printMessage("Enter 1 for subtract:");// print message
		BasicIO.printMessage("Enter 2  for product:");// print message
		BasicIO.printMessage("Enter 3  for division:");// print message
		BasicIO.printMessage("Enter 4  for modulus:");// print message
		BasicIO.printMessage("Enter 5  for exit:");// print message
		choice = BasicIO.readInt();// read integer value
		BasicIO.newLine();//print newline
		BasicIO.printMessage("Enter first number:");// print message
		firstNumber = BasicIO.readInt();// read integer value
		BasicIO.newLine();//print newline
		BasicIO.printMessage("Enter second number:");// print message
		secondNumber = BasicIO.readInt();// read integer value
		BasicIO.newLine();//print newline
		switch (choice) {// switch case with variable choice
		case 0:
			add = firstNumber + secondNumber;
			result = add;
			BasicIO.printMessage("add of two number: ", result);
			break;
		case 1:
			sub = firstNumber - secondNumber;
			result = sub;
			BasicIO.printMessage("subtract of two number: ", result);
			break;
		case 2:
			mult = firstNumber * secondNumber;
			result = mult;
			BasicIO.printMessage("product of two number: ", result);
			break;

		case 3:
			div = firstNumber / secondNumber;
			result = div;
			BasicIO.printMessage("division of two number: ", result);
			break;
		case 4:
			mod = firstNumber | secondNumber;
			result = mod;
			BasicIO.printMessage("modulus of two number: ", result);
			break;
		case 5:
			System.exit(0);
			break;
		default:
			System.out.println("out of order");

		}

	}

}
