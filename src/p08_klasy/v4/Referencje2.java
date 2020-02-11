package p08_klasy.v4;

public class Referencje2 {

	static void metoda(Konto a, Konto b, Konto c, int x) {
		System.out.println("Początek metody:");
		System.out.println("a: " + a);
		System.out.println("b: " + b);
		System.out.println("c: " + c);
		System.out.println("x: " + x);
		System.out.println();
		
		x += 14;
		a = new Konto(a.numer, a.saldo, a.wlasciciel);
		a.saldo += 24;
		a.wlasciciel.imie = "Alicja";
		
		b.wplata(33);
		
		System.out.println("Koniec metody:");
		System.out.println("a: " + a);
		System.out.println("b: " + b);
		System.out.println("c: " + c);
		System.out.println("x: " + x);
		System.out.println();
	}
	
	public static void main(String[] args) {
		Osoba ala = new Osoba("Ala", "Kowalska", 30);
		Osoba ola = new Osoba("Ola", "Malinowska", 33);
		
		Konto a = new Konto(1, 1000, ala);
		Konto b = new Konto(2, 2000, ola);
		Konto c = b;
		int x = 5000;

		System.out.println("Początek main:");
		System.out.println("a: " + a);
		System.out.println("b: " + b);
		System.out.println("c: " + c);
		System.out.println("x: " + x);
		System.out.println();
		
		metoda(a, b, c, x);
		
		System.out.println("Koniec main:");
		System.out.println("a: " + a);
		System.out.println("b: " + b);
		System.out.println("c: " + c);
		System.out.println("x: " + x);
		
	}

}
