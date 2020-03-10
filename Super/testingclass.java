package Super;


           class  Animal{
	
	String colour= "Brown";
	}

          class Monky extends Animal {
        	  String colour= "black";
          
            void printcolour() {
            	
            	System.out.println(colour);
            	System.out.println(super.colour);
            }
          
          
          
          }

public class testingclass {

	public static void main(String[] args) {
		
		
		
		Monky m=new Monky();
        m.printcolour();
	}

}
