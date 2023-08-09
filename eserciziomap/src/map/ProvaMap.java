package map;

import java.util.*;

public class ProvaMap {

	public static void main(String[] args) {
		
		Map<String, String> mappa = new HashMap<>();

		mappa.put("PL5678POK", "Cuore");
		mappa.put("AA456OEOR", "Sole");
		mappa.put("AB4ORGOPK", "Amore");
		
		System.out.println(mappa);	

		
		System.out.println("---------La Mappa Completa-------------");
		System.out.println(mappa);
		
		System.out.println("\n--------Solo le Chiavi--------------");
		Set<String> chiavi = mappa.keySet();
		System.out.println(chiavi);
		
		System.out.println("\n--------Solo i Valori---------------");
		Collection<String> valori = mappa.values();
		System.out.println(valori);
		
		System.out.println("\n---------Solo le Chiavi ma in NewLine---------");
		for (String k : chiavi) {
			System.out.println(k);
		}
		
		System.out.println("\n---------Solo i Valori ma in NewLine----------");
		for (String v : valori) {
			System.out.println(v);
		}
		System.out.println("\n");
		Iterator<Map.Entry<String, String>> i = mappa.entrySet().iterator(); 
		
		while(i.hasNext()) {
            Map.Entry <String, String> coppia = i.next();
            System.out.println("Qual è l'elemento prossimo?");
            System.out.println(coppia);
            if(coppia.getKey().startsWith("A")) {
                            i.remove();
             }
            System.out.println("Mi trovo sulla prossima posizione?");
            System.out.println(i.hasNext());
		}
		
		System.out.println("\n----------Mappa Modificata---------------");
		
		System.out.println(mappa);
		
		List<String> lista = new ArrayList<>();
		
		lista.add("Pane");
		lista.add("Latte");
		lista.add("Coca-Cola");
		lista.add("Detersivo");
		
	}
}