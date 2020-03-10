package Transient;

import java.io.*;
import java.io.FileNotFoundException;



public class Studenttest1 {

	public static void main(String[] args)throws Exception {
	
	  ObjectInputStream in=new ObjectInputStream (new FileInputStream("‪f.txt"));
	  Student s=(Student) in.readObject();
	  
		System.out.println(s.rollno+""+s.Name+""+s.age);
		in.close();

	}

}
