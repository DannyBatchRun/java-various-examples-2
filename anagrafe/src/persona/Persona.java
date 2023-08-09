package persona;

public class Persona {
	
	//Dichiaro i valori della classe Persona
	public String nome;
	public int eta;
	public String cognome;
	
	//dichiaro il costruttore Persona
	public Persona(){
		
	}
	
	//dichiaro il costruttore parametrizzato con all'interno i this e i parametri di riferimento
	//a quei valori
	public Persona (String nome, int eta, String cognome) {
		this.nome = nome;
		this.eta = eta;
		this.cognome = cognome;
	}
	
	//metodo che prende in input due valori di tipo Stringa in un Oggetto, cioè nome e cognome
	//e li stampo a video
	
	public void dettagliPersona(Persona tizioUno, Persona tizioDue) {
		System.out.println("Questa persona ha come nome " + tizioUno.nome + " e cognome " +
							tizioUno.cognome + " e come età ha " + tizioUno.eta + " anni.");
		System.out.println("Questa persona ha come nome " + tizioDue.nome + " e cognome " +
							tizioDue.cognome + " e come età ha " + tizioDue.eta + " anni.");
	}
	
	//Metodo che mette a confronto il valore tra l'età di due oggetti
	
	public void differenzaEta(Persona tizioUno, Persona tizioDue) {
		
		//Dichiaro una variabile dove viene sommata l'età dei due oggetti.
		int a = 0;
		a = tizioUno.eta - tizioDue.eta;
		
		//Facendo attenzione a math.abs, se il valore esce negativo
		//questo lo trasforma in un valore assoluto. Ossia se l'età risulta -1
		//nel system.out.println esce l'1
		
		System.out.println(tizioUno.nome + " e " + tizioDue.nome + " hanno " + Math.abs(a) + 
							" anni di differenza");
	}
}
