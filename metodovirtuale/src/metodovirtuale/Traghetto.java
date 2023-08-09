package metodovirtuale;

public class Traghetto implements NavigaMotore {
	
	private String nome;
	private int grandezza;
	private int cilindrata;
	
	public Traghetto() {
		
	}
	
	public Traghetto(String nome, int grandezza, int cilindrata) {
		this.nome = nome;
		this.grandezza = grandezza;
		this.cilindrata = cilindrata;
	}
	
	@Override
	public String toString() {
		return "[Traghetto " + this.nome + " con grandezza di " + this.grandezza + " cm e con " + this.cilindrata + " di Cilindrata.]";
	}

	public String getNome() {
		return nome;
	}

	public int getGrandezza() {
		return grandezza;
	}

	public int getCilindrata() {
		return cilindrata;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setGrandezza(int grandezza) {
		this.grandezza = grandezza;
	}

	public void setCilindrata(int cilindrata) {
		this.cilindrata = cilindrata;
	}

	@Override
	public void accendi() {
		System.out.println("Il Traghetto " + this.nome + " si è acceso correttamente. Si parte!");
	}

	@Override
	public void spegni() {
		System.out.println("Il Traghetto " + this.nome + " è appena attraccato. Benvenuti ad Ischia!");
	}

	@Override
	public void accelera() {
		System.out.println("Il Traghetto " + this.nome + " sta accelerando. Sta arrivando un brutto tempo!");
	}

	@Override
	public void decelera() {
		System.out.println("Il Traghetto " + this.nome + " sta decelerando. Il Mare è troppo agitato!");
	}

}
