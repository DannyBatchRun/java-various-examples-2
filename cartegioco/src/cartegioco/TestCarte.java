package cartegioco;

import static cartegioco.CarteGioco.CUORI;
import static cartegioco.CarteGioco.QUADRI;
import static cartegioco.CarteGioco.FIORI;
import static cartegioco.CarteGioco.PICCHE;

public class TestCarte {

	public static void main(String[] args) {
		
		CUORI.giocaCarte(QUADRI);
		QUADRI.giocaCarte(CUORI);
		
		FIORI.giocaCarte(CUORI);
		CUORI.giocaCarte(FIORI);
		
		CUORI.giocaCarte(PICCHE);
		PICCHE.giocaCarte(CUORI);
		
		PICCHE.giocaCarte(CUORI);

	}

}
