package day4.practice;

public class DigitalClock {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		int hours,minutes,second;
		hours=0;
		minutes=0;
		second=0;
		while(hours<=24) {
			System.out.println(hours);
			
			while(minutes<=60) {
				System.out.println(minutes);
				while(second<=60) {
					System.out.println(second);
					Thread.sleep(1000);
					second++;
					
				}
				minutes++;
				
			}
			hours++;
			
		}
		try {
			
			
		}catch(Exception ex) {
			System.out.println("Error message: "+ ex.getMessage());
		}finally {
			System.out.println("finally is called");
		}
	}

}
