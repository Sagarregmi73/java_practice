package day4.practice;

import java.util.Date;
import java.util.Iterator;
import java.text.SimpleDateFormat;

public class DateTime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

		try {
			
			Date now = new Date();
			System.out.println(formatter.format(now));

		} catch (Exception ex) {
			System.out.println("error message" + ex.getMessage());
		}finally {
			System.out.println("finally called");
			
		}
	}

}
