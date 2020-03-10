package Throw;


// here we are going to throw the arithmetic exception with the help of throw.
public class ExampleThrow {

	static void validate(int age) {
		if(age<18) 
			
			throw  new ArithmeticException ("not valid");
		
		else 
			System.out.println("valid");
		}
	
	public static void main(String[] args) {
		
	validate(13);	

	System.out.println("restof the code");
	
	}

}
