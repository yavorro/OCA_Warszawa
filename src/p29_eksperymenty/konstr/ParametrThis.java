package p29_eksperymenty.konstr;

public class ParametrThis {
	private String x = "XXX";
	
	// można jawnie wpisać parametr this jako pierwszy paramatr metody instancyjnej
	public void metoda(ParametrThis this, int inny) {
		System.out.println(this.x + " " + inny);
	}

	public static void main(String[] args) {
		ParametrThis o = new ParametrThis();
		o.metoda(15);
	}

}
