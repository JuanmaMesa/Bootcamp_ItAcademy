package n1exercici1;

import java.io.File;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class Directory  {
	
	
	private File directory;
	
	public Directory(String directoryPath) {
		
		directory = new File(directoryPath);
		
	}
	
	public void setDirectory(String directoryPath) {
		
		directory = new File(directoryPath);
	}
	
	public File getDirectory() {
		
		return directory;
	}
	
	
	public void verificationDirectory(File file) {
		
		if(file.isDirectory()) {
			File[] archivos = file.listFiles();
			
			if(archivos != null) {
				Arrays.sort(archivos, new MyComparator());
				
				for(File archivo: archivos) {
					System.out.println(archivo.getName());
				}
			}else {
				System.out.println("The directory path is empty.");
			}
			
		}else {
			System.out.println("Error, your path is not a directory path.");
		}
	
	}
	



}
