package p08_klasy.v6;

public class Pracownik extends Osoba {
	String zawod;
	double pensja;

	public Pracownik() {
		super();
	}
	
	public Pracownik(String imie, String nazwisko, int wiek, String zawod, double pensja) {
		super(imie, nazwisko, wiek);
		this.zawod = zawod;
		this.pensja = pensja;
	}
	
	void pracuj(int ileGodzin) {
		if(ileGodzin > 8) {
			System.out.println("Popracuję, ale zapłać mi za nadgodziny");
		} else {
			System.out.println("OK, grzecznie pracuję " + ileGodzin + " godzin");
		}
	}
	
	@Override
	void przedstawSie() {
		System.out.println("Pracuję jako " + zawod + " i zarabiam " + pensja);
	}
	
	@Override
	public String toString() {
		return super.toString() + ", " + zawod + " z pensją " + pensja;
	}
}
