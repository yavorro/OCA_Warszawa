package p32_streamy.a2_przeglad_operacji;

import java.time.LocalTime;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public class Strumienie4_Generowanie {
	static int licznikStatyczny = 0;

	public static void main(String[] args) {
		Stream<String> str0 = Stream.empty();
		str0.forEach(s -> System.out.print(s + ", "));
		System.out.println();
		
		Stream<String> str1 = Stream.of("Ala", "Ola", "Ela");
		str1.forEach(s -> System.out.print(s + ", "));
		System.out.println();
		
		String[] tablica = {"Ala", "Ola", "Ula"};
		Stream<String> str2 = Stream.of(tablica);
		str2.forEach(s -> System.out.print(s + "; "));
		System.out.println();

		Stream.Builder<String> builder = Stream.builder();
		Stream<String> str3 = builder.add("Ula").add("Ala").add("Ola").build();
		str3.forEach(s -> System.out.print(s + ", "));
		System.out.println();
		System.out.println();
		
		// Kolejny element strumienia generowany "bezkontekstowo" (bez żanego parametru)

		Stream<LocalTime> czasy = Stream.generate(() -> LocalTime.now()); 
		Stream<LocalTime> czasy2 = Stream.generate(LocalTime::now);
		// to się zapętla:
		// czasy.forEach(lt -> System.out.println(lt));
		
		czasy.limit(20).forEach(lt -> System.out.println(lt));
		
		//EXN czasy.limit(30).forEach(lt -> System.out.println(lt));
		System.out.println();
		
		// int licznikLokalny = 0;
		
		int suma = IntStream.generate(() -> ++licznikStatyczny)
			.filter(x -> x%2 == 1)
			.limit(8)
			.sum();
		System.out.println(suma);


		// Kolejny element generowany na podstawie poprzedniego

		Stream<String> str4 = Stream.iterate("", s -> s + "*");
		// też nieskończony
		str4.limit(10).forEach(System.out::println);
		System.out.println();		

		int suma2 = IntStream.iterate(1, x -> x+2)
			.limit(8)
			.sum();
		System.out.println(suma2);
		System.out.println();

		IntStream.iterate(1, x -> x+2).limit(10).forEach(System.out::println);
		System.out.println();
		
		LongStream.iterate(1, x -> 2*x).limit(65).forEach(System.out::println);
		System.out.println();
		
		Stream<String> str11 = Stream.of("Ala", "Ola", "Ela");
		Stream<String> str12 = Stream.of("Adam", "Ludwik", "Ksawery");
		Stream<String> razem = Stream.concat(str11, str12);
		razem.forEach(s -> System.out.print(s + ", "));
		System.out.println();
	}

}
