package p32_streamy.a2_przeglad_operacji;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.text.Collator;
import java.util.Random;
import java.util.stream.Stream;

public class Strumienie8_ZRoznychKlas {

	public static void main(String[] args) {

		Random random = new Random();
		// nieskończony strumień losowych intów
		random.ints();
		random.ints().limit(100).forEach(System.out::println);
		System.out.println();
		
		//random.doubles();

		int suma = random.ints(100, 0, 1000).sum();
		System.out.println(suma);
		System.out.println();
		try {
			// operacja "imperatywna":
			// List<String> wczytaneLinie = Files.readAllLines(path);
			
			// dostęp strumieniowy
			// strumienie też można zamykać; ten należy zamykać
			try(Stream<String> lines = Files.lines(Paths.get("pan-tadeusz.txt"))) {
				lines.filter(s -> s.contains("Tadeusz"))
					.sorted(Collator.getInstance())
					.forEachOrdered(System.out::println);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println();
		
		Path dir = Paths.get("src");
		try {
			Files.list(dir)
				.forEach(f -> System.out.println(f + " " + Files.isRegularFile(f)));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
