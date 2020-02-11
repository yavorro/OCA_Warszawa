package p08_klasy.v5;

public class Student extends Osoba {
	// podklasa "dziedziczy" z nadklasy zmienne i metody
	
	// i może definiować własne:
	int rok;
	String kierunek;
	
	double sredniaOcen() {
		return 4.5;
	}
	
}
