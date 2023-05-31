package day3.practice;

public class SwitchCase1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num1 = 6;
		if (num1 == 0) {
			System.out.println("zero");
		} else if (num1 == 1) {
			System.out.println("one");
		} else if (num1 == 2) {
			System.out.println("two");
		} else if (num1 == 3) {
			System.out.println("three");
		} else if (num1 == 4) {
			System.out.println("four");
		} else if (num1 == 5) {
			System.out.println("five");
		} else if (num1 == 6) {
			System.out.println("six");
		} else if (num1 == 7) {
			System.out.println("seven");
		} else {

			System.out.println("others");
		}
		switch (num1) {
		case 0:
			System.out.println("zero");
			break;
		case 1:
			System.out.println("one");
			break;
		case 2:
			System.out.println("two");
			break;
		case 3:
			System.out.println("three");
			break;
		case 4:
			System.out.println("four");
			break;
		case 5:
			System.out.println("five");
			break;
		case 6:
			System.out.println("six");
			break;
		case 7:
			System.out.println("seven");
			break;
		default:
			System.out.println("others");
		}

	}

}
