package mylibrary;
import java.util.Scanner;
public class BasicIO {
	public static void printMessage(String message) {
		System.out.println(message);
	}
	public static void printMessage(String message,int number) {
		System.out.println(message+" "+number);
	}

	public static void printMessage(String label, String message) {
		System.out.println(label + " " + message);
	}

	public static void printMessage(String label, double number) {
		System.out.println(label + " " + number);
	}
	
	public static void newLine() {
		System.out.println();
	}
	public static String readString() {
		return (new Scanner(System.in).nextLine());
	}
	public static char readChar() {
		return (new Scanner(System.in).nextLine().charAt(0));
	}
	public static int readInt() {
		return (Integer.parseInt(readString()));
	}
}
