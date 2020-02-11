package p08_klasy.v5;

public class Osoba {
	String imie, nazwisko;
	int wiek;
	
	Osoba() {
		
	}

	Osoba(String imie, String nazwisko, int wiek) {
		this.imie = imie;
		this.nazwisko = nazwisko;
		this.wiek = wiek;
	}

	
	void przedstawSie() {
		System.out.println("Nazywam się " + imie + " " + nazwisko + " i mam " + wiek + " lat.");
	}
	
	public String toString() {
		return imie + " " + nazwisko + " (" + wiek + " l.)";
	}
	
}
