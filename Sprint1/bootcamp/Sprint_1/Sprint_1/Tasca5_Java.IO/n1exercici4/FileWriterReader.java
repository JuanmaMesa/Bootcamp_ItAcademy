package n1exercici4;

import java.io.BufferedWriter;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterReader {

	private String filePath;
	private boolean append;
	public FileWriterReader(String filePath, boolean append) {
			
		this.filePath = filePath;
		this.append= append;
	}
		
	public void saveToFile(String data) {
		try {
			FileWriter filewriter = new FileWriter(filePath, append);
			BufferedWriter writer = new BufferedWriter(filewriter);
			writer.write(data);
			writer.close();
				
		}catch(IOException e) {
			
			System.out.println("IOException: Error the file can't to save.");
			e.printStackTrace();
		}
			
	}
	
	public String readFromFile() {
		
		try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
			StringBuilder content = new StringBuilder();
			String line;
			
			while((line = reader.readLine()) != null){
				content.append(line).append("\n");
				
			
			}
			return content.toString();
		}catch(IOException e) {
			
			System.out.println("IOEXception: Error reading the file");
			e.printStackTrace();
			return null;
		}	
	}
}
