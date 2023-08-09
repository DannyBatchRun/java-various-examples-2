package collection.oggetti;

import java.util.*;

public class Test {

	public static void main(String[] args) {

		List<Computer> computer = new ArrayList<>();
		
		computer.add(new Computer("HV", "630", 300.0));
		computer.add(new Computer("Tobisha", "A340550", 450.0));
		computer.add(new Computer("PackageBel", "PO3456", 1000.0));
		computer.add(new Computer("HV", "HV40560", 3000.0));
		
		int corris = 0;
		
		for (Computer c : computer) {
			System.out.println(c);
			if(c.getNome().equals("HV")) {
				corris++;
			}
		}
		
		System.out.println("Sono state trovate " + corris + " corrispondenze per il computer HV");
	}

}
