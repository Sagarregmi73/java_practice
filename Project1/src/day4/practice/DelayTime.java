package day4.practice;

public class DelayTime {
	public static int start;
	public static int stop;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {

			start=1;
			stop=5;
			while(start<=stop) {
				System.out.println(start);
				System.out.println("wait for 5 second");
				Thread.sleep(5000);
				start++;
			}
		} catch (Exception ex) {
			System.out.println(ex.getMessage());
		}
	}

}
