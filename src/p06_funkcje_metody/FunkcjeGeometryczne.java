package p06_funkcje_metody;

public class FunkcjeGeometryczne {
	
	public static double poleKwadratu(double a) {
		return a*a;
	}
	
	static double poleProstokata(double a, double b) {
		return a*b;
	}

	public static void main(String[] args) {
		// Gdy jestem w tej samej klasie, mogę wywołać metoidy z tej klasy po prostu po nazwie.
		double wynik1 = poleKwadratu(5);
		System.out.println(wynik1);
		double wynik2 = poleKwadratu(7.5);
		System.out.println(wynik2);
		
		System.out.println(poleKwadratu(3.3));
		System.out.println(poleProstokata(4, 5));

		// Tu nie ma takiej potrzeby, ale mogę wywołać metodę statyczną poprzez nazwę klasy
		System.out.println(FunkcjeGeometryczne.poleProstokata(4, 5));
	}

}
