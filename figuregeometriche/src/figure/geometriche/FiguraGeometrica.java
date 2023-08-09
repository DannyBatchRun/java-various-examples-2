package figure.geometriche;

public abstract class FiguraGeometrica implements Misurabile {
	
	private double perimetro;
	private double area;
	
	public FiguraGeometrica () {
		
	}
	
	public FiguraGeometrica(double perimetro, double area) {
		this.perimetro = perimetro;
		this.area = area;
	}
	
	public double getPerimetro() {
		return perimetro;
	}
	
	public void setPerimetro(double perimetro) {
		this.perimetro = perimetro;
	}
	
	public double getArea() {
		return area;
	}
	
	public void setArea(double area) {
		this.area = area;
	}
	
	public void calcolaAreaQuad() {
		System.out.println("Calcolo l'Area");
		calcolaArea();
	}
	
	public void calcolaPerimetro() {
		System.out.println("Calcolo il Perimetro");
	}
	
}
