
package VolatileKeyword;

public class mythread extends Thread{

private final	VolatileExample exe;
	public mythread (VolatileExample exe) {
		this.exe=exe;
	}
		
		
	public void run() {
	
		int oldvalue = exe.getCounter();
		System.out.println("[Thread"+ Thread.currentThread().getId()+"]:oldvalue="+oldvalue);
		exe.increaseCounter();
		
		int newvalue = exe.getCounter();
		System.out.println("[Thread"+ Thread.currentThread().getId()+"]:newvalue="+newvalue);
	
	}
}
