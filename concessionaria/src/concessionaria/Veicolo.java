package concessionaria;

public abstract class Veicolo {
	
	private String nome;
	private String modello;
	private double prezzo;
	private int cilindrata;
	int chilometriorari = 0;
	
	public Veicolo() {
		
	}
	
	public Veicolo(String nome, String modello, double prezzo, int cilindrata) {
		this.nome = nome;
		this.modello = modello;
		this.prezzo = prezzo;
		this.cilindrata = cilindrata;
	}
	
	public String toString() {
		return "[" + this.nome + "," + this.modello + "," + this.prezzo + "," + this.cilindrata + "]";
	}
	
	public abstract void acceleraVeicolo();
	
	public abstract void deceleraVeicolo();
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getModello() {
		return modello;
	}

	public void setModello(String modello) {
		this.modello = modello;
	}

	public double getPrezzo() {
		return prezzo;
	}

	public void setPrezzo(double prezzo) {
		this.prezzo = prezzo;
	}

	public int getCilindrata() {
		return cilindrata;
	}

	public void setCilindrata(int cilindrata) {
		this.cilindrata = cilindrata;
	}
	
	
	
}
