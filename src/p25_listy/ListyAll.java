package p25_listy;

import java.util.ArrayList;
import java.util.List;

public class ListyAll {

	public static void main(String[] args) {
		List<String> a = new ArrayList<>();
		a.add("Ala");
		a.add("Ola");
		a.add("Ela");
		a.add("Ula");
		System.out.println(a);
		
		List<String> b = new ArrayList<>(a);
		System.out.println(b);
		
		List<String> c = new ArrayList<>();
		c.add("Ala");
		c.add("Ula");
		System.out.println(c);
		
		System.out.println(a.containsAll(c)); // T
		System.out.println(c.containsAll(a)); // F

		c.add("Basia"); // nie ma w a
		System.out.println("c = " + c);

		boolean czy = a.removeAll(c);
		System.out.println(czy); // T
		
		System.out.println("a = " + a); // usunął Ala i Ula, a nie przejął się Basią
	}
}
