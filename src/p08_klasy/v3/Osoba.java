package p08_klasy.v3;

public class Osoba {
	// zmienne definiowane w klasie (bez słowa static) nazywa się:
	// * pole (field)
	// * atrybut (attribute)
	// * zmienna instancyjna (instance variable)
	String imie, nazwisko;
	int wiek;
	
	// metody, czyli czynności, które będą mogłby wykonać obiekty tej klasy
	// metoda bez "static" jest metodą instancyjną, czyli wyobrażamy sobie, że to obiekty wykonuje metodę
	void przedstawSie() {
		System.out.println("Nazywam się " + imie + " " + nazwisko + " i mam " + wiek + " lat.");
	}
	
	// konstruktory
	Osoba() {
		
	}

	Osoba(String imie, String nazwisko, int wiek) {
		this.imie = imie;
		this.nazwisko = nazwisko;
		this.wiek = wiek;
	}
	
}
