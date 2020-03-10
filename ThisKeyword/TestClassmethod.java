package ThisKeyword;
// To create a this keyword to invoke method
            class A{

	void display() {  System.out.println("Hellow world ");}
	
	
	void displaymain() {
		
		System.out.println("this world");
		this.display();
		
	}
	}
		
	public class TestClassmethod {
	public static void main(String[] args) {
      A a=new A();
      
	a.displaymain();	
		
	}
	}

