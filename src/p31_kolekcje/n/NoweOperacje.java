package p31_kolekcje.n;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;

public class NoweOperacje {

	public static void main(String[] args) {
		ArrayList<String> lista = new ArrayList<>();
		lista.add("Ala");
		lista.add("Ola");
		lista.add("Kasia");
		lista.add("Ela");
		lista.add("Ula");
		lista.add("Asia");
		lista.add("Zosia");
		
		System.out.println(lista);
		System.out.println();
		
		System.out.print("forEach: ");
		lista.forEach(s -> System.out.print(s + ", "));
		//OK lista.forEach(System.out::println);
		System.out.println();
		System.out.println();
		
		List<String> lista1 = (List<String>)lista.clone();
		System.out.println(lista1);
		// predykat; operacja usuwa z listy wszystkie spełaniające warunek
		lista1.removeIf(s -> s.length() <= 3);
		System.out.println(lista1);
		System.out.println();
		
		List<String> lista2 = (List<String>)lista.clone();
		System.out.println(lista2);
		lista2.replaceAll(String::toUpperCase);
		System.out.println(lista2);
		System.out.println();
				
		
		List<String> lista3 = (List<String>)lista.clone();
		System.out.println(lista3);
		lista3.sort(null);
		System.out.println(lista3);
		System.out.println();
		
		// sort, removeIf, replaceAll modyfikuję TĘ instancję

		TreeMap<String, Integer> map = new TreeMap<>();
		map.put("Ala", 20);
		map.put("Ola", 30);
		System.out.println(map);
		
		map.putIfAbsent("Ala", 25); // nie wpisuje
		map.putIfAbsent("Ela", 45); // wpisuje
		System.out.println(map);
		
		map.replace("Ala", 28); // zamienia
		map.replace("Ula", 48); // nic się nie dzieje
		System.out.println(map);
		
		map.replace("Ala", 40, 41); // jeśli taka była poprzednia wartość - tutaj nic się nie stanie
		System.out.println(map);
		
		map.replaceAll((k, v) -> v+1); // zwiększa wszystkie wartości o 1
		System.out.println(map);

		map.replaceAll((k, v) -> k.startsWith("A") ? v+1 : v); // zwiększa o 1 tylko słowa na literę A
		System.out.println(map);
		
		// dodaje nowy wpis z wartością 10, albo dodaje 10 do istniejącej wartości
		map.merge("Ola", 10, Math::addExact); // (x,y) -> x+y
		map.merge("Ewa", 10, Math::addExact);
		System.out.println(map);
	}

}
