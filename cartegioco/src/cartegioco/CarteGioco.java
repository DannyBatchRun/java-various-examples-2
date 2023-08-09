package cartegioco;

public enum CarteGioco implements ConfrontaCarte {
	CUORI, QUADRI, FIORI, PICCHE;

	@Override
	public void giocaCarte(CarteGioco carta) {
		
		if (carta.ordinal() > this.ordinal()) {
			System.out.println("Hai vinto!");
		} else{
			System.out.println("Hai perso!");
		}
		
		if (this.ordinal() == 3) {
			System.out.println("Hai la carta di Picche, non puoi vincere!");
		}
	}
}
