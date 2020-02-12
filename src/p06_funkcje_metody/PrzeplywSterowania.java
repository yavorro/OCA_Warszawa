package p06_funkcje_metody;


public class PrzeplywSterowania {

	public static void main() {
		System.out.println("To nie jest prawdziwy main");
	}
	
	static void metodaKtorejNiktNieWola() {
		System.out.println("To się nigdzie nie wypisze");
	}
	
	// Przed nazwą metody trzeba podać typ wyniku.
	// Metoda może nie zwracać żandego wyniku - wówczas "jest typu void".
	static void ala() {
		System.out.println("Ala ma kota");
	}
	
	// Jeśli jest podany typ wyniku (nie void), to metoda MUSI zwrócić wynik tego typu.
	static String ela() {
		wypisz("Ela ma chomika", 2);
		return "chomika";
	}
	
	// Jeśli metoda ma zwrócić wynik, to w każdej sytuacji musi zrobić albo return, albo throw.	
	static int wiekszaLiczba(int x, int y) {
		if(x > y) {
			return x;
		} else {
			return y;
		}
	}
	
	public static void main(String[] args) {
		System.out.println("Początek programu");
		
		ala();
		ala();
		System.out.println();
		
		wypisz("Ola ma psa", 3);
		
		// metodę, która zwraca wynik, mogę wywołać nie odczytując tego wyniku
		ela();
		
		// można też taki wynik odczytać
		String wynik = ela();
		System.out.println("Co ma Ela? " + wynik);
		
		System.out.println("Koniec programu");
	}
	
	static void wypisz(String tekst, int ileRazy) {
		System.out.println("---------");
		for(int i = 0; i < ileRazy; i++) {
			System.out.println(tekst);
		}
		System.out.println("---------\n");
	}

}
