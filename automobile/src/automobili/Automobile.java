package automobili;

public class Automobile {
	
	private String modello;
	private String marca;
	private long cilindrata;
	
	public Automobile() {
		
	}
	
	public Automobile(String modello, String marca, long cilindrata) {
		this.modello = modello;
		this.marca = marca;
		this.setCilindrata(cilindrata);
	}
	
	public String getModello() {
		return modello;
	}
	
	public void setModello(String model) {
		this.modello = model;
	}
	
	public String getMarca() {
		return marca;
	}
	
	public void setMarca(String brand) {
		this.marca = brand;
	}
	
	public long getCilindrata() {
		return cilindrata;
	}
	
	public void setCilindrata(long cilindrata) {
		this.cilindrata = cilindrata;
		if (cilindrata > 30000) {
			System.out.println("La cilindrata inserita non è corretta sull'Auto " + marca);
			this.cilindrata = 0;
		}
	}
	
	public String toString() {
		return "Marca Automobile : " + marca + ", Modello " + modello + ", con cilindrata "  + cilindrata;
	}
	
}
