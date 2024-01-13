package n1exercici2;

import java.io.File;
import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Locale;

import n1exercici1.MyComparator;

public class DirectoryTree {
		
		private File directory;
		
		public DirectoryTree(String directoryPath) {
			
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
				File[] files = file.listFiles();
				
				if(files != null) {
					Arrays.sort(files, new MyComparator());
					
					for(File f: files) {
						//System.out.println(f.getName());
						printInfoFiles(f);
						
						if(f.isDirectory()) {
							System.out.println(" --- SubFile ---");
							verificationDirectory(f);// llamada recursiva
						}
					}
				}else {
					System.out.println("The directory path is empty.");
				}
				
			}else {
				System.out.println("Error, your path is not a directory path.");
			}
		
		}
		
		public void printInfoFiles(File file) {
		
			SimpleDateFormat dateFormat = new SimpleDateFormat("dd MMMM YYY - HH:mm",new Locale("ca","Cat"));
			
			try {
				String dateFormated = dateFormat.format(file.lastModified());
				String fileType = file.isFile() ? "F":"D";
			
				System.out.println("Type: "+fileType);
				System.out.println("Name: "+file.getName());
				System.out.println("Last Modificated: "+dateFormated );
			
			} catch (Exception e) {
				System.out.println("Error, file not read");
			}
			
			
		}
		



	

	
	
	

}
