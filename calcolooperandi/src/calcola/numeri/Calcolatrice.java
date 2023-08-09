package calcola.numeri;

public class Calcolatrice {

	public static void main(String[] args) {
		
		double operandoUno = 5;
		double operandoDue = 5.45;
		double risultato = 0;
			
	System.out.println("Uso i valori " + operandoUno + " e " + operandoDue + " per effettuare varie operazioni.");
	
	risultato = sommaNumeri(operandoUno, operandoDue);
	System.out.println("Addizione = " + risultato);
	risultato = differenzaNumeri (operandoUno, operandoDue);
	System.out.println("Sottrazione = " + risultato);
	risultato = prodottoNumeri (operandoUno, operandoDue);
	System.out.println("Moltiplicazione = " + risultato);
	risultato = divisioneNumeri (operandoUno, operandoDue);
	System.out.println("Divisione = " + risultato);

	}
	
	public static double sommaNumeri(double a, double b) {
		double risultato = 0;
		risultato = a + b;
		return risultato;
	}
	
	public static double differenzaNumeri(double a, double b) {
		double risultato = 0;
		risultato = a - b;
		return risultato;
	}
	
	public static double prodottoNumeri (double a, double b) {
		double risultato = 0;
		risultato = a * b;
		return risultato;
	}
	
	public static double divisioneNumeri (double a, double b) {
		double risultato = 0;
		risultato = a / b;
		return risultato;
	}

}
