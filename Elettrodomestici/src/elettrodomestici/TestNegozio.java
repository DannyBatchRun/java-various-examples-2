package elettrodomestici;

public class TestNegozio {

	public static void main(String[] args) {
		
		
		Elettrodomestico[] articoli = {
				new Elettrodomestico("Daewa", "A++", 3000.00, true),
				new Elettrodomestico("Samsar", "B", 150.00, false),
				new Elettrodomestico("LV", "C", 100.00, false),
				new Elettrodomestico("Tobisha", "A++", 250.00, true)
		};
		
		Negozio negoUno = new Negozio ("Esperto", "Via Napoli n°2", articoli);
		System.out.println(negoUno + "\n");
		
		Elettrodomestico[] classeMigliore = negoUno.filtraElettrodomestico(new Filter() {

			@Override
			public boolean filtraElettrodomestico(Elettrodomestico elettrodomestico) {
				return "A++".equals(elettrodomestico.getClasse());
			}
			
		});
		
		for (Elettrodomestico art : classeMigliore) {
			if (art != null) {
				System.out.println(art);
			}
		}
		
	}

}
