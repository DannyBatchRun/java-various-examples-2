package myexceptions;

public class TestException {

	public static void main(String[] args) {

		try {
			int[] T = null;
			T[0] = 7;
		} catch (NullPointerException exc) {
			exc.printStackTrace();
			System.out.println("Hai Inserito un Valore con un tipo non corretto.\n");
		}
		
		try {
			String s = null;
			int l = s.length();
		} catch (NullPointerException exc) {
			exc.printStackTrace();
			System.out.println("Hai inserito un Valore con un tipo non corretto.\n");
		}
		
		int[] dividendi = {20,25,30,40,50,60,70,80,90};
		int divisore = 0;
		
		for (int i = 0; i < dividendi.length; i++) {
			Divisione.effettuaDivisione(dividendi[i], divisore);
		}
		
		
	}
}
