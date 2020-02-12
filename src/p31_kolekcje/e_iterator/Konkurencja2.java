package p31_kolekcje.e_iterator;

import java.util.ArrayList;
import java.util.List;

public class Konkurencja2 {

	public static void main(String[] args) {
		List<String> lista = new ArrayList<>();
		lista.add("Ala");
		lista.add("Ola");
		lista.add("Ela");
		lista.add("Ula");
		System.out.println(lista);
		
		for (String s : lista) {
			System.out.println(s);
			if(s.equals("Ela")) {
				lista.add("Nowy"); // EXN
			}
		}
	}

}
