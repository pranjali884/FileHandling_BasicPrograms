package file;

import java.io.*;

public class EmpSerilizable implements Serializable {
	public int empid;
	public String empname;
	public String Cname;
	
	public int getEmpid()
	{
		return empid;
	}
	public void setEmpid(int empid)
	{
		this.empid=empid;
	}
	public String getEmpname()
	{
		return empname;
	}
	public void setEmpname(String empname)
	{
		this.empname=empname;
	}
	public String getCname()
	{
		return Cname;
	}
	public void  setCname(String Cname)
	{
		this.Cname=Cname;
	}
	
	
}
