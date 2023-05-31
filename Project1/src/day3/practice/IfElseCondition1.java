package day3.practice;

import mylibrary.BasicIO;

public class IfElseCondition1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int day;
		BasicIO.printMessage("Enter any number (1-7)");
		day = BasicIO.readInt(); // Sun->1 to Sat->7(-1,9,1,3,6)
		if ((day < 1) || (day > 7)) {
			System.out.println("out of range");
		}
		if (day == 1) {
			System.out.println("SUN");
		} else if (day == 2) {
			System.out.println("MON");
		} else if (day == 3) {
			System.out.println("TUE");
		} else if (day == 4) {
			System.out.println("WED");
		} else if (day == 5) {
			System.out.println("THU");
		}

		else if (day == 6) {
			System.out.println("FRI");
		} else if (day == 7) {
			System.out.println("SAT");
		}

	}

}
