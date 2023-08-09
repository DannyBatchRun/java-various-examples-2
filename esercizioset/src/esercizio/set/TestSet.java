package esercizio.set;

import java.util.Set;
import java.util.TreeSet;
import java.util.ArrayList;

public class TestSet {
	
	public static void main(String[] args) {
		
		ArrayList<String> nazioni = new ArrayList<>();
		
		nazioni.add("Germania");
		nazioni.add("Spagna");
		nazioni.add("Francia");
		nazioni.add("Portogallo");
		String quintaNazione = nazioni.set(3, "Irlanda");
		nazioni.add(quintaNazione);

		Set<String> nazioneConv = new TreeSet<>(nazioni);
		
		System.out.println(nazioneConv);
			
			
		

	}

}
