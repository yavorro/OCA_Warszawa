package p08_klasy.v6;

public class Przyklad5 {

	public static void main(String[] args) {
		Osoba osoba = new Osoba();
		osoba.imie = "Ala";
		osoba.nazwisko = "Kowalka";
		osoba.wiek = 30;
		
		System.out.println(osoba.imie);
		osoba.przedstawSie();
		System.out.println();
		
		Student student = new Student();
		// obiekt podklasy (Student) posiada wszystkie te zmienne i metody, które posiada nadklasa (Osoba)
		student.imie = "Jan";
		student.nazwisko = "Kowalski";
		student.wiek = 22;
		
		// a oprócz tego posiada dodatkowe zmienne i metody, dodefiniowane w podklasie

		student.kierunek = "biologia";
		student.rok = 3;
		
		System.out.println(student.imie + " " + student.kierunek);
		student.przedstawSie();
		
		System.out.println("średnia " + student.sredniaOcen());
		
	}

}
