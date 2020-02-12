package p25_listy;

import java.util.ArrayList;
import java.util.List;

public class ListaLiczb {

	public static void main(String[] args) {
		
		List<Integer> lista = new ArrayList<>();
		lista.add(5);
		lista.add(6);
		lista.add(7);
		lista.add(8);
		lista.add(9);
		lista.add(10);
		System.out.println(lista);
		System.out.println("rozmiar: " + lista.size());
		
//		if(lista.remove(5)) {			
//		}
		
		Integer element = lista.remove(5); // wg indeksu
		
		System.out.println("Usunięty element: " + element);
		System.out.println(lista);
		
		// boolean b = lista.remove((Integer)5); // też jest OK, wg wartości
		boolean b = lista.remove((Object)5); // wg wartości
		System.out.println("Czy usunięto? " + b);
		System.out.println(lista);
	}

}
