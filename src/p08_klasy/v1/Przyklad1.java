package p08_klasy.v1;

public class Przyklad1 {

	public static void main(String[] args) {
		Osoba a = new Osoba();
		Osoba b = new Osoba();
		
		System.out.println(a);
		System.out.println(b);
		System.out.println();
		
		System.out.println("domyślne wartości zmiennych:");
		System.out.println(a.imie + " " + a.nazwisko + " " + a.wiek);
		System.out.println();
		
		a.imie = "Ala";
		a.nazwisko = "Kowalska";
		a.wiek = 30;
		
		b.imie = "Ola";
		b.nazwisko = "Kowalska";
		b.wiek = 35;
		
		// każdy obiekt ma swoje egzemplarze zmiennych instancyjnych
		System.out.println(a.imie + " " + a.nazwisko + " " + a.wiek);
		System.out.println(b.imie + " " + b.nazwisko + " " + b.wiek);
		System.out.println();
		
		a.przedstawSie();
		b.przedstawSie();
		
		
		// W Javie nie usuwa się obiektów z pamięci - zajmuje się tym JVM, a dokładnie garbage collector
	}

}
