package p08_klasy.v6;

public class Student extends Osoba {
	// podklasa "dziedziczy" z nadklasy zmienne i metody
	
	// i może definiować własne:
	int rok;
	String kierunek;
	
	// nie ma dziedziczenia konstruktorów, ale powszechną praktyką jest
	// definiowanie konstruktora na bazie konstruktora z nadklasy
	// super(?, ?, ?) oznacza wywołanie konstruktora z nadklasy
	
	Student() {
		
	}
	
	Student(String imie, String nazwisko, int wiek, int rok, String kierunek) {
		super(imie, nazwisko, wiek);
		this.rok = rok;
		this.kierunek = kierunek;
	}
	
	// podklasa nie zmienia metody jestPelnoletnia
	// studenci będą mieli takie samo działanie tej metody jak każda Osoba
	
	// podklasa może dodać zuepełnie nową metodę, której nie było w nadklasie:
	// tylko studenci mają śrdnia ocen, a inne osoby nie
	double sredniaOcen() {
		return 4.5;
	}
	
	// podklasa może nadpisać (override) metodę, która była już zdefiniowana w nadklasie
	// metoda przedstawSie jest dostepna dla wszystkoch osób,
	// ale dla studentów będzie działać inaczej niż dla pozostałych osób
	void przedstawSie() {
		System.out.println("Jestem Studentem kierunku " + kierunek + " a nazywam się " + imie + " " + nazwisko);
	}

	
}
