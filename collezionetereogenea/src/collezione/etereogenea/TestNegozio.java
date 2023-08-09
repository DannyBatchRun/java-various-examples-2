package collezione.etereogenea;

public class TestNegozio {

	public static void main(String[] args) {
	
		//Questo è un esempio di collezione etereogenea, ossia che sto puntando a un oggetto di tipo Prodotto ma ogni
		//elemento di un Array, ma ogni posizione ha un intervallo di puntamento diverso. Per esempio, la posizione[0]
		//punta a Smartphone, la posizione[1] punta a Televisore, e così via.
		
		//In sintesi, sto creando un Array di oggetti di tipo Prodotto, dove al suo interno ci sono oggetti di tipo
		//o Smartphone, o Televisore.
		
		Prodotto[] listaProdotti = {
				new Smartphone("Samser", "Galaxier M4", 150.00, "Android", "Mediatea", 2, 4), 
				new Televisore("LV", "Motive", 300.00, "LED", "A++", false),
				new Smartphone("Pera", "Phone 13", 1000.00, "aOS", "Inteb", 4, 6),
				new Smartphone("Huawy", "p6", 200.00, "Android", "Snapdragon", 3, 6),
				new Televisore("Tobisha", "y4965", 450.00, "Plasma", "B", true),
			};
		
		Prodotto.stampaProdotti(listaProdotti);
		
	}

}
