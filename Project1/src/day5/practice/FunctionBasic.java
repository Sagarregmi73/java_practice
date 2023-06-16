package day5.practice;

public class FunctionBasic {

	// declare static variables
	public static int x, y, a, b, temp, s;

	// Create function
	public static int sum(int x, int y) {
		return (x + y);
	}

	// create swapping method
	public static void swapValue(FunctionBasic obj1) {
		// swapping value x and y
		temp = obj1.x;
		obj1.x = obj1.y;
		obj1.y = temp;

	}

	public static void swapValue1(int a, int b) {
		temp = a;
		a = b;
		b = temp;
		System.out.println("after swap:" + a + " " + b);
		
	}
	
	public static int[] passArray(int[]arr) {
		// TODO Auto-generated method stub
	
		return arr;
	}
	
	public static void main(String[] args) {
		try {
			FunctionBasic obj1 = new FunctionBasic();
			obj1.x = 50;
			obj1.y = 80;
			a = 20;
			b = 30;

			int []arr=new int[]{1,2,3,4,5};
			// call function

			s = sum(10, 5);
			System.out.println("sum is: " + s);

			// passing reference type
			System.out.println("before swap:" + a + " " + b);
			swapValue1(a, b);
			// passing value to function(pass by value/by refrence)
			System.out.println("before swap:" + obj1.x + " " + obj1.y);

			// passing object of class
			swapValue(obj1);
			System.out.println("after swap:" + obj1.x + " " + obj1.y);

			passArray(arr);
			System.out.println(passArray(arr));
			
			
			
		} catch (Exception ex) {
			System.out.println("error message:" + ex.getMessage());
		} finally {
			System.out.println("Finally is called!");
		}

		// passing basic type
		// passing reference type
		// passing array

		// Returning value from function
		// Returning basic type
		// Returning reference type
		// Returning Array
		// Returning object of class
		// Recursive function??

	}

	

}
