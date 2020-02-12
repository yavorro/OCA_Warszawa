package p25_listy;

import java.util.ArrayList;
import java.util.List;

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
		
		lista.forEach(s -> System.out.print(s + ", "));
		
		List<String> lista1 = (List<String>)lista.clone();
		System.out.println(lista1);
		// predykat; operacja usuwa z listy wszystkie spełaniające warunek
		lista1.removeIf(s -> s.length() <= 3);
		System.out.println(lista1);
		System.out.println();
		
		List<String> lista2 = (List<String>)lista.clone();
		System.out.println(lista2);
		lista2.replaceAll(s -> s.toUpperCase()); // lambda expression
		// lista2.replaceAll(String::toUpperCase);  // method reference - w tym przypadku równoważnie
		System.out.println(lista2);
		System.out.println();
	}

}
