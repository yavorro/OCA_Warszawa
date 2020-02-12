package p90_przyklady.pracownicy;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Stream;

// To jest przykład tzw. klasy narzędziowej (utility class).
// W takiej klasie nie ma getterów i setterów.
// W typowej aplikacji jest tworzony jeden obiekt takiej klasy (podejście zwane "singleton"),
// albo w ogóle nie jest tworzony żaden obiekt (podejście z metodami statycznymi - tak jak tutaj).

public class ObslugaCSV {
	public static List<Employee> wczytajDaneScanner(String nazwaPliku) {
		List<Employee> lista = new ArrayList<>();
		
		try(Scanner sc = new Scanner(new File(nazwaPliku))) {
			while(sc.hasNextLine()) {
				String linia = sc.nextLine();
				String[] fragmenty = linia.split(";", 11);
				Employee emp = new Employee(Integer.parseInt(fragmenty[0]),
						fragmenty[1], fragmenty[2], fragmenty[3],
						Integer.parseInt(fragmenty[4]), LocalDate.parse(fragmenty[5]),
						fragmenty[6], fragmenty[7], fragmenty[8], fragmenty[9], fragmenty[10]);

				lista.add(emp);
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		return lista;
	}
	
	private static Employee linia2Pracownik(String linia) {
		String[] fragmenty = linia.split(";", 11);
		return new Employee(Integer.parseInt(fragmenty[0]),
				fragmenty[1], fragmenty[2], fragmenty[3],
				Integer.parseInt(fragmenty[4]), LocalDate.parse(fragmenty[5]),
				fragmenty[6], fragmenty[7], fragmenty[8], fragmenty[9], fragmenty[10]);
	}
	
	public static Stream<Employee> wczytajDaneStream(String nazwaPliku) throws IOException {
		return Files.lines(Paths.get(nazwaPliku))
			.map(ObslugaCSV::linia2Pracownik);
	}
	
}
