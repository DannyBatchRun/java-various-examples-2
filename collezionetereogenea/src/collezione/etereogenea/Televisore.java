package collezione.etereogenea;

public class Televisore extends Prodotto {
	
	private String tipo;
	private String classeElettrica;
	private boolean rateizzo;
	private String esitoRateizzo;
	
	public Televisore() {
		
	}
	
	public Televisore(String nome, String modello, double prezzo, String tipo, String classeElettrica, boolean rateizzo) {
		super(nome,modello,prezzo);
		this.tipo = tipo;
		this.classeElettrica = classeElettrica;
		
		//Qui, non appena dichiaro la variabile true o false, questo viene puntato con il reference "this"
		//e poi chiama direttamente il metodo del set per entrare nella condizione e dire se questo televisore
		//si può pagare a rate oppure no (a seconda se il valore booleano è true o false)
		
		this.rateizzo = rateizzo;
		setRateizzo(rateizzo);
	}
	
	@Override
	public String toString() {
		return "[" + this.getNome() + ", con Modello " + this.getModello() + " . Ha un prezzo di : " + this.getPrezzo() + " Euro. E' un televisore a " + this.tipo + " con Classe Elettrica " + this.classeElettrica + " . " + this.esitoRateizzo + "]";
	}

	public String getTipo() {
		return tipo;
	}

	public String getClasseElettrica() {
		return classeElettrica;
	}

	public boolean isRateizzo() {
		return rateizzo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public void setClasseElettrica(String classeElettrica) {
		this.classeElettrica = classeElettrica;
	}

	public void setRateizzo(boolean rateizzo) {
		if (this.rateizzo == true) {
			this.esitoRateizzo = "Si può pagare a Rate.";
		} else {
			this.esitoRateizzo = "Non si può pagare a Rate.";
		}
	}

}
