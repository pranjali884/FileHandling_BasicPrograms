package file;

import java.io.*;

public class GfgFile {

	public static void main(String[] args)throws IOException {
		
		File fl=new File("gffile.txt");
		
		if(fl.createNewFile())
		{
			System.out.println("file is created");
		}
		else
		{
			System.out.println("file is alredy there");
		}
	}

}
