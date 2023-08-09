package metodovirtuale;

public class Aliscafo implements NavigaMotore {
	
	private String nome;
	private int grandezza;
	private int cilindrata;
	
	public Aliscafo() {
		
	}
	
	public Aliscafo(String nome, int grandezza, int cilindrata) {
		this.nome = nome;
		this.grandezza = grandezza;
		this.cilindrata = cilindrata;
	}
	
	@Override
	public String toString() {
		return "[Aliscafo " + this.nome + " con grandezza di " + this.grandezza + " cm e con " + this.cilindrata + " di Cilindrata.]";
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
		System.out.println("L'Aliscafo " + this.nome + " è acceso. Si parte verso l'infinito ed oltre!");
	}

	@Override
	public void spegni() {
		System.out.println("L'Aliscafo " + this.nome + " si è spento. Benvenuti a Capri!");
	}

	@Override
	public void accelera() {
		System.out.println("L'Aliscafo " + this.nome + " sta accelerando. E' veloce come un fulmine!");
	}

	@Override
	public void decelera() {
		System.out.println("L'Aliscafo " + this.nome + " sta decelerando. Hai fatto bene, altrimenti andavamo contro uno scoglio!");
	}

	
}
