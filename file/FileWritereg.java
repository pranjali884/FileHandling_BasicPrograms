package file;

import java.io.FileWriter;
import java.io.IOException;

public class FileWritereg {

	public static void main(String[] args) throws IOException {
		
		FileWriter fw=new FileWriter("file1.txt");
		
		fw.write("my first program using file writer");
		fw.close();
		
		System.out.println("write successfully");
		
	}

}
