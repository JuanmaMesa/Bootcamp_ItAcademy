package n1exercisi3;

import java.io.*;
import java.io.FileReader;

public class File_reader {

	public void fileReader(String root) {
		
		try {
			FileReader fileReader = new FileReader(root);
			int c = 0;
			//int c;
			while(c != -1) {
				c = fileReader.read();
				char letter = (char)c;
				System.out.print(letter);
				//c= fileReader.read() !=-1
			}
			fileReader.close();
			
			} catch (IOException e) {
			System.out.println("IOException: File not found");
		}
	}
		
}


