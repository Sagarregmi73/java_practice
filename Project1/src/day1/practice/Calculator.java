package day1.practice;
import java.util.Scanner;
public class Calculator {

	final static double PHI_VALUE=3.14;
	double areaOfCircle,areaOfTriangle,areaOfRectangle;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		areaOfCircle();
//		areaOfRectangle();
//		areaOfTriangle();
		
		

		
	}
	
	public static void areaOfCircle() {
		double area,radius;
		printMessage("Enter radius:");
		radius=readInt();
		
		area=PHI_VALUE*radius;
		printArea(area);
		nextLine();
		
	}
	
    public static void areaOfTriangle() {
    	int base,height,area;
    	printMessage("Enter Base:");
    	base=readInt();
    	printMessage("Enter Height:");
    	height=readInt();
    	area=(base*height)/2;
    	
    	printArea(area);
		nextLine();
		
	}
    public static void areaOfRectangle() {
    	int length,breadth;
    	printMessage("Enter Base:");
    	length=readInt();
    	printMessage("Enter Height:");
    	breadth=readInt();
		nextLine();
	}
    
    public static void printMessage(String message) {
    	System.out.println(message);
    }
    public static void nextLine() {
    	System.out.println();
    }
    
    public static String readString() {
    	return (new Scanner(System.in).nextLine());    	
    }
    
    public static int readInt() {
    	return(Integer.parseInt(readString()));
    }
    public static void printArea(int area) {
    	System.out.println(area);
    }
    public static void printArea(double area) {
    	System.out.println(area);
    }
    
   
	
	

}
