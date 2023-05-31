package day3.practice;

public class SwitchCase2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// boolean result=false;//boolean value is not compatible
		// only int ,string,char are compatible
		char ch = 'B';
		switch (ch) {
		case 'A':
			System.out.println("A");
			break;
		case 'B':
			System.out.println("B");
			break;
		case 'C':
			System.out.println("C");
			break;
		case 'D':
			System.out.println("D");
			break;
		default:
			System.out.println("others");
		}
	}

}
