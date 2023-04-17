package file;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReadereg {

	public static void main(String[] args) throws IOException {

		FileReader fr=new FileReader("file1.txt");
		
		int i;
		while((i=fr.read())!=-1)
		{
			System.out.print((char)i);
		}
		fr.close();
	}

}
