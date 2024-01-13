package n1exercici3;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Locale;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;


import n1exercici1.MyComparator;

public class DirectoryTree_version2 {
	
	private File directory;
	
	public  DirectoryTree_version2(String directoryPath) {
		
		directory = new File(directoryPath);
		
	}
	
	public void setDirectory(String directoryPath) {
		
		directory = new File(directoryPath);
	}
	
	public File getDirectory() {
		
		return directory;
	}
	
	
	public void verificationDirectory(File file, FileWriterReader fileWriter) {
		
		if(file.isDirectory()) {
			File[] files = file.listFiles();
			
			if(files != null) {
				Arrays.sort(files, new MyComparator());
				
				for(File f: files) {
					
					printInfoFiles(f, fileWriter);
					
					if(f.isDirectory()) {
						
						verificationDirectory(f, fileWriter);// llamada recursiva	
					}
				}
				
			}else {
				System.out.println("The directory path is empty.");
			}
			
		}else {
			System.out.println("Error, your path is not a directory path.");
		}
	
	}
	
	public void printInfoFiles(File file, FileWriterReader fileWriter) {
	
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd MMMM YYY - HH:mm",new Locale("ca","Cat"));
		
		try {
			String dateFormated = dateFormat.format(file.lastModified());
			String fileType = file.isFile() ? "F":"D";
			
			String info = "Type: "+fileType +" Name: "+ file.getName() + "Last modified: "+ dateFormated+"\n";
			
			fileWriter.saveToFile(info);
		} catch (Exception e) {
			System.out.println("Error, Unable to read the file");
		}
		
		
	}
	
	
	
	
	








	
	

}
