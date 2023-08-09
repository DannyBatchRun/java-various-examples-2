package figure.geometriche;

public class Triangolo extends FiguraGeometrica {
	
	private double latoUno;
	private double latoDue;
	private double latoTre;
	private double base;
	private double altezza;
	
	public Triangolo() {
		
	}
	
	public Triangolo (double latoUno, double latoDue, double latoTre, double base, double altezza) {
		this.latoUno = latoUno;
		this.latoDue = latoDue;
		this.latoTre = latoTre;
		this.base = base;
		this.altezza = altezza;
		calcolaPerimetro();
		calcolaArea();
	}
	
	public double getLatoUno() {
		return latoUno;
	}
	
	public void setLatoUno(double latoUno) {
		this.latoUno = latoUno;
		//calcolaPerimetro();
		//calcolaArea();
	}
	
	public double getLatoDue() {
		return latoDue;
	}
	
	public void setLatoDue(double latoDue) {
		this.latoDue = latoDue;
		//calcolaPerimetro();
	}
	
	public double getLatoTre() {
		return latoTre;
	}
	
	public void setLatoTre(double latoTre) {
		this.latoTre = latoTre;
		//calcolaPerimetro();
	}
	
	public double getBase() {
		return base;
		
	}
	
	public void setBase(double base) {
		this.base = base;
	}
	
	public double getAltezza() {
		return altezza;
	}
	
	public void setAltezza(double altezza) {
		this.altezza = altezza;
		calcolaArea();
	}
	
	public void calcolaPerimetro() {
		setPerimetro(this.latoUno + this.latoDue + this.latoTre);
	}
	
	public void calcolaArea() {
		setArea((this.base * this.altezza) / 2);
	}
	
	public String toString() {
		return "Il Perimetro del Triangolo è di " + getPerimetro() + ". E l'Area è di " + getArea();	
	}
}
