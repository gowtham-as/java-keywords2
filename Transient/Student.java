package Transient;


import java.io.Serializable;
   
// the variable which declares the transient it cannot be serialized

public class Student implements Serializable {

	int rollno;
	String Name;
  transient	int age;   //Now it could not be serialized

  
  public Student (int rollno, String Name, int age) {
	  
	  this.rollno= rollno;
	  this.Name= Name;
	  this.age=age;
	  
	  
	  
  }
}