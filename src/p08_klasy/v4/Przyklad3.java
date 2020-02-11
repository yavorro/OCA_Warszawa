package p08_klasy.v4;

public class Przyklad3 {

	public static void main(String[] args) {
		Osoba ala = new Osoba("Ala", "Kowalska", 30);
		Konto konto = new Konto(1, 1000, ala);
		
		System.out.println(konto);

		konto.wplata(500);
		System.out.println(konto);

	}

}
