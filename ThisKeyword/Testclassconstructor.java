package ThisKeyword;
// to create this keyword for invoke constructor

class Colours {
	
	Colours() 
	{ System.out.println("MY Favirout colour is blue");}
	
	Colours(String X ) {
		
		this();
		System.out.println(X);
		
		
		
	}
}

public class Testclassconstructor {

	public static void main(String[] args) {
		
		Colours c=new Colours("But also I like orange");
		
	
	}
	}
