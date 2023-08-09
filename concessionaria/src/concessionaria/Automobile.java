package concessionaria;

public class Automobile extends Veicolo {
	
	
	public Automobile() {
		
	}
	
	public Automobile(String nome, String modello, double prezzo, int cilindrata) {
		super(nome, modello, prezzo, cilindrata);
	}
	
	public String toString() {
		return super.toString() + "\n";
	}
	
	@Override
	public void acceleraVeicolo() {
		//Ho messo una stringa per un parametro superiore a 130, perchè così avverto l'utente del limite di velocità
		if(chilometriorari > 130) {
			System.out.println("ATTENZIONE : Stai superando il limite di Velocità previsto dalla legge");
		} 
		
		if(chilometriorari >= 200) {
			System.out.println("L'Automobile non può accelerare più di così. E ti prendi una multa per eccesso di velocità.");
		} else {
			chilometriorari += 10;
			System.out.println("L'Automobile accelera e va a una velocità di " + chilometriorari + " KmH");
		}
		
	}
	
	@Override
	public void deceleraVeicolo() {
		if(chilometriorari > 130) {
			System.out.println("ATTENZIONE : Stai superando il limite di Velocità previsto dalla legge");
		}
		
		if(chilometriorari <= 0) {
			System.out.println("L'Automobile è Ferma, non puoi decelerare");
		} if (chilometriorari >= 10){
			chilometriorari -= 10;
			if (chilometriorari != 0) {
				System.out.println("L'Automobile decelera e va a una velocità di " + chilometriorari + " KmH");
			} else {
				System.out.println("L'Automobile si è fermata");
			}
		}
	}

}
