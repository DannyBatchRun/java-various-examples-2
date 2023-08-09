package concessionaria;

public class Apecar extends Veicolo {
	
	public Apecar() {
		
	}
	
	public Apecar(String nome, String modello, double prezzo, int cilindrata) {
		super(nome, modello, prezzo, cilindrata);
	}
	
	public String toString() {
		return super.toString() + "\n";
	}
	
	
	@Override
	public void acceleraVeicolo() {
		if(chilometriorari >= 80) {
			System.out.println("L'Apecar non può accelerare più di così");
		} else {
			chilometriorari = chilometriorari + 10;
			System.out.println("L'Apecar accelera e va a una velocità di " + chilometriorari + " KmH");
		}
	}
	
	@Override
	public void deceleraVeicolo() {
		if(chilometriorari <= 0) {
			System.out.println("L'Apecar è Ferma, non puoi decelerare");
		} 
		if (chilometriorari >= 10){
			chilometriorari = chilometriorari - 10;
			if (chilometriorari != 0) {
				System.out.println("L'Apecar decelera e va a una velocità di " + chilometriorari + " KmH");
			} else {
				System.out.println("L'Apecar si è Fermata");
			}
		}
	}
}
