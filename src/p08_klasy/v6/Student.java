package p08_klasy.v6;

public class Student extends Osoba {
	// podklasa "dziedziczy" z nadklasy zmienne i metody
	
	// i może definiować własne:
	int rok;
	String kierunek;
	
	double sredniaOcen() {
		return 4.5;
	}
	
}
