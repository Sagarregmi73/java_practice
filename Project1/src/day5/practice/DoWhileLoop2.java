package day5.practice;
import mylibrary.BasicIO;
import mylibrary.MyCalculator;
public class DoWhileLoop2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		int choice;
		char ch;
		do {
		BasicIO.printMessage("----------Main Menu-----------");
		BasicIO.newLine();
		BasicIO.printMessage("1.ADD");
		BasicIO.printMessage("2.SUB");
		BasicIO.printMessage("3.MULT");
		BasicIO.printMessage("4.DIV");
		BasicIO.printMessage("0.EXIT");
		BasicIO.printMessage("--------------------");
		BasicIO.printMessage("Enter your choice");
		choice=BasicIO.readInt();
		if((choice>0) || choice <=1) {
			if(choice==0) {
				System.exit(0);
			}else if(choice==1) {
				int firstNumber,secondNumber,result;
				BasicIO.printMessage("Enter first Number");
				firstNumber=BasicIO.readInt();
				BasicIO.printMessage("Enter second Number");
				secondNumber=BasicIO.readInt();
				result=MyCalculator.sum(firstNumber, secondNumber);
				BasicIO.printMessage("sum of two number is: "+ result);
				
			}else if(choice==2){
				int firstNumber,secondNumber,result;
				BasicIO.printMessage("Enter first Number");
				firstNumber=BasicIO.readInt();
				BasicIO.printMessage("Enter second Number");
				secondNumber=BasicIO.readInt();
				result=MyCalculator.sub(firstNumber, secondNumber);
				BasicIO.printMessage("sub of two number is: "+ result);
			
			}
			else if(choice==3){
				int firstNumber,secondNumber,result;
				BasicIO.printMessage("Enter first Number");
				firstNumber=BasicIO.readInt();
				BasicIO.printMessage("Enter second Number");
				secondNumber=BasicIO.readInt();
				result=MyCalculator.mult(firstNumber, secondNumber);
				BasicIO.printMessage("mult of two number is: "+ result);
			
			}
			else if(choice==4){
				int firstNumber,secondNumber,result;
				BasicIO.printMessage("Enter first Number");
				firstNumber=BasicIO.readInt();
				BasicIO.printMessage("Enter second Number");
				secondNumber=BasicIO.readInt();
				result=MyCalculator.div(firstNumber, secondNumber);
				BasicIO.printMessage("div of two number is: "+ result);
			
			}
			
		}else {
			BasicIO.printMessage("choice out range");
			
		}
		BasicIO.printMessage("Do you want to continue:y or n?");
	    ch=BasicIO.readChar();
	}while((ch=='y')||(ch=='Y'));
	}
}
