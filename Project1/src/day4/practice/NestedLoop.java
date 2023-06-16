package day4.practice;
public class NestedLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//pseudo code 
//int i,j;
//for i loop begin
//for j loop begin
		//
		//for i loo[ end
		//for j loop end
		
		int start1,stop1,start2,stop2;
		start1=1;
		stop1=5;
			
		while(start1<=stop1) {
			System.out.println(start1);
			start2=6;
			stop2=10;
			while(start2<=stop2) {
				System.out.println(start2);
				start2++;
			}//6,7,8,9,10       
			start1++;
		}//1,2,3,4,5
		
	}

}
