package day2.practice;

import mylibrary.BasicIO;

public class IfStatement6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num1, num2, num3;
		num1 = 8;
		num2 = 9;
		num3 = 10;
		if ((num1 >= num2) && ( num1 >= num3))
			BasicIO.printMessage("Largest Number: ", num1);
		if ((num2 >= num1) && (num2 >= num3))
			BasicIO.printMessage("Largest Number: ", num2);
		if ((num3 >= num1) && (num3 >= num2))
			BasicIO.printMessage("Largest Number: ", num3);
	}

}
