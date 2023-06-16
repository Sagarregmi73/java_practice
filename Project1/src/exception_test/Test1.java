package exception_test;

import mylibrary.BasicIO;

class LowRange extends Exception { // sub lass of exception lass
	public LowRange(String message) {
		super(message);
	}
}

class HighRange extends Exception {// sub lass of exception lass
	public HighRange(String message) {
		super(message);
	}
}

public class Test1 {

	public static void main(String[] args) {
		// delare
		int age;
		BasicIO.printMessage("Enter your age: ");// age between 18-30
		age = BasicIO.readInt();
		BasicIO.printMessage("Your age is: " + age);
		if (age < 18)
			BasicIO.printMessage("Age Status", "LowRange");
		else if (age > 30)
			BasicIO.printMessage("Age Status", "HighRange");
		else
			BasicIO.printMessage("Age status", "within range");
	}

}
