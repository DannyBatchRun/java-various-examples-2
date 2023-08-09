package figure.geometriche;

public class Cerchio extends FiguraGeometrica {
	
	private double raggio;
	
	public Cerchio() {
		
	}
	
	public Cerchio(double raggio) {
		this.raggio = raggio;
		calcolaArea();
		calcolaPerimetro();
	}

	public double getRaggio() {
		return raggio;
	}
	
	public void setRaggio(double raggio) {
		this.raggio = raggio;
		calcolaArea();
		calcolaPerimetro();
	}
	
	public void calcolaArea() {
		setArea(Math.pow(this.raggio, this.raggio) * Math.PI);
	}
	
	public void calcolaPerimetro() {
		setPerimetro((this.raggio + this.raggio) * Math.PI);
	}
	
	public String toString() {
		return "Il Perimetro del Cerchio è di " + getPerimetro() + ". E l'Area è di " + getArea();
	}
}
