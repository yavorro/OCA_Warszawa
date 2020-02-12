package p25_listy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class PrzykladyList {

	public static void main(String[] args) {
		// też OK: ArrayList<String> lista = new ArrayList<>();
		
		List<String> lista = new ArrayList<>();
		
		System.out.println(lista);
		// dodaje na koniec
		lista.add("ola");
		lista.add("ala");

		boolean coSieStalo = lista.add("ela");
		System.out.println(coSieStalo);
		if(lista.add("iza")) {
			System.out.println("Iza też");
		}
		
		System.out.println(lista);
		
		System.out.println();
		// odczyt z określonej pozycji, numeracja od 0 jak w tablicach
		String x = lista.get(0);
		System.out.println(x);
		x = lista.get(2);
		System.out.println(x);
		
		// dodaje na okreslona pozycje, przesuwa dotychczasowe elementy w prawo
		// tu może być od 0 do 4, ale już nie 5 (IOOBExn)
		lista.add(2, "ewa");
		System.out.println(lista);
		
		// nadpisuje element na podanej pozycji nowym elementem
		lista.set(2, "ula");
		System.out.println(lista);
		System.out.println();
		
		lista.add("ala");
		lista.add(0, "ala");
		System.out.println(lista);

		// usuwa z określonej pozycji, zwraca obiekt
		String wynik = lista.remove(2);
		System.out.println("usunąłem element : " + wynik);
		System.out.println(lista);
		
		// to by usunęło od razu wszystkie wystąpienia elementu "ala"
		//lista.removeAll(Collections.singleton("ala"));
		
		// to usuwa pierwsze wystąpienie, wynik booblean mówi czy element został usunięty
		boolean b = lista.remove("ala");
		System.out.println("bool : " + b); // T
		System.out.println(lista);

		b = lista.remove("ala");
		System.out.println("bool : " + b); // T
		System.out.println(lista);

		b = lista.remove("ala");
		System.out.println("bool : " + b); // F
		System.out.println(lista);
		
		// usuwa wszystie wystąpienia wszystkich elementów z podanej kolekcji
		// lista.removeAll(innaKolekcja);
		// przykładowo: usuwa wszystkie "ala"
		// lista.removeAll(Collections.singleton("ala"));
		// albo tak: też zadziała, ale będzie mniej wydajne, bo szukanie elementu będzie wielokrotnie rozpoczynane od początku listy
		// while(lista.remove("ala"));
		
		// wyniku można nie odczytywać...
		lista.remove("ewa");
		System.out.println(lista);
		
		System.out.println();
		lista.addAll(Arrays.asList("ola", "ela", "ewa", "kasia", "marysia", "aga"));
		System.out.println(lista);
		
		Collections.sort(lista);
		System.out.println(lista);
		
		for(String s : lista) {
			System.out.println("Kolejny element: " + s);
		}
		System.out.println();

		System.out.println("indexOf kasia: " + lista.indexOf("kasia"));
		System.out.println("indexOf tomek: " + lista.indexOf("tomek"));
	}
}
