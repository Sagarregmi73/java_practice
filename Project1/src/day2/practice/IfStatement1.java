package day2.practice;
import java.util.Scanner;

public class IfStatement1 {

	static {
	System.out.println("hello1");
	
	}
	static {
		System.out.println("hello2");
		
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int firstNumber;//store input from user
		boolean result;
		System.out.println("Enter any number: ");//prompt for user
		firstNumber=Integer.parseInt(new Scanner(System.in).nextLine());
		result=(firstNumber==0)?true:false;
		if(result==true) {
			System.out.println("hello");
		}

	}

}
