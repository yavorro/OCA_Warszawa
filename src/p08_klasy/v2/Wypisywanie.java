package p08_klasy.v2;

public class Wypisywanie {

	public static void main(String[] args) {
		Osoba osoba = new Osoba("Ola", "Malinowska", 22);
		
		System.out.println(osoba);
		
		// wszystkie te sposoby pobrania tekstu w środku wywołują metodę toString() na obiekcie
		
		String s;
		s = osoba.toString();
		System.out.println(s);
		
		s = "" + osoba;
		System.out.println(s);
		
		s = String.valueOf(osoba);
		System.out.println(s);
		
	}

}
