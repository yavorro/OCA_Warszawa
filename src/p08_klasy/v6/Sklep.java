package p08_klasy.v6;

public class Sklep {

	public static void zakupy(Osoba klient) {
		String towar = klient.wiek >= 18 ? "piwo" : "cukierki";
		System.out.println(klient.imie + " kupuje " + towar);
	}

}
