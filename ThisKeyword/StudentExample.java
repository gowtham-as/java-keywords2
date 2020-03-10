package ThisKeyword;

class Student {
	int rollno;
	String Name,Department;
	static String College_Name="Jits"; 
	
	
	
	
	Student (int rollno,String Name, String Department) {

		this.rollno=rollno;
		this.Name=Name;
		this.Department=Department;
	}
	void display () {
		
		System.out.println("roll_no:"+rollno+ "  "+"Name:"+Name+"  "+"Department:"+Department+ "   "+"College_Name:"+ "   "+College_Name);
	
	}
		
		
		
		
	}

	
public class StudentExample {

	public static void main(String[] args) {
	    Student  s1=new Student(1111,"Ganesh","ECE");
	    Student  s2=new Student(1112, "Ramesh","EIE");
	    Student  s3=new Student(1113, "harish", "Mec");
	    

                s1.display();
                s2.display();
                s3.display();
                
		
		
	}

}
