package day2.practice;
import mylibrary.BasicIO;
public class IfStatement4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int firstNumber;
		BasicIO.printMessage("Enter any Number: ");
		firstNumber=BasicIO.readInt();
		if(firstNumber==0) {
			System.out.println("zero");
		}
		else {
			System.out.println("one");
		}
	}

}
