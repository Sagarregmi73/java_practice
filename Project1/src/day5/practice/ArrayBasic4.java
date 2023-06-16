package day5.practice;

import mylibrary.BasicIO;

public class ArrayBasic4 {

	public static void main(String[] args) {

		final int MAX = 5;// declare and iniatalize by 1
		int[] num = new int[MAX];// initalize array
		int sum=0;
		int avg;
		// read values from user
		BasicIO.printMessage("Enter number:");
		for (int i = 0; i < num.length; i++) {
			num[i] = BasicIO.readInt();
		}

		// calculate sum of the element
		for (int i = 0; i < num.length; i++) {
			sum+=num[i];
			BasicIO.printMessage("sum of array:"+sum);
		}
		
		// calculate average of the element
		for (int i = 0; i < num.length; i++) {
			
			sum+=num[i];
			avg=(sum+num[i])/num.length;
			// print sum and average of element
			BasicIO.printMessage("avg of array:"+avg);
		}
	
	
			
			
		}
		
	}


