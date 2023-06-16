package exception_test;
import mylibrary.BasicIO;
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			int x;
			int y;
			int z;
			//input
		 //read from keyword
			System.out.println("Enter x:");
			x=BasicIO.readInt();
			//read from keyword
			System.out.println("Enter y:");
			y=BasicIO.readInt();
			
			 //process
			z=x/y;
			
			//output
			System.out.println("Result = "+ z);

		}catch(NumberFormatException nfe) {
			System.out.println("error: "+nfe.getMessage());
		}catch(ArithmeticException ae) {
			System.out.println("error: "+ae.getMessage());
		}catch(Exception e) {
			System.out.println("error: "+e.getMessage());
		}finally {
			System.out.println("End!");
		}
		
	}
		
}
