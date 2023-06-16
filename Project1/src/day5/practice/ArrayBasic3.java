package day5.practice;

public class ArrayBasic3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] num = { 1, 2, 3, 4, 5 };
		for (int i = 0; i < num.length; i++) {
			num[i] = num[i] + 1;
			;
		}
		for (int i : num) {
			System.out.println("value: " + (i + 1) + ":" + num[i]);
			

		}
		for (int i = 0; i < num.length; i++) {
			System.out.println("value: " + (i + 1) + ":" + num[i]);
		}
	}

}
