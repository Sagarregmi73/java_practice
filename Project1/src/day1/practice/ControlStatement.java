package day1.practice;

public class ControlStatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int firstNumber, secondNumber;
		firstNumber = 89;
		secondNumber = 76;
		boolean result = (firstNumber == secondNumber);
		System.out.println(result);

		// value operator value2
		result = (firstNumber >= secondNumber);
		System.out.println(result);
       //without using reusability
		if (firstNumber > 0) {

			System.out.println("hello");
		}
		// with using reusability
		//result1=condition
		boolean result1 = result;
		//if(condition)
		if (result1) {

			System.out.println("hello2");
		}
	}

}
