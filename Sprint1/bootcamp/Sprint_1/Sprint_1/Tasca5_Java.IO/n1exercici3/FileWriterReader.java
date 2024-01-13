package n1exercici3;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.File;

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
	
}
