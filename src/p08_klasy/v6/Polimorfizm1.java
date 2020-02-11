package p08_klasy.v6;

public class Polimorfizm1 {

	public static void main(String[] args) {

		Osoba osoba = new Osoba("Ala", "Kowalska", 30);
				
		Student student = new Student("Adam", "Nowacki", 20, 2, "mechanika");
		
		// Ważne jest nie tylko to, że student odziedziczył zmienne z klasy Osoba,
		// ale też to że Student JEST Osobą.
		
		Osoba ktos = student;
		ktos.przedstawSie();
		
		// nie każda osoba jest studentem
		//NK Student x = osoba;
		
		// obiektu typu Student można użyć wszędzie tam, gdzie oczekiwany jest obiekt typu Osoba
		
		// np. Student może zrobić zakupy
		Sklep.zakupy(osoba);
		Sklep.zakupy(student);
		
		// student może być właścicielem konta
		Konto k1 = new Konto(1, 1000, osoba);
		Konto k2 = new Konto(2, 2000, student);
		
		System.out.println(k1);
		System.out.println(k2);
		System.out.println();

		osoba.przedstawSie();
		student.przedstawSie();
		System.out.println();
		
		// o tym, która wersja metody się wykona (czy z nadklasy, czy z podklasy)
		// nie decyduje typ zmiennej, tylko faktyczna klasa obiektu na stercie
		ktos = osoba;
		ktos.przedstawSie();
		
		ktos = student;
		ktos.przedstawSie();
		
		// zmienna ktos jest typu Osoba, nie ma więc dostepu do pola kierunek
		// System.out.println(ktos.kierunek);
		
		// ale przedstawSie() wypisało nam ten kierunek
		
		
	}

}
