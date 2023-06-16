package day6.practice;

public class FunctionExample1 {

	public static int sum(int num1, int num2) {
		// TODO Auto-generated method stub
		return num1 + num2;
	}

	public static void printMessage(String message, int num) {
		System.out.println(message + " " + num);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// declare variables
		int num1, num2, num3;
		// value assigned
		num1 = 56;
		num2 = 78;
		// calling values
		num3 = sum(num1, num2);
		// print message
		printMessage("Sum of num1 and num2 :", num3);
		// value assigned in variables num1 and num2
		num1 = 68;
		num2 = 98;
		// calling values
		num3 = sum(num1, num2);
		// print message
		printMessage("Sum of num1 and num2 :", num3);

	}

}
