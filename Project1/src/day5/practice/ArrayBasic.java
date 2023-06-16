package day5.practice;

public class ArrayBasic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int []num;
		num=new int[5];
		num[0]=1;
		num[1]=2;
		num[2]=3;
		num[3]=4;
		num[4]=5;
		System.out.println(num[0]+" "+num[1]+" "+num[2]+" "+num[3]+" "+num[4]);
	    System.out.println(num.length);
	    
	    //array with loops
		int []num2;
		num2=new int[5];
		for(int i=0;i<num2.length;i++) {
			System.out.println(i);
		}
	}

}
