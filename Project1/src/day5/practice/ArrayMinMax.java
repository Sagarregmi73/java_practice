package day5.practice;

import mylibrary.BasicIO;

public class ArrayMinMax {

	public static int maxArray(int[] arr) {
		int max = 0; //declare and assign max by 0
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}

		}
		return max;
	}

	public static int minArray(int[] arr) {
		int min = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < min) {
				min = arr[i];
			}

		}
		return min;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stubs
		try {
			int arr[] = new int[5];
			BasicIO.printMessage("Enter element in array: ");
			for (int i = 0; i < arr.length; i++) {
				arr[i] = BasicIO.readInt();

			}
			maxArray(arr);
			System.out.println("max-value is " + maxArray(arr));
			minArray(arr);
			System.out.println("min-value is " + minArray(arr));

		} catch (Exception ex) {

		} finally {
			System.out.println("Finally is called!");
		}
	}

}
