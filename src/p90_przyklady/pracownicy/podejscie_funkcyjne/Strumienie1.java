package p90_przyklady.pracownicy.podejscie_funkcyjne;

import java.util.List;
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import p90_przyklady.pracownicy.Employee;
import p90_przyklady.pracownicy.ObslugaCSV;

public class Strumienie1 {

	public static void main(String[] args) {
		List<Employee> lista = ObslugaCSV.wczytajDaneScanner("pracownicy.csv");
		
		// z kolekcji można pobrać strumień i na nim wykonywać różne operacje
		lista.stream().forEach(emp -> System.out.println(" * " + emp.getFirstName() + " " + emp.getLastName()));
		System.out.println();
		
		// sama lista (każda kolekcja) też posiada metodę forEach
		lista.forEach(emp -> System.out.println(" - " + emp.getFirstName() + " " + emp.getLastName()));
		System.out.println();
		
		lista.stream()
			.filter(emp -> emp.getSalary() >= 10000)
			.forEach(emp -> System.out.println(" > " + emp.getFirstName() + " " + emp.getLastName() + " " + emp.getSalary()));
		System.out.println();
			

		lista.stream()
			.filter(emp -> emp.getSalary() < 4000)
			.map(emp -> " < " + emp.getFirstName() + " " + emp.getLastName() + " " + emp.getSalary())
			.forEach(System.out::println);
		System.out.println();

		// Chcę utworzyć zbiór wszystkich miast (bez powtórzeń)
		
		Set<String> miasta = lista.stream()
			.map(Employee::getCity)
			.filter(s -> !s.isEmpty())
			.collect(Collectors.toSet());
		System.out.println(miasta);
	}

}
