package p08_klasy.v5;

public class Konto {
	int numer;
	int saldo;
	Osoba wlasciciel;
	
	public Konto(int numer, int saldo, Osoba wlasciciel) {
		this.numer = numer;
		this.saldo = saldo;
		this.wlasciciel = wlasciciel;
	}

	@Override
	public String toString() {
		return "Konto nr " + numer + ", " + saldo + ", wł. " + wlasciciel;
	}
	
	public void wplata(int kwota) {
		saldo += kwota;
	}

	public void wyplata(int kwota) {
		saldo -= kwota;
	}

}
