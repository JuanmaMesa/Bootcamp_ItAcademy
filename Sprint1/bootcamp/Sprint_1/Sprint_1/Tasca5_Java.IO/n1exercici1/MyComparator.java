package n1exercici1;
import java.util.Comparator;

import java.io.File;

public class MyComparator implements Comparator<File> {

	@Override
	public int compare(File file1, File file2) {
		return file1.getName().compareToIgnoreCase(file2.getName());
		
	}
	
}
