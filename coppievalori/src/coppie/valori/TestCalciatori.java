package coppie.valori;

import java.util.*;

public class TestCalciatori {
	
	//Esercizio corretto.

	public static void main(String[] args) {
		
		TreeMap<String, String> calciatori = new TreeMap<>();
		
		calciatori.put("3035939", "Inzava");
		calciatori.put("7545474", "Laveza");
		calciatori.put("P230l2", "Inzali");
		calciatori.put("LE02n2", "Cavanyd");
		
		//utilizzare l'iterator nel caso in cui abbiamo bisogno di utilizzare il remove sulla mappa
		Iterator<Map.Entry<String, String>> iterCalciatori = calciatori.entrySet().iterator();
		
		while(iterCalciatori.hasNext()) {
			
			Map.Entry<String, String> calc = iterCalciatori.next();
			if(calc.getValue().equals("Inzali")) {
				iterCalciatori.remove();
			}
		}
	
		
		System.out.println(calciatori);
	}

}
