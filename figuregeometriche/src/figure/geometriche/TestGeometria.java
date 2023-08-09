package figure.geometriche;

public class TestGeometria {

	public static void main(String[] args) {
		
		//Dichiaro un oggetto di tipo quadrato con un solo lato che calcola
		//perimetro e area
		
		Quadrato q1 = new Quadrato(7);
		System.out.println(q1);
		
		//Dichiaro un oggetto di tipo triangolo con tre lati diversi, base e altezza
		
		FiguraGeometrica t1 = new Triangolo(3,5,7,4,6);
		System.out.println(t1);
		
		//Dichiaro un oggetto di tipo cerchio con solo il raggio all'interno
		
		FiguraGeometrica c1 = new Cerchio(5);
		System.out.println(c1);
		
	}
		

}
