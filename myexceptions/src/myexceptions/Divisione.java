package myexceptions;

public class Divisione {
	

	public static void effettuaDivisione(int dividendo, int divisore) throws ArithmeticException {
		
		if (divisore != 0) {
			int risultato = 0;
			risultato = dividendo / divisore;
			System.out.println("La divisione di " + dividendo + " e " + divisore + " è " + risultato);
		} else {
			System.out.println("E' impossibile fare la Divisione per Zero. Di seguito l'errore :\n");
			throw new ArithmeticException();
		}
	}
}

