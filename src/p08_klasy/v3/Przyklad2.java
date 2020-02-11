package p08_klasy.v3;

public class Przyklad2 {

	public static void main(String[] args) {
		// gdy definiuję obiekt nie podając jego danych
		Osoba a = new Osoba();

		// a dopiero później chcę wpisywać dane (przypisaniem albo setterem)
		a.imie = "Ala";
		
		// to po pierwsze jest dużo pisania
		// po drugie obiekt, który już istnieje w aplikacji, może jeszcze nie być w pełni zainicjowany
		// czyli może nie być "gotowy do pracy"
		a.przedstawSie();
	
		// rozwiązanie: własny konstruktor, który ustawia wszystkie dane w obiekcie
		
		Osoba b = new Osoba("Ola", "Malinowska", 22);
		b.przedstawSie();
		
	}

}
