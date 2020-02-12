package p25_listy;

import java.util.ListIterator;
import java.util.LinkedList;
import java.util.List;

public class IteratoryListowe {

	// Iteratory wciąż mogą się przydać, najbardziej gdy używamy klasy LinkedList,
	// bo w niej nie ma "random access" i właśnie za pomocą iteratora możemy 
	// przeglądać listę i ją modyfikować "w locie"
	public static void main(String[] args) {
		List<String> lista = new LinkedList<>();
		lista.add("ala");
		lista.add("ola");
		lista.add("ela");
		lista.add("ula");
		System.out.println("Na początku: " + lista);
		
		ListIterator<String> it = lista.listIterator();
		
		while(it.hasNext()) {
			String element = it.next();
			System.out.println(element);
			if("ela".equals(element)) {
				it.remove();
				it.add("maja");
				it.add("gucio");
			} else if("ola".equals(element)) {
				it.set("Aleksandra");
			}
		}
		
		System.out.println("Na koniec: " + lista);
	}
}
