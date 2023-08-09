package concessionaria;

public class Concessionaria {
	
	private String nome;
	private String indirizzo;
	private Veicolo[] concessionaria;
	
	public Concessionaria() {
		
	}
	
	public Concessionaria(String nome, String indirizzo) {
		this.nome = nome;
		this.indirizzo = indirizzo;
		this.concessionaria = new Veicolo[12];
	}

	
	public void aggiungiVeicolo(Veicolo a) {
	
		for(int i = 0; i < this.concessionaria.length; i++) {
			if(this.concessionaria[i] == null) {
				this.concessionaria[i] = a;
				break;
			}
		}
	}
	
	public void acquistaVeicolo(Veicolo a) {
		
		for (int i = 0; i < this.concessionaria.length; i++) {
			if(a == this.concessionaria[i]) {
				this.concessionaria[i] = null;
				System.out.println("Articolo Acquistato e Rimosso dal Database\n");
				break;
			}
		}
		
	}
	
	public void stampaVeicolo() {
		for (int i = 0; i < this.concessionaria.length; i++) {
			if (this.concessionaria[i] != null) {
				System.out.println(this.concessionaria[i]);
			}
		}
	}
	
	@Override
	public String toString() {
		return "Benvenuti nella Concessionaria " + this.nome + ". Ci troviamo in " + this.indirizzo;
	}

	public String getNome() {
		return nome;
	}

	public String getIndirizzo() {
		return indirizzo;
	}

	public Veicolo[] getConcessionaria() {
		return concessionaria;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setIndirizzo(String indirizzo) {
		this.indirizzo = indirizzo;
	}

	public void setConcessionaria(Veicolo[] concessionaria) {
		this.concessionaria = concessionaria;
	}
	
 }
