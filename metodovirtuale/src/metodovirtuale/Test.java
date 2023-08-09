package metodovirtuale;

public class Test {
	
	public static void main(String[] args) {
		
		//Questa è una chiamata al metodo Virtuale, perchè Java penserà di puntare al metodo dell'interfaccia NavigaMotore
		//ma in realtà, punterà sulla classe di Traghetto o di Aliscafo. E' impossibile istanziare un interfaccia, in quanto non ha
		//corpo. In questo caso, non posso scrivere una cosa del genere :
		
		//NavigaMotore tragBlaBla = new NavigaMotore("Alisca", 200, 200);
		
		NavigaMotore tragUno = new Traghetto("Medmid", 200, 2000);
		Aliscafo aliscUno = new Aliscafo("Alileud", 200, 3000);
		
		//In questo caso qua, io non posso fare la chiamata virtuale, perchè la classe BarcaRemi non sta implementando
		//alcuna interfaccia.
		
		BarcaRemi barcUno = new BarcaRemi("Pinocchius", 2, 200, 200);
		
		System.out.println(tragUno);
		System.out.println(aliscUno);
		System.out.println(barcUno);
		
		//Mi chiamo i metodi dell'Interfaccia NavigaMotore. In questo caso, Java punterà all'interfaccia di NavigaMotore
		//ma poi andrà sulla classe Traghetto, sostituendolo (Override) *Polimorfismo per Dati*
		
		tragUno.accendi();
		tragUno.spegni();
		tragUno.accelera();
		tragUno.decelera();
		
		//Stessa situazione, la faccio anche per aliscafo. Ma qui cambia, perchè non sto facendo una chiamata virtuale,
		//dato che l'oggetto aliscUno punta direttamente alla classe, e non all'interfaccia (pur implementandola). Nel caso
		//volessi fare una chiamata Virtuale, avrei messo "NavigaMotore".
		
		aliscUno.accendi();
		aliscUno.spegni();
		aliscUno.accelera();
		aliscUno.decelera();
	
		
		
		
		
		
	}
}
