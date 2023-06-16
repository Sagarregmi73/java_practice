package day7.practice;

public class FunctionExample4 {

//	public static void f1(int num1) {
//
//		System.out.println(num1++);
//
//		f1(num1++);
//
//	}

	public static void f2(int num1) {

		if (num1 <= 10) {
			System.out.println(num1);
			f2(num1 +1);

	}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		f2(1);
	}

}
