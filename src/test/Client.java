package test;

public class Client implements Runnable {
	
	private final String ADD = "add";
	private final String GET = "get";
	
	private String nume, actiune;
	int suma;
	private Banca banca;
	
	public Client(String actiune, String nume, Banca banca, int suma) {
		this.suma = suma;
		this.actiune = actiune;
		this.nume = nume;
		this.banca = banca;
	}

	public void run() {
		if (actiune.equals(ADD)) {
			banca.depune(suma, nume);
		}
		
		if (actiune.equals(GET)) {
			banca.retrage(suma, nume);
		}
	}
	
}
