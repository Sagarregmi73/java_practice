package fileio.test;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.CharBuffer;

public class ReadWriter {

	public static void main(String[] args) {

		File obj = new File("C:\\Users\\DELL\\Documents\\hello.txt");

		try {
			FileWriter fw = new FileWriter(obj);
			FileReader fr = new FileReader(obj);
			char ch[] = { 'a', 'b', 'c', 'd' };

			fw.write(ch);
			int i;
			while ((i = fr.read()) != -1) {
				System.out.println((char) i);
			}
			fw.close();

			System.out.println("write");

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
