package file;

import java.io.*;

public class EmpSerilizableWriteFile {

	public static void main(String[] args) throws IOException {
			
		FileOutputStream file=new FileOutputStream("file1.txt"); //create object and write file name
		
		ObjectOutputStream obj=new ObjectOutputStream(file);
		
		EmpSerilizable emp=new EmpSerilizable();
		emp.empid=101;
		emp.empname="Pranjali";
		emp.Cname="Accenture";
		
		obj.writeObject(emp);
		System.out.println("data added");
		
		
		

	}

}
