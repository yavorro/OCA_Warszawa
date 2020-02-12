package p90_przyklady.pracownicy.podejscie_funkcyjne;

import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Collectors;

import p90_przyklady.pracownicy.Employee;
import p90_przyklady.pracownicy.ObslugaCSV;

public class Grupowanie8 {
	
	public static void main(String[] args) {
		List<Employee> lista = ObslugaCSV.wczytajDaneScanner("pracownicy.csv");

		// Dodatkowy parametr podawany pośrodku ("mapFactory")
		// pozwala nam wybrać implementację słowników - tutaj tworzymy TreeMap.
		
		Map<String, Double> srednie = lista.stream().collect(
				Collectors.groupingBy(Employee::getJobTitle,
					TreeMap::new,
					Collectors.averagingInt(Employee::getSalary)));
		
		srednie.forEach((job, avg) -> {
			System.out.printf("%32s :%10.2f\n", job, avg);
			
		});
	}

}
