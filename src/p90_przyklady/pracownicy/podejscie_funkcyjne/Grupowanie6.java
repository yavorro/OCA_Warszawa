package p90_przyklady.pracownicy.podejscie_funkcyjne;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import p90_przyklady.pracownicy.Employee;
import p90_przyklady.pracownicy.ObslugaCSV;

public class Grupowanie6 {
	
	public static void main(String[] args) {
		List<Employee> lista = ObslugaCSV.wczytajDaneScanner("pracownicy.csv");

		// Zasadniczo kolektor groupingBy zbiera obiekty w grupy
		// według podanego kryterium.
		// Kryterium jest funkcja, która jest aplikowana do każdego obiektu.
		Map<String, List<Employee>> grupy = lista.stream().collect(
				Collectors.groupingBy(Employee::getJobTitle));
		
		grupy.forEach((job, grupa) -> {
			System.out.println(job + ":");
			grupa.forEach(emp -> {
				System.out.printf("   * %-12s %-12s %10s\n", emp.getFirstName(), emp.getLastName(), emp.getSalary());
			});
			System.out.println();
		});
	}

}
