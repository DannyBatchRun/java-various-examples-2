package collezione.etereogenea;

public abstract class Prodotto {

	private String nome;
	private String modello;
	private double prezzo;
	
	public Prodotto() {
		
	}
	
	public Prodotto(String nome, String modello, double prezzo) {
		this.nome = nome;
		this.modello = modello;
		this.prezzo = prezzo;
	}
	
	//Qui chiamo un ciclo for per stampare tutti i prodotti e andare daccapo con l'escape \n,
	//ma potevo molto semplicemente semplificare la sintassi anche in questo modo qua con l'enhancedFor :
	//for (Prodotto p : prodotti)
	
	public static void stampaProdotti(Prodotto[] prodotti) {
		for (int i = 0; i < prodotti.length; i++) {
			if (prodotti[i] != null) {
				System.out.println(prodotti[i] + "\n");
			}
		}
	}

	public String getNome() {
		return nome;
	}

	public String getModello() {
		return modello;
	}

	public double getPrezzo() {
		return prezzo;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setModello(String modello) {
		this.modello = modello;
	}

	public void setPrezzo(double prezzo) {
		this.prezzo = prezzo;
	}

	
}
