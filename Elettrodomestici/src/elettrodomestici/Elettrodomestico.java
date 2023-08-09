package elettrodomestici;

public class Elettrodomestico {
	
	private String marca;
	private String classe;
	private double prezzo;
	private boolean touchscreen;
	private String esito;
	
	public Elettrodomestico() {
		
	}
	
	public Elettrodomestico(String marca, String classe, double prezzo, boolean touchscreen) {
		this.marca = marca;
		this.classe = classe;
		this.prezzo = prezzo;
		this.touchscreen = touchscreen;
	}
	
	public String toString() {
		if (this.touchscreen == true) {
			this.esito = "Touch Screen Presente";
		} else {
			this.esito = "Touch Screen non Presente";
		}
		return "[" + this.marca + ", " + this.classe + ", " + this.prezzo + " Euro, " + this.esito + "]";
	}

	public String getMarca() {
		return marca;
	}

	public String getClasse() {
		return classe;
	}

	public double getPrezzo() {
		return prezzo;
	}

	public boolean isTouchscreen() {
		return touchscreen;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public void setClasse(String classe) {
		this.classe = classe;
	}

	public void setPrezzo(double prezzo) {
		this.prezzo = prezzo;
	}

	public void setTouchscreen(boolean touchscreen) {
		this.touchscreen = touchscreen;
	}
	
}
