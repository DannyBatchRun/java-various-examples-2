package esercizio.map;

import java.util.*;

public class TestMap {

	public static void main(String[] args) {
		
		Map<String, String> studenti = new HashMap<>();
		
		studenti.put("ME5969706", "Simone Bignola");
		studenti.put("PO3593963", "Daniele Mazzalla");
		studenti.put("P50505057", "Salvatore DePledio");
		
		Collection<String> matricole = studenti.keySet();
		
		for(String m : matricole) {
			System.out.println(m);
		}
		
		Collection<String> anagrafe = studenti.values();
		
		//Sintassi alternativa per la lambda expression
		anagrafe.forEach(nomi -> System.out.println(nomi));
	}

}
