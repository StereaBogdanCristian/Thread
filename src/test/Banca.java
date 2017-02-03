package test;

public class Banca {
	
	private int cont;
	
	public Banca (int cont) {
		this.cont = cont;
		System.out.println("In cont exista o suma disponibila de " + cont + " lei");
	}
	
	public synchronized void  depune (int suma, String nume) {
		cont = cont + suma;
		System.out.println(nume + " a depus " + suma + " lei");
		System.out.println("In cont exista o suma disponibila de " + cont + " lei");
		this.notifyAll();
	}

	public synchronized void retrage(int suma, String nume) {
		cont = cont - suma;
		System.out.println(nume + " a retras " + suma + " lei");
		System.out.println("In cont exista o suma disponibila de " + cont + " lei");
		this.notifyAll();
	}
}
