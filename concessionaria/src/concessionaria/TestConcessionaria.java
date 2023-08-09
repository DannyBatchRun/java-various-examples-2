package concessionaria;

public class TestConcessionaria {

	public static void main(String[] args) {
		
		Veicolo a1 = new Apecar("Fiori", "Fiab", 3500.00, 200);
		
		//Accelero l'Apecar, partendo da 0 kmH, fino ad arrivare ad 80 kmH
		
		System.out.println("Sto simulando il seguente Veicolo " + a1);
		
		a1.acceleraVeicolo();
		a1.acceleraVeicolo();
		a1.acceleraVeicolo();
		a1.acceleraVeicolo();
		a1.acceleraVeicolo();
		a1.acceleraVeicolo();
		a1.acceleraVeicolo();
		a1.acceleraVeicolo();
		
		//A questo punto, riconosce il limite dei kilometri e quindi ti dice che non può accelerare
		//più di 80 kmh
		
		a1.acceleraVeicolo();
		
		//Inizio a far decelerare il veicolo, quindi togliendo di 10 kmH il mio contatore.
		
		a1.deceleraVeicolo();
		a1.deceleraVeicolo();
		a1.deceleraVeicolo();
		a1.deceleraVeicolo();
		a1.deceleraVeicolo();
		a1.deceleraVeicolo();
		a1.deceleraVeicolo();
		a1.deceleraVeicolo();
		a1.deceleraVeicolo();
		
		
		Veicolo m1 = new Motociclo("Ciao", "Ciao Service", 1000.00, 200);
		
		System.out.println("\nSto simulando il seguente Veicolo : " + m1);
		
		m1.acceleraVeicolo();
		m1.acceleraVeicolo();
		m1.acceleraVeicolo();
		m1.acceleraVeicolo();
		m1.acceleraVeicolo();
		m1.acceleraVeicolo();
		m1.acceleraVeicolo();
		m1.acceleraVeicolo();
		m1.acceleraVeicolo();
		m1.acceleraVeicolo();
		m1.acceleraVeicolo();
		m1.acceleraVeicolo();

		m1.deceleraVeicolo();
		m1.deceleraVeicolo();
		m1.deceleraVeicolo();
		m1.deceleraVeicolo();
		m1.deceleraVeicolo();
		m1.deceleraVeicolo();
		m1.deceleraVeicolo();
		m1.deceleraVeicolo();
		m1.deceleraVeicolo();
		m1.deceleraVeicolo();
		m1.deceleraVeicolo();
		m1.deceleraVeicolo();
		
		
		Veicolo au1 = new Automobile("Giulia", "Alpha", 5000.0, 500);
		
		System.out.println("\nSto simulando il seguente Veicolo : " + au1);
		
		au1.acceleraVeicolo();
		au1.acceleraVeicolo();
		au1.acceleraVeicolo();
		au1.acceleraVeicolo();
		au1.acceleraVeicolo();
		au1.acceleraVeicolo();
		au1.acceleraVeicolo();
		au1.acceleraVeicolo();
		au1.acceleraVeicolo();
		au1.acceleraVeicolo();
		au1.acceleraVeicolo();
		au1.acceleraVeicolo();
		au1.acceleraVeicolo();
		au1.acceleraVeicolo();
		au1.acceleraVeicolo();
		au1.acceleraVeicolo();
		au1.acceleraVeicolo();
		au1.acceleraVeicolo();
		au1.acceleraVeicolo();
		au1.acceleraVeicolo();
		au1.acceleraVeicolo();

		au1.deceleraVeicolo();
		au1.deceleraVeicolo();
		au1.deceleraVeicolo();
		au1.deceleraVeicolo();
		au1.deceleraVeicolo();
		au1.deceleraVeicolo();
		au1.deceleraVeicolo();
		au1.deceleraVeicolo();
		au1.deceleraVeicolo();
		au1.deceleraVeicolo();
		au1.deceleraVeicolo();
		au1.deceleraVeicolo();
		au1.deceleraVeicolo();
		au1.deceleraVeicolo();
		au1.deceleraVeicolo();
		au1.deceleraVeicolo();
		au1.deceleraVeicolo();
		au1.deceleraVeicolo();
		au1.deceleraVeicolo();
		au1.deceleraVeicolo();
		au1.deceleraVeicolo();
		
		Concessionaria concessionaria = new Concessionaria("Autonoleggio Acerba", "Via Roma n°2");
		
		System.out.println(concessionaria);
		
		
		System.out.println("\nAggiunta degli Articoli in Corso...\n");
		
		//Inserisco gli oggetti di tipo Veicolo nell'Array della Classe Concessionaria di tipo Veicolo
		
		concessionaria.aggiungiVeicolo(a1);
		concessionaria.aggiungiVeicolo(m1);
		concessionaria.aggiungiVeicolo(au1);
		
		System.out.println("Caricamento Completato." + "\n\nI seguenti articoli sono stati aggiunti :\n");
		
		//Stampo a video tutto l'Array di tipo Veicolo
		
		concessionaria.stampaVeicolo();
		
		System.out.println("Il Signor Rossi ha effettuato l'acquisto dei seguenti Veicoli :\n" + a1 + "\n" + m1);
		
		//L'Acquisto implica che cerca l'articolo a1, e se lo trova, lo rimuove dall'Array e lo rimpiazza con il null
		
		concessionaria.acquistaVeicolo(a1);
		concessionaria.acquistaVeicolo(m1);
		
		System.out.println("Nella Concessionaria, rimangono i seguenti Veicoli :\n");
		
		//E a questo punto, stampo di nuovo a video senza l'articolo Acquistato, in quanto rimosso dal database.
		
		concessionaria.stampaVeicolo();
		
	}

}
