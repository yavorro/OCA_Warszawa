package p20_lambdy;

import java.util.stream.Stream;

public class PrzykladStreamow {

	public static void main(String[] args) {
		String[] imiona = {
				"Ala", "Alicja", "Ola", "Tadeusz", "Marek", "Ewelina", "Ula"
		};
		
		
		Stream.of(imiona)
			.filter(s -> s.endsWith("a"))
			//.map(String::toUpperCase)
			.map(s -> s.toUpperCase())
			.sorted()
			.forEach(s -> System.out.println(" * " + s));
	}

}
