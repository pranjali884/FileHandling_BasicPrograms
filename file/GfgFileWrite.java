package file;

import java.io.*;

public class GfgFileWrite {

	public static void main(String[] args) throws IOException {
		
		FileWriter fw=new FileWriter("gffile.text");
		fw.write("hey ! i m writing something interesting...");
		
		fw.close();
		System.out.println("data writing successfully");
		
	}

}
