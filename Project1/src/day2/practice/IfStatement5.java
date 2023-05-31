package day2.practice;

import mylibrary.BasicIO;

public class IfStatement5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1, num2, num3;
		num1 = 8;
		num2 = 10;
		num3 = 14;
		if (num1 > num2)
			if (num1 > num3)
				BasicIO.printMessage(num1 + " ");

		if (num2 > num3)
			if (num2 > num3)
				BasicIO.printMessage(num2 + " ");

		if (num3 > num1)
			if (num3 > num2)
				BasicIO.printMessage(num3 + " ");

	}

}






