package fileio.test;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileRead {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File obj = new File("C:\\Users\\DELL\\Documents\\hello.txt");

		try {

			FileReader fr = new FileReader(obj);
			int i;
			while ((i = fr.read()) != -1) {
				System.out.println((char) i);
			}

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
