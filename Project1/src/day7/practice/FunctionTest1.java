package day7.practice;

class Numbers{
	int x;
	int y;
	int z;
	
	public  String toString() {
		return (this.x+", "+this.y+" ,"+this.z);
	}
	
}


public class FunctionTest1 {

	public static Numbers f4(Numbers numbers) {
		numbers.x++;
		numbers.y++;
		numbers.z=numbers.x+numbers.y;
		return numbers;
		
	}
	public static void f3(Numbers numbers) {
		numbers.x++;
		numbers.y++;
		numbers.z=numbers.x+numbers.y;
		
	}
	public static Numbers f2(int x, int y) {
		x++;
		y++;
		//object
		Numbers nums=new Numbers();
		nums.x=x;
		nums.y=y;
		nums.z=x+y;
		return nums;
	}
	public static int[] f1(int x, int y) {
		x++;
		y++;
		int nums[] = { x, y, x + y };
		return (nums);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] s = f1(4, 5);
		for (int i : s)
			System.out.println(i);

		Numbers nums2=new Numbers();
		nums2.x=3;
		nums2.y=5;

		Numbers nums3=new Numbers();
		nums3.x=1;
		nums3.y=3;
		Numbers nums=f2(6,7);
		System.out.println(nums);
		System.out.println(nums3);
		f3(nums);
		System.out.println(nums);
		
		Numbers nums4=f4(nums3);
		System.out.println(nums4);
		
		
		
	}

}
