package p08_klasy.v0;

public class Przyklad1 {

	public static void main(String[] args) {
		// Dzięki temu, że posiadam klasę Osoba, mogę:
		// 1) deklarować zmienne typu Osoba
		Osoba a;
		
		// tu jeszcze nie ma obiektu
		
		// w tym momencie zmienna a jest niezainicjowana, nie mogę jej czytać
		//NK System.out.println(a);
		
		// 2) tworzyć obiekty ("instancje") tej klasy:
		a = new Osoba();
		
		System.out.println(a);
		
		// dla każdego obiektu w Javie (nawet gdy jest on obiektem pustej klasy)
		// są dostępne pewne operacje:
		
		String s = a.toString();
		System.out.println(s);
		
		// hashCode pełni rolę indentyfikatora, albo "skrótu" dla obiektu
		// domyślnie (dopóki nie nadpiszemy) jest generowany na podstawie adresu obiektu w pamięci JVM
		int h = a.hashCode();
		System.out.println(h);
		System.out.println(Integer.toHexString(h));
		
		boolean eq = a.equals(a);
		System.out.println(eq);
		
		Class<?> klasa = a.getClass();
		System.out.println("Obiekt jest klasy " + klasa);
		
		// metody związane z wątkami i synchronizacją
		//a.wait();
		//a.notify();
		//a.notifyAll();
		
	}

}
