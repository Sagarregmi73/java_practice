package day1.practice;

import java.util.Scanner;

public class StudentDetails {
	final static int PASS_MARKS = 40;
	final static int SUBJECTS = 3;
	// input -rollno,name,sub1,sub2,sub3
	// processing -total,average,result
	// output -total,average,result

	//read string
	public static void printMessage(String message) {
		System.out.print(message);

	}
	
	//read string and value
	public static void printMessage(String message,double value) {
		System.out.print(message+" "+value);

	}
	//read string and string
	public static void printMessage(String message,String value) {
		System.out.print(message+" "+value);

	}
	//break new line
	public static void newLine() {
		System.out.println();
	}

	//read input string
	public static String readString() {
		return (new Scanner(System.in).nextLine());
	}
    //conversion from integer to string
	public static int readInt() {
		return (Integer.parseInt(readString()));
	}
	
	public static int sum(int firstNumber,int secondNumber) {
		return (firstNumber+secondNumber);
	}
	
	public static int avg(int total,int count) {
		return total/count;
	}
	public static String result(int math,int science,int english) {
		String result="";
		if (science >= PASS_MARKS && math >= PASS_MARKS && english >= PASS_MARKS) {
			result = "pass";
		} else {
			result = "fail";
		}
		return result;

	}

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// declare
		int rollNo;// student rollno
		String fullName;// student fullname
		int math, sci, eng;// obtain marks of math,science,english
		int totalMarks;
		float averageMarks;
		String result;
		

		// input
	
        printMessage("---Enter student details---");
        newLine();
		System.out.println("Enter Rollno:");
		rollNo = Integer.parseInt(new Scanner(System.in).nextLine());
		// System.out.println("Enter FullName:");
		// fullName = new Scanner(System.in).nextLine();
		printMessage("FullName:");
		fullName = readString();
		printMessage("Enter Marks in Math:");
		math = readInt();
		printMessage("Enter Marks in Science:");
		sci = readInt();
		printMessage("Enter Marks in English:");
		eng = readInt();
		// process
		totalMarks = sum(sum(sci,math), eng);
		averageMarks = totalMarks = avg(totalMarks, SUBJECTS);
		result=result(math,sci,eng);
		// output

		
		printMessage("Total mark obtain by student: ",totalMarks);
		newLine();
		printMessage("Average mark obtain by student: ",averageMarks);
		newLine();
		printMessage("Result obtain by student: ",result);
		newLine();

	}

}
