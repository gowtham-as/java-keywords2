package Super;

class Chennaicity {
	Chennaicity () {
		
		System.out.println("OMR is created");
	} }
class ChennaiNorth extends Chennaicity  {
	
	ChennaiNorth () {
		super();
		System.out.println("MGR chennai central railway station was created");
	}
}


public class testclass2 {
	 
	   public static void main(String[] args) {
		   ChennaiNorth cn=new ChennaiNorth();

	}

}
