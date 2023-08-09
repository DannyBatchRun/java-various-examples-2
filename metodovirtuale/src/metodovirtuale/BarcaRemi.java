package metodovirtuale;

public class BarcaRemi {
	
	private String nome;
	private int capienza;
	private int lunghezza;
	private int larghezza;
	
	public BarcaRemi() {
		
	}
	
	public BarcaRemi(String nome, int capienza, int lunghezza, int larghezza) {
		this.nome = nome;
		this.capienza = capienza;
		this.lunghezza = lunghezza;
		this.larghezza = larghezza;
	}
	
	@Override
	public String toString() {
		return "[Barca a Remi : " + this.nome + " con capienza di " + this.capienza + " persone, di lunghezza " + this.lunghezza + " cm e larghezza di " + this.larghezza + " cm.]";
	}

	public String getNome() {
		return nome;
	}

	public int getCapienza() {
		return capienza;
	}

	public int getLunghezza() {
		return lunghezza;
	}

	public int getLarghezza() {
		return larghezza;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setCapienza(int capienza) {
		this.capienza = capienza;
	}

	public void setLunghezza(int lunghezza) {
		this.lunghezza = lunghezza;
	}

	public void setLarghezza(int larghezza) {
		this.larghezza = larghezza;
	}
	
}
