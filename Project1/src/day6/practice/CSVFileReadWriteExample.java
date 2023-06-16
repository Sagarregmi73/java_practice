package day6.practice;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CSVFileReadWriteExample {
    public static void main(String[] args) {
        String csvFilePath = "C:\\Users\\DELL\\Desktop\\csv\\data.csv";
        
        // Write data to CSV file
        writeDataToCSV(csvFilePath);
        
        // Read data from CSV file
        readDataFromCSV(csvFilePath);
    }
    
    private static void writeDataToCSV(String filePath) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {
            // Writing headers to the CSV file
            writer.write("Name,Email,Phone\n");
            
            // Writing data rows to the CSV file
            writer.write("John Doe,johndoe@example.com,1234567890\n");
            writer.write("Jane Smith,janesmith@example.com,9876543210\n");
            
            System.out.println("Data written to the CSV file successfully.");
        } catch (IOException e) {
            System.out.println("An error occurred while writing to the CSV file: " + e.getMessage());
        }
    }
    
    private static void readDataFromCSV(String filePath) {
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            
            // Skipping the header line
            reader.readLine();
            
            // Reading data rows from the CSV file
            while ((line = reader.readLine()) != null) {
                String[] data = line.split(",");
                
                String name = data[0];
                String email = data[1];
                String phone = data[2];
                
                System.out.println("Name: " + name + ", Email: " + email + ", Phone: " + phone);
            }
        } catch (IOException e) {
            System.out.println("An error occurred while reading the CSV file: " + e.getMessage());
        }
    }
}