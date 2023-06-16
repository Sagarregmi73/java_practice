package day6.practice;

class Numbers {
	int x;
	int y;
}

public class FunctionExample2 {

	public static void swap(Numbers nums) {
		int temp = nums.x;
		nums.x = nums.y;
		nums.y = temp;
		System.out.println(nums.x + ", " + nums.y);
	}

	public static void swap(int x, int y) {
		int temp = x;
		x = y;
		y = temp;
		System.out.println(x + ", " + y);

	}

	public static void main(String[] args) {

		int x, y, z;
		x = 8;
		y = 9;
		System.out.println(x + " ," + y);
		// pass by value example
		swap(x, y);
		System.out.println(x + " ," + y);
//pass by reference example
		Numbers nums = new Numbers();
		nums.x = 9;
		nums.y = 10;
		System.out.println(nums.x + " ," + nums.y);
		swap(nums);
		System.out.println(nums.x + " ," + nums.y);
	}

}
