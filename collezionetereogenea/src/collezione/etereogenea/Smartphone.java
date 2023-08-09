package collezione.etereogenea;

public class Smartphone extends Prodotto {

	private String sistemaOperativo;
	private String processore;
	private int memoriaRam;
	private int memoriaInterna;
	
	public Smartphone() {
		
	}
	
	public Smartphone(String nome, String modello, double prezzo, String sistemaOperativo, String processore, int memoriaRam, int memoriaInterna) {
		super(nome,modello,prezzo);
		this.sistemaOperativo = sistemaOperativo;
		this.processore = processore;
		this.memoriaRam = memoriaRam;
		this.memoriaInterna = memoriaInterna;
	}
	
	@Override
	public String toString() {
		return "[" + this.getNome() + ", con Modello " + this.getModello() + " . Ha un prezzo di : " + this.getPrezzo() + " Euro. Porta un Sistema Operativo " + " RAM di " + this.memoriaRam + " GB e " + this.memoriaInterna + " GB di Memoria Interna.]";
		
	}

	public String getSistemaOperativo() {
		return sistemaOperativo;
	}

	public String getProcessore() {
		return processore;
	}

	public int getMemoriaRam() {
		return memoriaRam;
	}

	public int getMemoriaInterna() {
		return memoriaInterna;
	}

	public void setSistemaOperativo(String sistemaOperativo) {
		this.sistemaOperativo = sistemaOperativo;
	}

	public void setProcessore(String processore) {
		this.processore = processore;
	}

	public void setMemoriaRam(int memoriaRam) {
		this.memoriaRam = memoriaRam;
	}

	public void setMemoriaInterna(int memoriaInterna) {
		this.memoriaInterna = memoriaInterna;
	}
	
}
