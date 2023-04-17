package file;

import java.io.*;

public class GfgFileReader {

	public static void main(String[] args) throws IOException {
		
		FileReader fr=new FileReader("gffile.text");
		
		int i;
		while((i=fr.read())!=-1)
		{
			System.out.print((char)i);
		}
		fr.close();
	}

}
