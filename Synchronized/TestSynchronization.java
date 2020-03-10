package Synchronized;
class Table {
	
	synchronized void printtabel(int n) {
		
		for(int i=1; i<=5; i++) {
			System.out.println(n*i);
		
		try {
			
			Thread.sleep(400);
		} catch (Exception e) {
			System.out.println(e);
		}
		
	}
	
	
	}
	
	
}

class ThreadSample extends Thread {
	
	Table t;
	ThreadSample (Table t)  {
		
		this.t=t;
	}
   public void run() {
	   t.printtabel(5);
	   
   }
}


class ThreadSample1 extends Thread {
	
	Table t;
	ThreadSample1 (Table t)   {
		this.t=t;
	}
	public void run() {
		t.printtabel(100);
		
		
	}
}


public class TestSynchronization {

	public static void main(String[] args) {
	
		Table g=new Table();
		ThreadSample T1=new ThreadSample(g);
		ThreadSample1 T2=new ThreadSample1(g);
		
		T1.start();
		T2.start();
		

	}

}
