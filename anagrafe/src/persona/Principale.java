package persona;

public class Principale {

	public static void main(String[] args) {
		
		//Dichiaro due oggetti con i parametri prestabiliti dalla classe Persona
		Persona p2 = new Persona("Daniele", 31, "Mazalla");
		Persona p1 = new Persona("Renzy", 30, "Romolo");
		
		//Richiamo il metodo mettendo nelle parentesi, due oggetti, in questo caso p1 e p2
		
		p1.dettagliPersona(p1,p2);
		p1.differenzaEta(p1,p2);
		
	}

}
