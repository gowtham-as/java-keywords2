package Super;

    class A {
    	
    	void salem() {
    		
    		System.out.println("forest");
    		
    	} }
    class Government extends A {
    	
    	void salem() {
    		System.out.println("save tress");
    		System.out.println("save river");
    		System.out.println("save birds");
    		System.out.println("save animals");
    		
    		}
    void salemprogress() {
    	   
    	super.salem();
    	salem();
    }
    
    
    }
    public class testclass1 {

	public static void main(String[] args) {

		Government gh=new Government();
		  gh.salemprogress();
		
		
		
	}

}
