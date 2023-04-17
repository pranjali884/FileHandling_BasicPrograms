package file;

import java.io.File;
import java.io.IOException;

public class Fileeg {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File newFile=new File("fileexamples.txt");
		
		if(newFile.createNewFile())
		{
			System.out.println("file created");
		}
		else
		{
			System.out.println("file exists");
		}

	}

}
