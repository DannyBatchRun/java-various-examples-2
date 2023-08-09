package automobili;

public class TestAutomobile {

	public static void main(String[] args) {
		
		Automobile autoUno;
		
		autoUno = new Automobile();
		
		autoUno.setModello("iX M60");
		autoUno.setMarca("BMW");
		autoUno.setCilindrata(20000);
		
		if (autoUno.getCilindrata() > 0) {
			System.out.println("Marca Automobile : " + autoUno.getMarca() + ", Modello " + autoUno.getModello() + ", con cilindrata " + autoUno.getCilindrata());
		}
		
		Automobile autoDue = new Automobile("Super 2000", "Alfa Romeo", 20000);
		
		if (autoDue.getCilindrata() > 0) {
			System.out.println("Marca Automobile : " + autoDue.getMarca() + ", Modello " + autoDue.getModello() + ", con cilindrata " + autoDue.getCilindrata());
		}
		
		Automobile autoTre = new Automobile("Daewoo", "Matiz", 30000);
		
		if (autoTre.getCilindrata() > 0) {
			System.out.println(autoTre);
		}

	}

}
