package elettrodomestici;

public class Negozio {

	public String nome;
	public String indirizzo;
	Elettrodomestico[] articoli;
	
	public Negozio() {
		
	}
	
	public Negozio(String nome, String indirizzo, Elettrodomestico[] articoli) {
		this.nome = nome;
		this.indirizzo = indirizzo;
		this.articoli = articoli;
	}
	
	public String toString() {
		return "Benvenuti nel Negozio " + this.nome + "! Ci troviamo in " + this.indirizzo;
	}
	
	public Elettrodomestico[] filtraElettrodomestico(Filter filtraggio) {
		Elettrodomestico[] sottocategoria = new Elettrodomestico[10];
		for (int i = 0, j = 0; i < articoli.length; i++) {
			if (filtraggio.filtraElettrodomestico(articoli[i])) {
				sottocategoria[j] = articoli[i];
				j++;
			}
		}
		return sottocategoria;
	}

	public String getNome() {
		return nome;
	}

	public String getIndirizzo() {
		return indirizzo;
	}

	public Elettrodomestico[] getArticoli() {
		return articoli;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setIndirizzo(String indirizzo) {
		this.indirizzo = indirizzo;
	}

	public void setArticoli(Elettrodomestico[] articoli) {
		this.articoli = articoli;
	}
	
	
}
