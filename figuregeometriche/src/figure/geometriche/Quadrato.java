package figure.geometriche;

public class Quadrato extends FiguraGeometrica {
	
	private double lato;
	
	public Quadrato() {
		
	}
	
	public Quadrato(double lato) {
		this.lato = lato;
		calcolaPerimetro();
		calcolaArea();
	}
	
	public void setLato(double lato) {
		this.lato = lato;
		calcolaPerimetro();
		calcolaArea();
	}
	
	public double getLato() {
		return lato;
	}
	
	public void calcolaPerimetro() {
		setPerimetro(lato * 4);
	}
	
	public void calcolaArea() {
		setArea(lato * lato);
	}
	
	public String toString() {
		return "Il Perimetro del Quadrato è di " + getPerimetro() +  ". E l'Area del Quadrato è di " + getArea();
	}
	
}
