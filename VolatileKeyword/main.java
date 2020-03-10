
package VolatileKeyword;

public class main {

	private final static int noOfThreads= 2;

	public static void main(String[] args) throws InterruptedException {
		
		
		VolatileExample vs= new VolatileExample();   //create object for volatile class
		
		Thread[] threads= new Thread[noOfThreads];     //create thread array
		
		
		for(int i=0; i<noOfThreads; ++i)
		
			threads[i] = new mythread (vs);
		  
		for(int i=0; i<noOfThreads; ++i)   //Star all reader threads
         threads[i].start();
		
		
		for(int i=0; i<noOfThreads; ++i)
			threads[i].join();
		
		

	}

}
