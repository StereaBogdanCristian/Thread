package test;

public class OperatiiBanca {
	
	public static void main(String[] args) {
		
		Banca banca = new Banca(100);
		
		Client c1 = new Client("add", "Mihai", banca, 200);
		Client c2 = new Client("get", "Ion", banca, 300);
		Client c3 = new Client("add", "Radu", banca, 100);
		
		Thread t1 = new Thread(c1);
		Thread t2 = new Thread(c2);
		Thread t3 = new Thread(c3);
		
		t1.start();
		t2.start();
		t3.start();
		
	}

}
