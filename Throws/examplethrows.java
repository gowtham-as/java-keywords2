package Throws;


import java.io.IOException;

public class examplethrows {
	
	void G () throws IOException {
		throw new IOException("Not valid");
	}
	
void H() throws IOException {

	G();
	}
void p() {
	
	try {
		
		H();
	} catch (Exception  e) {System.out.println("exception was handled"); }
	
	
	}

	public static void main(String[] args) {
	
  examplethrows es= new examplethrows();
           es.p();
           System.out.println("normal flow");
	}

}
