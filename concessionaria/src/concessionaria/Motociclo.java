package concessionaria;

public class Motociclo extends Veicolo {
	
	
	public Motociclo() {
		
	}
	
	public Motociclo(String nome, String modello, double prezzo, int cilindrata) {
		super(nome, modello, prezzo, cilindrata);
	}
	
	public String toString() {
		return super.toString() + "\n";
	}
	
	@Override
	public void acceleraVeicolo() {
		if(chilometriorari >= 110) {
			System.out.println("La Moto non pu� accelerare pi� di cos�");
		} else {
			chilometriorari += 10;
			System.out.println("La Moto accelera e va a una velocit� di " + chilometriorari + " KmH");
		}
	}
	
	@Override
	public void deceleraVeicolo() {
		if(chilometriorari <= 0) {
			System.out.println("La Moto � Ferma, non puoi decelerare");
		} 
		
		if (chilometriorari >= 10){
			chilometriorari -= 10;
			if (chilometriorari != 0) {
				System.out.println("La Moto decelera e va a una velocit� di " + chilometriorari + " KmH");
			} else {
				System.out.println("La Moto si � fermata");
			}
		}
	}

}
