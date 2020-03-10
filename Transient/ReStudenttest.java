package Transient;

import java.io.*;
import java.io.FileNotFoundException;
public class ReStudenttest {

	public static void main(String args[]) throws Exception {
		
		Student s= new Student(1111,"knnan",22);
		
		FileOutputStream  f= new FileOutputStream("‪f.txt");
		
		ObjectOutputStream out=new ObjectOutputStream(f);
		
		out.writeObject(s);
		out.flush();
		
		out.close();
		f.close();
		
		
		
	       System.out.println("success");

	}

}
