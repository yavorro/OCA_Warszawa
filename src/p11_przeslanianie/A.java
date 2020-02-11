package p11_przeslanianie;

public class A {
	static String zmienna_statyczna = "zmienna statyczna A";
	
	String zmienna_instancyjna = "zmienna instancyjna A";
	
	static String metoda_statyczna() {
		return "metoda statyczna A";
	}

	String metoda_instancyjna() {
		return "metoda instancyjna A";
	}
	
	void wypiszA() {
		System.out.println(zmienna_instancyjna);
	}
	

}
