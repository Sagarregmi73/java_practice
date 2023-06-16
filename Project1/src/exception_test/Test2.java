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

public class Test2 {

	public static void main(String[] args) {
		try {
			// delare
			int age;
			BasicIO.printMessage("Enter your age: ");// age between 18-30
			age = BasicIO.readInt();
			BasicIO.printMessage("Your age is: " + age);

			if (age < 18)
				throw new LowRange("Age in low range");

			else if (age > 30)
				throw new HighRange("Age in High range");
			else
				BasicIO.printMessage("Age within range");
		} catch (NumberFormatException nfe) {
			System.out.println("error1" + nfe);
		} catch (LowRange lr) {
			System.out.println("error2" + lr);
		} catch (HighRange hr) {
			System.out.println("error3" + hr);

		} catch (Exception ex) {
			System.out.println("error4" + ex);

		} finally {
			System.out.println("Finally is called");
		}
	}

}
