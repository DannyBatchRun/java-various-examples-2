package collection.oggetti;

public class Computer {
	
	private String nome;
	private String marca;
	private double prezzo;
	
	public Computer() {
		
	}

	public Computer(String nome, String marca, double prezzo) {
		this.nome = nome;
		this.marca = marca;
		this.prezzo = prezzo;
	}

	public String getNome() {
		return nome;
	}

	public String getMarca() {
		return marca;
	}

	public double getPrezzo() {
		return prezzo;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public void setPrezzo(double prezzo) {
		this.prezzo = prezzo;
	}

	@Override
	public String toString() {
		return "Computer [nome=" + nome + ", marca=" + marca + ", prezzo=" + prezzo + "]";
	}

}
