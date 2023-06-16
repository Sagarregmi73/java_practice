package fileio.test;

import java.io.File;
import java.io.IOException;
import java.nio.file.FileAlreadyExistsException;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;
import static java.nio.file.StandardCopyOption.*;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileClassTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// File(String pathname)
		// pathname -> absolute path
		// pathname -> relative path
		// File(URI uri) -> uniform resource indicator(file in web/network)

		File file, file1, file5;
		boolean result;
		try {
			/*
			 * file=new File("Documents/hello.txt"); System.out.println("....");
			 * result=file.canExecute(); if(result) {
			 * System.out.println("File is executable"); }else {
			 * System.out.println("file can't execute"); }
			 * 
			 * file=new File("C:\\Users\\DELL\\Documents\\hello.txt");
			 * System.out.println("...."); result=file.canRead(); if(result) {
			 * System.out.println("File is readaable"); }else {
			 * System.out.println("file can't readable"); }
			 */
			file = new File("C:\\Users\\DELL\\Documents\\hello.txt");
			if (file.canWrite()) {
				System.out.println("can write");
			} else {
				System.out.println("cannot write");
			}

		} catch (Exception ex) {
			System.out.println("error: " + ex);
		}

		try {
//			/*
//			 * file=new File("Documents/hello.txt"); System.out.println("....");
//			 * result=file.canExecute(); if(result) {
//			 * System.out.println("File is executable"); }else {
//			 * System.out.println("file can't execute"); }
//			 * 
//			 * file=new File("C:\\Users\\DELL\\Documents\\hello.txt");
//			 * System.out.println("...."); result=file.canRead(); if(result) {
//			 * System.out.println("File is readaable"); }else {
//			 * System.out.println("file can't readable"); }
//			 * 
//			 * file = new File("C:\\Users\\DELL\\Documents\\bye.txt"); if
//			 * (file.createNewFile()) { System.out.println("created new file"); } else {
//			 * System.out.println("can't create new file"); }
//			 * 
//			 * } catch (IOException io) { System.out.println("error: " + io); } catch
//			 * (Exception e) { System.out.println("error: " + e); }
//			 * 
//			 * file = new File("C:\\Users\\DELL\\Documents\\hello.txt"); file1 = new
//			 * File("C:\\Users\\DELL\\Documents\\bye.txt"); int result1 =
//			 * file.compareTo(file1); System.out.println(result1); } catch (Exception e) {
//			 * System.out.println("error: " + e); }
//			 * 
//			 * 
//			 * file = new File("C:\\Users\\DELL\\Documents\\hi.txt"); if (file.exists()) {
//			 * System.out.println("file exist"); } else {
//			 * System.out.println("file not exist"); }
//			 * 
//			 * } catch (Exception e) { System.out.println("error: " + e); }
//			 

			/*
			 * file = new File("C:\\Users\\DELL\\Documents\\bye.txt"); String result2 =
			 * file.getPath(); System.out.println("path: " + result2);
			 * 
			 * } catch (Exception e) { System.out.println("error: " + e); }
			 * 
			 * file = new File("C:\\Users\\DELL\\Documents\\hello.txt"); long result4 =
			 * file.lastModified(); System.out.println(result4); } catch (Exception e) {
			 * System.out.println("error: " + e); }
			 * 
			 * file = new File("C:\\Users\\DELL\\Documents\\bye.txt"); long result4 =
			 * file.length(); System.out.println(result4); } catch (Exception e) {
			 * System.out.println("error: " + e); }
			 */

			file1 = new File("C:\\Users\\DELL\\Documents");
//			String[] str;
//			str=file1.list();
//			for(String i:str) {
//				System.out.println(i);
//			}

//			File[] fl;
//			fl = file1.listFiles();
//			for (File f : fl) {
//				System.out.println(f);
//			}
//
//		} catch (Exception ex) {
//			System.out.println("error: " + ex);
//		}
//		
//
//			File file2 = new File("C:\\Users\\DELL\\Documents\\bye.txt");
//			File file3 = new File("C:\\Users\\DELL\\Documents\\hello.txt");
//
//			Files.copy(file2.toPath(), file3.toPath(), StandardCopyOption.REPLACE_EXISTING);
//		System.out.println("copied successfully!");
//		} catch (Exception ex) {
//			System.out.println(ex);
//		}

			String srcPath = "C:/Users/DELL/Documents/folder1";
			String destPath = "C:/Users/DELL/Documents/folder1";
			File files[] = new File("C:\\Users\\DELL\\Documents\\folder1").listFiles();
			System.out.println(files.length);
			for (File fl : files) {
				System.out.println(fl.getName());
				String folder1 = new String("C:\\Users\\DELL\\Documents\\folder1");
				String folder2 = new String("C:\\Users\\DELL\\Documents\\folder2");
				Files.copy(folder1 + "/" + fl.getName(), folder2 + "/" + fl.getName(),
						StandardCopyOption.REPLACE_EXISTING);
				System.out.println("sussessfully copied");
			}

		} catch (Exception ex) {
			System.out.println("Error: " + ex);
		}

	}

}
