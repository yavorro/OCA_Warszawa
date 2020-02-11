package p08_klasy.v6;

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
		System.out.println("Jestem Osobą, zazywam się " + imie + " " + nazwisko + " i mam " + wiek + " lat.");
	}
	
	public String toString() {
		return imie + " " + nazwisko + " (" + wiek + " l.)";
	}
	
	boolean jestPelnoletnia() {
		return wiek >= 18;
	}
	
	
}
